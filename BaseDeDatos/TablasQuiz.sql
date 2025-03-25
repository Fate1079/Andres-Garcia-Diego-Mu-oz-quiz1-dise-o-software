USE motocicleta;



CREATE TABLE motoclicleta.users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(64) NOT NULL
);


CREATE TABLE Moto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Marca INT NOT NULL,
    Cilindraje VARCHAR(50) NOT NULL,
    Precio INT NOT NULL,
    Color VARCHAR(50) NOT NULL
);
