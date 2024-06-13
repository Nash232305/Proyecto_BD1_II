cREATE DATABASE MyPetCR

USE MyPetCR

CREATE TABLE TIPOS (
	IdTipo int IDENTITY(1,1), 
	Descripcion NVARCHAR(200)


	CONSTRAINT pk_Tipos_IdTipo PRIMARY KEY (IdTipo)
);


CREATE TABLE USUARIOS (
	IdUsuario int IDENTITY(1,1),
	Nombre NVARCHAR(300) NOT NULL,
	Correo NVARCHAR(150) NOT NULL,
	Password NVARCHAR(15) NOT NULL,
	IdTipo int,

	CONSTRAINT pk_Usuarios_IdUsario PRIMARY KEY (IdUsuario),
	CONSTRAINT fk_usuarios_tipos FOREIGN KEY (IdTipo) REFERENCES TIPOS(IdTipo)
);

Select * from USUARIOS;


CREATE TABLE RegistroInicioSesion (
    IdRegistro int IDENTITY(1,1) PRIMARY KEY,
    NombreUsuario NVARCHAR(300) NOT NULL,
    TipoUsuario NVARCHAR(100) NOT NULL,
    FechaHoraInicioSesion DATETIME NOT NULL DEFAULT GETDATE()
);


CREATE TABLE MASCOTAS (
	IdMascota int IDENTITY(1,1),
	IdUsuario int,
	Nombre NVARCHAR(200) NOT NULL,
	Descripcion NVARCHAR(300),

	CONSTRAINT pk_Mascotas_IdMascota PRIMARY KEY (IdMascota),
	CONSTRAINT fk_mascotas_usuarios FOREIGN KEY (IdUsuario) REFERENCES USUARIOS(IdUsuario)
	
);

CREATE TABLE EXPEDIENTES (
	IdExpediente int IDENTITY(1,1),
	IdMascota int,

	CONSTRAINT pk_Expedientes_IdExpediente PRIMARY KEY (IdExpediente),
	CONSTRAINT fk_expedientes_mascotas FOREIGN KEY (IdMascota) REFERENCES MASCOTAS(IdMascota)
);

CREATE TABLE ESTADOS (
	IdEstado int IDENTITY(1,1),
	Descripcion NVARCHAR(150),

	CONSTRAINT pk_Estados_IdEstado PRIMARY KEY (IdEstado)

);

CREATE TABLE CITAS (
	IdCita int IDENTITY(1,1),
	IdExpediente int,
	FechaHora datetime,
	IdUsuario int,
	IdEstado int,

	CONSTRAINT pk_Citas_IdCita PRIMARY KEY (IdCita),
	CONSTRAINT fk_citas_expedientes FOREIGN KEY (IdExpediente) REFERENCES EXPEDIENTES(IdExpediente),
	CONSTRAINT fk_citas_usuarios FOREIGN KEY (IdUsuario) REFERENCES USUARIOS(IdUsuario),
	CONSTRAINT fk_citas_estados FOREIGN KEY (IdEstado) REFERENCES ESTADOS(IdEstado)
);

CREATE TABLE OPYS (
	IdPYS int IDENTITY(1,1),
	Descripcion NVARCHAR(200) NOT NULL,
	Precio Decimal(16,6) NOT NULL,
	Stock Decimal(16,6),
	
	CONSTRAINT pk_OPYS_IdPYS PRIMARY KEY (IdPYS)
);

CREATE TABLE RESENNAS(
	IdResenna int IDENTITY(1,1),
	IdPYS int,
	Resenna Nvarchar(300),
	Calificacion decimal(5,2),

	CONSTRAINT pk_Resennas_IdResenna PRIMARY KEY (IdResenna),
	CONSTRAINT fk_resennas_opys FOREIGN KEY (IdPYS) REFERENCES OPYS(IdPYS)

);

CREATE TABLE DETALLECITAS (
	IdCita int,
	Linea int,
	IdPYS int,
	Cantidad Decimal(16,6),

	CONSTRAINT pk_Citas PRIMARY KEY (IdCita, Linea),
	CONSTRAINT fk_detallecitas_citas FOREIGN KEY (IdCita) REFERENCES CITAS(IdCita),
	CONSTRAINT fk_detallecitas_opys FOREIGN KEY (IdPYS) REFERENCES OPYS(IdPYS)
);

GO

create PROCEDURE LoginUsuario
    @Correo NVARCHAR(150),
    @Password NVARCHAR(15)
AS
BEGIN
	SET NOCOUNT ON;

    IF EXISTS (SELECT 1 FROM USUARIOS WHERE Correo = @Correo AND Password = @Password)
    BEGIN
        DECLARE @IdUsuario INT = (SELECT IdUsuario FROM USUARIOS WHERE Correo = @Correo AND Password = @Password)

        EXEC AuditLogger @IdUsuario, 5;

        SELECT IdUsuario, idTipo,  Nombre FROM USUARIOS WHERE Correo = @Correo AND Password = @Password;
    END
    
END
GO

create procedure AuditLogger
	@NombreUsuario int,
	@tipoActividad int
AS
BEGIN	
	begin tran
	begin try 

		INSERT INTO AUDIT_LOG(idUsuario, idTipo, FechaHora)
		VALUES (@NombreUsuario, @tipoActividad,GETDATE());

	end try 
	begin catch
		rollback tran

	end catch
