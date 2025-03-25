CREATE DATABASE motoclicleta;


USE motocicleta;



CREATE TABLE motoclicleta.users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(64) NOT NULL
);

CREATE TABLE Moto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    STRING Marca,
    STRING cilindraje;
    INT precio;
    STRING color
);