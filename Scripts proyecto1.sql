CREATE DATABASE MyPetCR

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

-- Creación del procedimiento almacenado para agregar un usuario
CREATE PROCEDURE AgregarUsuario
    @Nombre NVARCHAR(300),
    @Correo NVARCHAR(150),
    @Password NVARCHAR(15),
    @IdTipo INT
AS
BEGIN
    -- Insertar un nuevo usuario en la tabla USUARIOS
    INSERT INTO USUARIOS (Nombre, Correo, Password, IdTipo)
    VALUES (@Nombre, @Correo, @Password, @IdTipo);
    
    -- Opcional: Devolver el ID del usuario recién insertado
    SELECT SCOPE_IDENTITY() AS IdUsuario;
END
GO

SELECT * FROM TIPOS;
SELECT * FROM USUARIOS;

-- Llamar al procedimiento almacenado para agregar un nuevo usuario
EXEC AgregarUsuario @Nombre = 'Juan Pérez', @Correo = 'juan.perez@example.com', @Password = 'password123', @IdTipo = 1;


-- HACER UN STORE PROCEDURE QUE ME VALIDE SI EL USUARIO ES EXISTENTE
GO
CREATE PROCEDURE ValidarUsuarioExistente
    @Nombre NVARCHAR(300),
    @Password NVARCHAR(15),
    @IdTipo INT
AS
BEGIN
    SET NOCOUNT ON;

    SELECT 1
    FROM USUARIOS
    WHERE Nombre = @Nombre AND Password = @Password AND IdTipo = @IdTipo;
END
GO

CREATE PROCEDURE AgregarUsuarioInicioSesion
    @NombreUsuario NVARCHAR(300),
    @TipoUsuario NVARCHAR(100)
AS
BEGIN
    -- Insertar un nuevo registro de inicio de sesión en la tabla RegistroInicioSesion
    INSERT INTO RegistroInicioSesion (NombreUsuario, TipoUsuario)
    VALUES (@NombreUsuario, @TipoUsuario);
END;

GO
CREATE PROCEDURE CrearCarrito
AS
BEGIN
    IF OBJECT_ID('MyPetCR..#Carrito') IS NULL
    BEGIN
        CREATE TABLE #Carrito
        (
            IdPYS INT,
            Cantidad DECIMAL(10, 2),
            Total DECIMAL(10, 2)
        )
    END
END
GO

CREATE PROCEDURE AgregarACarrito
    @IdPYS INT,
    @Cantidad DECIMAL(10, 2)
AS
BEGIN
    EXEC CrearCarrito

    DECLARE @Total INT
    DECLARE @Precio Decimal(16,6)

    SET @Precio = (SELECT OPYS.Precio FROM OPYS WHERE OPYS.IdPYS = @IdPYS)
    SET @TOTAL = @Precio * @Cantidad

    INSERT INTO #Carrito (IdPYS, Cantidad, Total)
    VALUES (@IdPYS, @Cantidad, @Total)
END

GO
CREATE PROCEDURE EliminarCarrito
AS
BEGIN
    IF OBJECT_ID('MyPetCR..#Carrito') IS NOT NULL
    BEGIN
        DROP TABLE #Carrito
    END
END
GO

EXEC AgregarUsuarioInicioSesion @NombreUsuario = 'UsuarioEjemplo', @TipoUsuario = 'Cliente';


SELECT * FROM USUARIOS;
SELECT * FROM TIPOS;
SELECT * FROM RegistroInicioSesion;