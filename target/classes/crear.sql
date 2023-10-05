CREATE DATABASE vehiculosdb;
USE vehiculosdb;
CREATE TABLE coches (
    id INT AUTO_INCREMENT PRIMARY KEY,
    marca VARCHAR(50),
    modelo VARCHAR(50),
    matricula VARCHAR(50) UNIQUE
);


