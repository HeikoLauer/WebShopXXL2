/** Costumer **/
DELETE FROM app.CUSTOMER;
INSERT INTO app.CUSTOMER VALUES   
	(10000,'heiko','lauer',100, 0, 'Filiale Lauer', 'Strasse Lauer', '100', '11111', 'Ort Lauer', '1111 11 111', '1111 11 22', '+49 111 111 111', 'lauer@test.de', 'Pos1', 'Herr', 'Heiko Lauer', 'Street 1', '11', '11111', 'Place 1', '12345', '6789', '+49 123 4567', 'heiko@test.de', 'POS2'),
	(10001,'verena','milz',200, 1, 'Filiale Milz', 'Strasse Milz', '200', '22222', 'Ort Milz', '2222 22 222', '2222 22 33', '+49 222 222 222', 'milz@test.de', 'Pos2', 'Frau', 'Verena Milz', 'Street 2', '22', '22222', 'Place 2', '12345', '6789', '+49 123 4567', 'verena@test.de', 'POS2'),
	(10002,'daniel','knauth',150, 0, 'Filiale Knauth', 'Strasse Knauth', '200', '22222', 'Ort Knauth', '2222 222 222', '333 333 333', '+49 333 333 333', 'knauth@test.de', 'Pos3', 'Herr', 'Daniel Knauth', 'Street 3', '33', '33333', 'Place 3', '435676', '6789', '+49 123 4567', 'daniel@test.de', 'POS2');

    
    
/** ArtikelTypCategorie **/    

DELETE FROM app.artikeltypcategorie;
INSERT INTO app.artikeltypcategorie VALUES(10000, 'Kategorie Payment Cards');
INSERT INTO app.artikeltypcategorie VALUES(20000, 'Kategorie Pin Printing');
INSERT INTO app.artikeltypcategorie VALUES(30000, 'Kategorie Direktaufladen');


DELETE FROM app.artikeltypgroup; 	
INSERT INTO app.artikeltypgroup VALUES  
 	(11000, 10000, 1,0,0,'Payment Cards Telekom', 'telekom.png'),
 	(12000, 10000, 1,0,0,'Payment Cards 1 & 1', '1und1.png'),
 	(13000, 10000, 1,0,0,'Payment Cards Mobilcom', 'mobilcom.png'),
 	(14000, 10000, 1,0,0,'Payment Cards Vodaphone', 'vodaphone.jpg'),
 	
 	(21000, 20000, 0,1,0,'Pin Printing Telekom', 'telekom.png'),
 	(22000, 20000, 0,1,0,'Pin Printing 1 & 1', '1und1.png'),
 	(23000, 20000, 0,1,0,'Pin Printing Mobilcom', 'mobilcom.png'),
 	(24000, 20000, 0,1,0,'Pin Printing Vodaphone', 'vodaphone.jpg'),
 	
 	(31000, 30000, 0,0,1,'Direktaufladen Telekom', 'telekom.png'),
 	(32000, 30000, 0,0,1,'Direktaufladen 1 & 1', '1und1.png'),
 	(33000, 30000, 0,0,1,'Direktaufladen Mobilcom', 'mobilcom.png'),
 	(34000, 30000, 0,0,1,'Direktaufladen Vodaphone', 'vodaphone.jpg');
 	
 	
