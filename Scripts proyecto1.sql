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
	
