CREATE TABLE pieza(
codigo VARCHAR(6) NOT NULL PRIMARY KEY,
nombre  VARCHAR(20) NOT NULL,
precio FLOAT NOT NULL,
descripcion TEXT
);

CREATE TABLE proveedor(
codigo VARCHAR(6) NOT NULL PRIMARY KEY,
nombre  VARCHAR(20) NOT NULL,
apellido  VARCHAR(30) NOT NULL,
direccion  VARCHAR(40) NOT NULL
);

CREATE TABLE proyecto(
codigo VARCHAR(6) NOT NULL PRIMARY KEY,
nombre  VARCHAR(40) NOT NULL,
ciudad  VARCHAR(40) NOT NULL
);

CREATE TABLE gestor(
codprov VARCHAR(6) NOT NULL,
codpieza VARCHAR(6) NOT NULL,
codproyecto VARCHAR(6) NOT NULL,
cantidad FLOAT,
PRIMARY KEY (codprov, codpieza, codproyecto),
FOREIGN KEY (codprov) REFERENCES proveedor(codigo),
FOREIGN KEY (codpieza) REFERENCES pieza(codigo),
FOREIGN KEY (codproyecto) REFERENCES proyecto(codigo)
);