delete from  app.artikelTyp;
insert into app.artikelTyp values
  	
	/** CAT 1  Group 1 ***/
	(11001, 11000, 'Artikel Cat 1 Group1 Typ 1', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (11002, 11000, 'Artikel Cat 1 Group1 Typ 2', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (11003, 11000, 'Artikel Cat 1 Group1 Typ 3', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (11004, 11000, 'Artikel Cat 1 Group1 Typ 4', 'art_typ1_cat1.png', 10, 5, 'EUR'),
	/** CAT 1  Group 2 ***/
	(12001, 12000, 'Artikel Cat 1 Group2 Typ 1', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (12002, 12000, 'Artikel Cat 1 Group2 Typ 2', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (12003, 12000, 'Artikel Cat 1 Group2 Typ 3', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (12004, 12000, 'Artikel Cat 1 Group2 Typ 4', 'art_typ1_cat1.png', 10, 5, 'EUR'),
	/** CAT 1  Group 3 ***/
	(13001, 13000, 'Artikel Cat 1 Group3 Typ 1', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (13002, 13000, 'Artikel Cat 1 Group3 Typ 2', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (13003, 13000, 'Artikel Cat 1 Group3 Typ 3', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (13004, 13000, 'Artikel Cat 1 Group3 Typ 4', 'art_typ1_cat1.png', 10, 5, 'EUR'),
	/** CAT 1  Group 4 ***/
	(14001, 14000, 'Artikel Cat 1 Group4 Typ 1', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (14002, 14000, 'Artikel Cat 1 Group4 Typ 2', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (14003, 14000, 'Artikel Cat 1 Group4 Typ 3', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (14004, 14000, 'Artikel Cat 1 Group4 Typ 4', 'art_typ1_cat1.png', 10, 5, 'EUR'),
  
    
    /** CAT 2  Group 1 ***/
	(21001, 21000, 'Artikel Cat 2 Group1 Typ 1', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (21002, 21000, 'Artikel Cat 2 Group1 Typ 2', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (21003, 21000, 'Artikel Cat 2 Group1 Typ 3', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (21004, 21000, 'Artikel Cat 2 Group1 Typ 4', 'art_typ1_cat1.png', 10, 5, 'EUR'),
	/** CAT 2  Group 2 ***/
	(22001, 22000, 'Artikel Cat 2 Group2 Typ 1', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (22002, 22000, 'Artikel Cat 2 Group2 Typ 2', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (22003, 22000, 'Artikel Cat 2 Group2 Typ 3', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (22004, 22000, 'Artikel Cat 2 Group2 Typ 4', 'art_typ1_cat1.png', 10, 5, 'EUR'),
	/** CAT 2  Group 3 ***/
	(23001, 23000, 'Artikel Cat 2 Group3 Typ 1', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (23002, 23000, 'Artikel Cat 2 Group3 Typ 2', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (23003, 23000, 'Artikel Cat 2 Group3 Typ 3', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (23004, 23000, 'Artikel Cat 2 Group3 Typ 4', 'art_typ1_cat1.png', 10, 5, 'EUR'),
	/** CAT 2 Group 4 ***/
	(24001, 24000, 'Artikel Cat 2 Group4 Typ 1', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (24002, 24000, 'Artikel Cat 2 Group4 Typ 2', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (24003, 24000, 'Artikel Cat 2 Group4 Typ 3', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (24004, 24000, 'Artikel Cat 2 Group4 Typ 4', 'art_typ1_cat1.png', 10, 5, 'EUR'),

    
    /** CAT 3  Group 1 ***/
	(31001, 31000, 'Artikel Cat 2 Group1 Typ 1', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (31002, 31000, 'Artikel Cat 2 Group1 Typ 2', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (31003, 31000, 'Artikel Cat 2 Group1 Typ 3', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (31004, 31000, 'Artikel Cat 2 Group1 Typ 4', 'art_typ1_cat1.png', 10, 5, 'EUR'),
	/** CAT 3  Group 2 ***/
	(32001, 32000, 'Artikel Cat 2 Group2 Typ 1', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (32002, 32000, 'Artikel Cat 2 Group2 Typ 2', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (32003, 32000, 'Artikel Cat 2 Group2 Typ 3', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (32004, 32000, 'Artikel Cat 2 Group2 Typ 4', 'art_typ1_cat1.png', 10, 5, 'EUR'),
	/** CAT 3  Group 3 ***/
	(33001, 33000, 'Artikel Cat 2 Group3 Typ 1', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (33002, 33000, 'Artikel Cat 2 Group3 Typ 2', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (33003, 33000, 'Artikel Cat 2 Group3 Typ 3', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (33004, 33000, 'Artikel Cat 2 Group3 Typ 4', 'art_typ1_cat1.png', 10, 5, 'EUR'),
	/** CAT 3 Group 4 ***/
	(34001, 34000, 'Artikel Cat 2 Group4 Typ 1', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (34002, 34000, 'Artikel Cat 2 Group4 Typ 2', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (34003, 34000, 'Artikel Cat 2 Group4 Typ 3', 'art_typ1_cat1.png', 10, 5, 'EUR'),
    (34004, 34000, 'Artikel Cat 2 Group4 Typ 4', 'art_typ1_cat1.png', 10, 5, 'EUR');
