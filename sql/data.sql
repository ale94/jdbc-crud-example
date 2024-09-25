CREATE DATABASE jdbc_example;
USE jdbc_example;
CREATE TABLE products (
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	price DOUBLE NOT NULL,
    quantity INT NOT NULL
);