END;
GO

CREATE PROCEDURE getInventario
as
begin
	Select IdPYS Cod,Descripcion,Precio,Stock From OPYS Order by IdPYS asc

end;

GO

CREATE PROCEDURE buscarArticulo
	@filtro nvarchar(100)
as 
begin
	SELECT IdPYS Cod,Descripcion,Precio,Stock
	FROM OPYS
	WHERE descripcion LIKE '%' + @filtro + '%' or CONVERT(NVARCHAR(50),IdPYS) LIKE '%' + @filtro + '%'
	ORDER BY IdPYS ASC
end;
go

create procedure getReseña
	@IdPYS int
as 
begin
	Select IdResenna,Resenna,Calificacion from RESENNAS Where IdPYS = @idPYS order by IdResenna asc
end

create procedure agregarReseña
	@Nombre nvarchar(200),
	@Resena nvarchar(300),
	@calificacion decimal(5,2)
as
begin
	begin tran
	begin try 
		declare @IdPYS nvarchar(200) = (select IdPYS from OPYS WHERE Descripcion = @Nombre)
		insert into RESENNAS (IdPYS,Resenna,Calificacion)
		values(@IdPYS,@Resena,@calificacion)
		commit tran

	end try 
	begin catch
		rollback tran

	end catch
	
end
select * From OPYS
SELECT * FROM RESENNAS
exec agregarReseña 'Peine Antipulgas','Esta buenisimo', 1.5


create procedure getNombreArticulo
	@IdPYS int
as
begin
	select Descripcion from OPYS WHERE @IdPYS = IdPYS

end

create procedure getPrecioPorCod
	@cod int
as 
begin
	select precio From OPYS Where IdPYS = @cod
end

CREATE procedure getDescripcionPorCod
	@cod int

as 
begin
	select descripcion From OPYS Where IdPYS = @cod
end



CREATE TABLE PEDIDO(
	id int primary key IDENTITY(1,1) ,
	nombre nvarchar(100),
	monto decimal(21,6),
	direccionEntrega nvarchar(500)
)


CREATE TABLE dbo.DETALLE_PEDIDO(
	idDetalle int primary key IDENTITY(1,1),
	idPedido int foreign key references PEDIDO(id) ,
	producto int ,
	cantidad int 
)

create procedure agregarPedido
	@nombre nvarchar(100),
	@direccion nvarchar(500)
as 
begin

	begin tran 
	begin try 
		Insert into PEDIDO (nombre,direccionEntrega)
		values ( @nombre,@direccion)
		commit tran
	end try 

	begin catch 
		rollback tran
	end catch
	
end


create procedure getUltimoPedido
as
begin
	select top 1 id 
	from PEDIDO
	order by id desc
end


create procedure agregarDetallePedido
	@idPedido int,
	@producto int,
	@cant int
as 
begin
	begin tran 
	begin try 
		Insert into DETALLE_PEDIDO (idPedido,producto,cantidad)
		values (@idPedido,@producto,@cant)
		Update OPYS
		SET Stock = Stock - @cant
		Where @producto = IdPYS
		commit tran
	end try 
	begin catch 
		rollback tran
	end catch
end


create procedure actualizarEncabezado
	@idPedido int
as
begin
	begin tran
	begin try
		declare @total int = (Select sum(D.Cantidad*i.Precio) from DETALLE_PEDIDO D inner join OPYS I ON i.IdPYS = d.Producto Where idPedido = @idPedido Group by idPedido)
		update PEDIDO
		set Monto = @total + 4500
		where id = @idPedido
		commit tran
	end try

	begin catch
		rollback tran
	end catch
end
go


create procedure getClientes

as 
begin
	Select IdUsuario,Nombre ,Correo
	from USUARIOS
	Where IdTipo = 2
	Order by IdUsuario asc
end 

CREATE PROCEDURE agregarUsuario
	@Nombre nvarchar(300),
	@Correo nvarchar(150),
	@Password nvarchar(15)
as 
begin
	begin tran
	begin try 
		Insert into USUARIOS (Nombre,Correo,Password,IdTipo)
		values( @Nombre ,@Correo ,@Password ,2)

		commit tran
	end try

	begin catch
		rollback
	end catch
end

create procedure getNombreClientePorCod
	@IdUsuario int
as
begin
	Select Nombre from USUARIOS where IdUsuario = @IdUsuario
end

create procedure getCorreoClientePorCod
	@IdUsuario int
as
begin
	Select Correo from USUARIOS where IdUsuario = @IdUsuario
end;
go

create procedure getPassClientePorCod
	@IdUsuario int
as
begin
	Select Password from USUARIOS where IdUsuario = @IdUsuario
end;
go

create procedure actualizarUsuario
	@IdUsuario int,
	@Nombre nvarchar(300),
	@Correo nvarchar(150),
	@Pass nvarchar(15)
as 
begin
	begin tran
	begin try
		Update USUARIOS
		SET Nombre = @Nombre,
			Correo = @Correo,
			Password = @Pass
		Where IdUsuario = @IdUsuario
		commit tran

	end try
	begin catch
		rollback tran
	end catch 
end;
go