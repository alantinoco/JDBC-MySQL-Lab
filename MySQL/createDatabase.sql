CREATE DATABASE TheDoctorDB;
USE TheDoctorDB;

CREATE TABLE actors(
    ID int not null AUTO_INCREMENT,
    firstName varchar(50),
    lastName varchar(50),
    PRIMARY KEY(id)
);

INSERT INTO actors(firstName, lastName)
VALUES("William", "Hartnell"),
("Patrick", "Troughton"),
("Jon", "Pertwee"), 
("Tom", "Baker"), 
("Peter", "Davison"), 
("Colin", "Baker"),
("Sylvester", "McCoy"),
("Paul", "McGann"),
("Christopher", "Eccleston"),
("David", "Tennant"),
("Matt", "Smith"),
("Peter", "Capaldi"), 
("Jodie", "Whittaker"),
("Ncuti", "Gatwa");