/*DELETE IF EXIST at start */
DROP database IF EXISTS dentists;

/* CREATE DATABASE and USE*/
create database dentists;
use dentists;

/* CREATE TABLES: clients - dentists - apoinments */
/*Client(Patient) Table*/
CREATE TABLE clients (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(250) DEFAULT NULL,
  lastname varchar(250) DEFAULT NULL,
  address varchar(250) DEFAULT NULL,
  username varchar(250) DEFAULT NULL,
  password varchar(250) DEFAULT NULL,
  email varchar(250) DEFAULT NULL,
  date_up date DEFAULT NULL,
  PRIMARY KEY (id)
);

/*Dentist(doctor) Table*/
CREATE TABLE dentists (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(250) DEFAULT NULL,
  lastname varchar(250) DEFAULT NULL,
  address varchar(250) DEFAULT NULL,
  email varchar(250) DEFAULT NULL,
  username varchar(250) DEFAULT NULL,
  password varchar(250) DEFAULT NULL,
  date_up date DEFAULT NULL,
  PRIMARY KEY (id)
);

/*Appoinments(citas) Table*/
CREATE TABLE appoinments (
  id int NOT NULL AUTO_INCREMENT,
  date_appoinment date DEFAULT NULL,
  description varchar(250) DEFAULT NULL,
  status varchar(250) DEFAULT NULL,
  client_id int DEFAULT NULL,
  dentist_id int DEFAULT NULL,
  PRIMARY KEY (id),

  CONSTRAINT client_fk FOREIGN KEY (client_id) REFERENCES clients(id) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT dentist_fk FOREIGN KEY (dentist_id) REFERENCES dentists(id) ON DELETE CASCADE ON UPDATE CASCADE
);


/*INSERT DATASET */
/* CLIENTS */
INSERT INTO clients (name, lastname, address, email, username, password, date_up) VALUES ('Ana', 'Lopez', 'Calle del Mar, 1', 'ana@email.com','anaL','12341234', now());
INSERT INTO clients (name, lastname, address, email, username, password, date_up) VALUES ('Juan', 'Martinez', 'Calle de la Fuente, 17', 'juan@email.com','juanM','12341234', now());
INSERT INTO clients (name, lastname, address, email, username, password, date_up) VALUES ('Jordi', 'Ramirez', 'Calle del Ramo, 19', 'jordi@email.com','jordiR','12341234', now());
INSERT INTO clients (name, lastname, address, email, username, password, date_up) VALUES ('Maria', 'Ibanez', 'Calle del Lirio, 15', 'maria@email.com','mariaI','12341234', now());
INSERT INTO clients (name, lastname, address, email, username, password, date_up) VALUES ('Lucia', 'Alvarez', 'Calle de la Luz, 42', 'lucia@email.com','luciaA','12341234', now());

/* DENTISTS */
INSERT INTO dentists (name, lastname, address, email, username, password, date_up) VALUES ('Cristina', 'Lopez', 'Calle del Mar, 56', 'cristina@email.com', 'cristinaL','12341234',now());
INSERT INTO dentists (name, lastname, address, email, username, password, date_up) VALUES ('JuanMa', 'Martinez', 'Calle de la Fuente, 13', 'juanma@email.com', 'juanMa','12341234',now());
INSERT INTO dentists (name, lastname, address, email, username, password, date_up) VALUES ('Alvaro', 'Ramirez', 'Calle del Ramo, 55', 'alvaro@email.com', 'alvaroR','12341234',now());
INSERT INTO dentists (name, lastname, address, email, username, password, date_up) VALUES ('Mariana', 'Ibanez', 'Calle del Lirio, 15', 'mariana@email.com', 'marianaI','12341234',now());
INSERT INTO dentists (name, lastname, address, email, username, password, date_up) VALUES ('Luciana', 'Alvarez', 'Calle de la Luz, 42', 'luciana@email.com', 'lucioanaA','12341234',now());

/* APPOINMENTS */
INSERT INTO appoinments (date_appoinment, client_id, dentist_id) VALUES ('2023-04-20', 1, 2);
INSERT INTO appoinments (date_appoinment, client_id, dentist_id) VALUES ('2023-04-18', 2, 1);
INSERT INTO appoinments (date_appoinment, client_id, dentist_id) VALUES ('2023-04-17', 3, 2);
INSERT INTO appoinments (date_appoinment, client_id, dentist_id) VALUES ('2023-04-16', 1, 1);
INSERT INTO appoinments (date_appoinment, client_id, dentist_id) VALUES ('2023-04-19', 5, 3);



