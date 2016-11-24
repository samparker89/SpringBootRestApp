CREATE DATABASE Customers;

USE Customers;

CREATE TABLE Customers (customerId int NOT NULL PRIMARY KEY AUTO_INCREMENT, firstName varchar(255), lastName varchar(255));

CREATE USER customer_user;

GRANT ALL ON Customers.* TO 'customer_user@localhost' IDENTIFIED BY 'password';