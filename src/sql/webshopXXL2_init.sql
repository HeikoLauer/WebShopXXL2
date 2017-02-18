/** User **/

INSERT INTO app.user VALUES   
	(10000,'Heiko','Lauer','heiko','lauer',1000.00),
    (10001,'Verena','Milz','verena','milz',2000.00);

/** Categorie **/    
INSERT INTO app.categorie VALUES  
 	(10000,'CAT_AAAAA','Kategorie 1','cat_aaaaa.png'),
 	(10001,'CAT_BBBBB','Kategorie 2','cat_bbbbb.png'),
 	(10002,'CAT_CCCCC','Kategorie 3','cat_ccccc.png'),
 	(10003,'CAT_DDDDD','Kategorie 4','cat_ddddd.png'),
 	(10004,'CAT_EEEEE','Kategorie 5','cat_eeeee.png');
                            
DELETE FROM app.products; 	
INSERT INTO app.products VALUES  
 	(10000, 'CAT_AAAAA_Prod1', 'CAT_AAAAA','Produkt 1','cat_aaaaa_prod1.png'),
 	(10001, 'CAT_AAAAA_Prod2', 'CAT_AAAAA','Produkt 2','cat_aaaaa_prod2.png'),
 	(10002, 'CAT_AAAAA_Prod3', 'CAT_AAAAA','Produkt 3','cat_aaaaa_prod3.png'),
 	(10003, 'CAT_AAAAA_Prod4', 'CAT_AAAAA','Produkt 4','cat_aaaaa_prod4.png'),
  	(10004, 'CAT_AAAAA_Prod5', 'CAT_AAAAA','Produkt 5','cat_aaaaa_prod5.png'),

  	(10005, 'CAT_BBBBB_Prod1', 'CAT_BBBBB','Produkt 1','cat_bbbbb_prod1.png'),
 	(10006, 'CAT_BBBBB_Prod2', 'CAT_BBBBB','Produkt 2','cat_bbbbb_prod2.png'),
 	(10007, 'CAT_BBBBB_Prod3', 'CAT_BBBBB','Produkt 3','cat_bbbbb_prod3.png'),
 	(10008, 'CAT_BBBBB_Prod4', 'CAT_BBBBB','Produkt 4','cat_bbbbb_prod4.png'),
  	(10009, 'CAT_BBBBB_Prod5', 'CAT_BBBBB','Produkt 5','cat_bbbbb_prod5.png'),

  	(10010, 'CAT_CCCCC_Prod1', 'CAT_CCCCC','Produkt 1','cat_ccccc_prod1.png'),
 	(10011, 'CAT_CCCCC_Prod2', 'CAT_CCCCC','Produkt 2','cat_ccccc_prod2.png'),
 	(10012, 'CAT_CCCCC_Prod3', 'CAT_CCCCC','Produkt 3','cat_ccccc_prod3.png'),
 	(10013, 'CAT_CCCCC_Prod4', 'CAT_CCCCC','Produkt 4','cat_ccccc_prod4.png'),
  	(10014, 'CAT_CCCCC_Prod5', 'CAT_CCCCC','Produkt 5','cat_ccccc_prod5.png'),
  	(10025, 'CAT_CCCCC_Prod6', 'CAT_CCCCC','Produkt 5','cat_ccccc_prod6.png'),
  	(10026, 'CAT_CCCCC_Prod7', 'CAT_CCCCC','Produkt 5','cat_ccccc_prod7.png'),
  	(10027, 'CAT_CCCCC_Prod8', 'CAT_CCCCC','Produkt 5','cat_ccccc_prod8.png'),
   	
  	(10015, 'CAT_DDDDD_Prod1', 'CAT_DDDDD','Produkt 1','cat_ddddd_prod1.png'),
 	(10016, 'CAT_DDDDD_Prod2', 'CAT_DDDDD','Produkt 2','cat_ddddd_prod2.png'),
 	(10017, 'CAT_DDDDD_Prod3', 'CAT_DDDDD','Produkt 3','cat_ddddd_prod3.png'),
 	(10018, 'CAT_DDDDD_Prod4', 'CAT_DDDDD','Produkt 4','cat_ddddd_prod4.png'),
  	(10019, 'CAT_DDDDD_Prod5', 'CAT_DDDDD','Produkt 5','cat_ddddd_prod5.png'),
 
  	(10020, 'CAT_EEEEE_Prod1', 'CAT_EEEEE','Produkt 1','cat_eeeee_prod1.png'),
 	(10021, 'CAT_EEEEE_Prod2', 'CAT_EEEEE','Produkt 2','cat_eeeee_prod2.png'),
 	(10022, 'CAT_EEEEE_Prod3', 'CAT_EEEEE','Produkt 3','cat_eeeee_prod3.png'),
 	(10023, 'CAT_EEEEE_Prod4', 'CAT_EEEEE','Produkt 4','cat_eeeee_prod4.png'),
  	(10024, 'CAT_EEEEE_Prod5', 'CAT_EEEEE','Produkt 5','cat_eeeee_prod5.png'),
  	(10025, 'CAT_EEEEE_Prod5', 'CAT_EEEEE','Produkt 6','cat_eeeee_prod6.png'),
  	(10026, 'CAT_EEEEE_Prod5', 'CAT_EEEEE','Produkt 7','cat_eeeee_prod7.png'),
  	(10027, 'CAT_EEEEE_Prod5', 'CAT_EEEEE','Produkt 8','cat_eeeee_prod8.png');
 