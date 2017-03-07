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
 	(11001, 10000, 1,0,0,'Payment Cards 1 & 1', '1und1.png'),
 	(11002, 10000, 1,0,0,'Payment Cards Mobilcom', 'mobilcom.png'),
 	(11003, 10000, 1,0,0,'Payment Cards Vodaphone', 'vodaphone.jpg'),
 	
 	(12000, 20000, 0,1,0,'Pin Printing Telekom', 'telekom.png'),
 	(12001, 20000, 0,1,0,'Pin Printing 1 & 1', '1und1.png'),
 	(12002, 20000, 0,1,0,'Pin Printing Mobilcom', 'mobilcom.png'),
 	(12003, 20000, 0,1,0,'Pin Printing Vodaphone', 'vodaphone.jpg'),
 	
 	(13000, 30000, 0,0,1,'Direktaufladen Telekom', 'telekom.png'),
 	(13001, 30000, 0,0,1,'Direktaufladen 1 & 1', '1und1.png'),
 	(13002, 30000, 0,0,1,'Direktaufladen Mobilcom', 'mobilcom.png'),
 	(13003, 30000, 0,0,1,'Direktaufladen Vodaphone', 'vodaphone.jpg');
 	
 	
delete from  app.artikelTyp;
insert into app.artikelTyp values
    (11001, 11000, 'Artikel Cat 1 Group1 Typ 1', 'art_typ1_cat1.png', 10, 20, 100,100, 0, '€'),
    (12001, 11001, 'Artikel Cat 1 Group2 Typ 1', 'art_typ1_cat1.png', 10, 20, 100,100, 0, '€'),
    (13001, 11002, 'Artikel Cat 1 Group3 Typ 1', 'art_typ1_cat1.png', 10, 20, 100,100, 0, '€'),
    (14001, 11003, 'Artikel Cat 1 Group4 Typ 1', 'art_typ1_cat1.png', 10, 20, 100,100, 0, '€'),

    (21001, 12000, 'Artikel Cat 2 Group1 Typ 1', 'art_typ1_cat1.png', 15, 25, 100,200, 0, '€'),
    (22001, 12001, 'Artikel Cat 2 Group2 Typ 1', 'art_typ1_cat1.png', 15, 25, 100,200, 0, '€'),
    (23001, 12002, 'Artikel Cat 2 Group2 Typ 1', 'art_typ1_cat1.png', 15, 25, 100,200, 0, '€'),
    (24001, 12003, 'Artikel Cat 2 Group4 Typ 1', 'art_typ1_cat1.png', 15, 25, 100,200, 0, '€'),
    (25001, 12004, 'Artikel Cat 2 Group5 Typ 1', 'art_typ1_cat1.png', 15, 25, 100,200, 0, '€'),
    (26001, 12005, 'Artikel Cat 2 Group6 Typ 1', 'art_typ1_cat1.png', 15, 25, 100,200, 0, '€'),
    (27001, 12006, 'Artikel Cat 2 Group7 Typ 1', 'art_typ1_cat1.png', 15, 25, 100,200, 0, '€'),
    (28001, 12007, 'Artikel Cat 2 Group8 Typ 1', 'art_typ1_cat1.png', 15, 25, 100,200, 0, '€'),

    (31001, 13000, 'Artikel Cat 2 Group1 Typ 1', 'art_typ1_cat1.png', 15, 25, 100,200, 0, '€'),
     (32001, 13001, 'Artikel Cat 2 Group2 Typ 1', 'art_typ1_cat1.png', 15, 25, 100,200, 0, '€'),
     (33001, 13002, 'Artikel Cat 2 Group2 Typ 1', 'art_typ1_cat1.png', 15, 25, 100,200, 0, '€');
