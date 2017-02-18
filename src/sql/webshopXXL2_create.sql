
/*** Users **********************/
CREATE TABLE app.users (
  counter integer,
  firstname varchar(25),
  lastname varchar(25),
  loginname varchar(25),
  password varchar(25),
  ammount float);
  
/*** Products ********************/  

CREATE TABLE app.categorie (
  counter integer,
  id varchar(25),
  name varchar(25),
  icon_name varchar(25));
 
/*** Categorie ********************/  

CREATE TABLE app.products (
  counter integer,
  id varchar(25),
  id_categorie varchar(25),
  name varchar(25),
  icon_name varchar(25));
  
