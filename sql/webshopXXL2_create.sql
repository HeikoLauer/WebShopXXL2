
/*** Costumer **********************/
DROP  TABLE app.costumer;
CREATE TABLE app.costumer (
  	
	id bigint,  
  	loginname varchar(25),
  	password varchar(25),
  	creditLimit bigint,
  	reachedCreditLimit bigint,
  
   	filial_Name varchar(25),
   	filial_street varchar(25),
   	filial_number varchar(5),
   	filial_postcode varchar(5),
	filial_place varchar(25),
	filial_phone varchar(15),
	filial_fax varchar(25),
	filial_mobil varchar(15),
	filial_mail varchar(35),
	filial_position varchar(25),
  
	fi_contact_titel varchar(25),
	fi_contact_name varchar(25),  
	fi_contact_street varchar(25),
	fi_contact_number varchar(25),
	fi_contact_postcode varchar(25),
	fi_contact_place varchar(25),
	fi_contact_phone varchar(25),
	fi_contact_fax varchar(25),
	fi_contact_mobil varchar(25),
	fi_contact_mail varchar(25),
	fi_contact_position  varchar(25));

	
/*** ArtikelTypCategory **********/

DROP TABLE app.artikelTypCategorie;	
CREATE TABLE app.artikelTypCategorie(
	id bigint,
	name varchar(25),
	image varchar(25));

/*** ArtikelTypCategory **********/
	
DROP TABLE app.artikelTypGroup;	
CREATE TABLE app.artikelTypGroup(
	id bigint,
	artikeltypcategorie_id bigint,
	name varchar(25));
	
/*** ArtikelTyp ******************/	
DROP TABLE app.artikelTyp;	
CREATE TABLE app.artikelTyp(
	id bigint,
	artikeltypgroup_id bigint,
	name varchar(35),
	image varchar(35),
	price_value bigint,
	quantity bigint,
	maxquantity bigint,
	totalValue bigint,
	totalValue bigint,
	currency varchar(2));
