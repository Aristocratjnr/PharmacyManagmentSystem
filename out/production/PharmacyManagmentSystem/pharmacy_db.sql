CREATE DATABASE pharmacy_db;

USE pharmacy_db;

CREATE TABLE Drugs (
    drugCode VARCHAR(20) PRIMARY KEY,
    name VARCHAR(100),
    description VARCHAR(255),
    stock INT,
    price DOUBLE
);

CREATE TABLE Suppliers (
    supplierId VARCHAR(20) PRIMARY KEY,
    name VARCHAR(100),
    location VARCHAR(100)
);

CREATE TABLE Customers (
    customerId VARCHAR(20) PRIMARY KEY,
    name VARCHAR(100),
    contactInfo VARCHAR(100)
);

CREATE TABLE Purchases (
    purchaseId INT AUTO_INCREMENT PRIMARY KEY,
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    drugCode VARCHAR(20),
    quantity INT,
    totalAmount DOUBLE,
    customerId VARCHAR(20),
    FOREIGN KEY (drugCode) REFERENCES Drugs(drugCode),
    FOREIGN KEY (customerId) REFERENCES Customers(customerId)
);

