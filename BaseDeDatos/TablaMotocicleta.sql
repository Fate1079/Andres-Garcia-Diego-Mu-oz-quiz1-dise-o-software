USE motoclicleta;



CREATE TABLE Moto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Marca INT NOT NULL,
    Cilindro VARCHAR(50) NOT NULL,
    Precio INT NOT NULL,
    Color VARCHAR(50) NOT NULL
);