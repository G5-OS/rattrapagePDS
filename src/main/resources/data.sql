/*  UC3: ASSOCIER DES PRODUITS */

  /* STORE CREATION AND THEIR PRODUCTS */

INSERT INTO store (id, name, category)  VALUES ("Zara", "mode");

INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Chemise", "vetement", "Taille S", 20, 1);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Tshirt", "vetement", "Taille S", 11, 1);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Tshirt", "vetement", "Taille M", 15, 1);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Basket", "chaussure", "Taille 42", 45, 1);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Bottine", "chaussure", "Taille 45", 90, 1);

INSERT INTO store (name, category)  VALUES ("Décathlon", "sport");

INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Basket running", "chaussure", "Taille 41", 22, 2);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Raquette de tennis", "equipement de sport", "55cm - 1,25mm", 65, 2);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Ballon de foot", "equipement de sport", "20cm", 11, 2);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Ballon de basket", "equipement de sport", "18cm", 16, 2);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Short Adidas", "vetement", "Taille M", 22, 2);

INSERT INTO store (name, category)  VALUES ("Sephora", "beaute");

INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Palette Beauty", "maquillage", "Fard à paupière", 30, 3);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Mascara Outrageous","maquillage", "Mascara", 12, 3);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Parfum Dior", "parfum", "Sauvage 50ml", 55, 3);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Parfum Dior", "parfum", "Poison 50ml", 65, 3);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Parfum Dolce Gabbana", "parfum", "The One 100ml", 72, 3);

INSERT INTO store (name, category)  VALUES ("La Grande Récré", "enfant");

INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("1000 bornes", "jouet", "Jeu de société", 16, 4);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Poupée Lili Coeur", "jouet", "Poupée/figurine", 22, 4);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Figurine Spiderman","jouet", "Poupée/figurine", 8, 4);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Monopoly Star Wars","jouet", "Jeu de société", 19, 4);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Déguisement Zorro", "deguisement", "100% coton", 32, 4);

INSERT INTO store (name, category)  VALUES ("Fnac", "culture");

INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Les liaisons dangereuses", "livre", "Roman - Pierre Choderlos de Laclos", 12, 5);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Germinal", "livre", "Roman - Emile Zola", 9, 5);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Avatar", "film", "Film - James Cameron", 15, 5);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Titanic", "film", "Film - James Cameron", 12, 5);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Chromebook C423NA", "ordinateur", "Ordinateur 13", 12, 5);

INSERT INTO store (name, category)  VALUES ("Darty", "high-tech");

INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Macbook Pro 2015", "ordinateur", "Oridnateur 13", 1250, 6);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Macbook Pro 2017", "ordinateur", "Ordinateur 15", 1550, 6);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("TV Samsung 49Q6", "ordinateur", "Télévision 115cm", 990, 6);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Brandt B1960", "télevision", "Télévision 150cm", 535, 6);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("TV Samsung UE32", "télevision", "Télévision 73cm", 1060, 6);

INSERT INTO store (name, category)  VALUES ("Flunch", "restauration");

INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("F menu viande", "restauration générale", "Formule midi et soir", 10, 7);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("F menu poisson", "restauration générale", "Formule midi et soir", 11, 7);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Formule express viande", "restauration générale", "Formule midi et soir", 8, 7);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Formule express poisson", "restauration générale", "Formule midi et soir", 9, 7);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Petits fluncheurs", "restauration générale", "Formule midi et soir", 5, 7);

INSERT INTO store (name, category)  VALUES ("Burger King", "restauration");

INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Menu Double Steakhouse", "restauration rapide", "Formule midi et soir", 12, 8);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Menu Maxi Double Steakhouse", "restauration rapide", "Formule midi et soir", 13, 8);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Menu Whooper", "restauration rapide", "Formule midi et soir", 8, 8);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Menu enfant Whooper", "restauration rapide", "Formule midi et soir", 7, 8);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Menu Crispy Chicken Barbecue", "restauration rapide", "Formule midi et soir", 14, 8);

INSERT INTO store (name, category)  VALUES ("Carrefour", "alimentation");

INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Banane", "fruit et légume", "Lot de 3", 3, 9);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Concombre", "fruit et légume", "Unité", 1, 9);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Ananas", "fruit et légume", "Unité", 2, 9);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("1 steak  araignée", "boucherie", "250g  boeuf", 7, 9);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("10 travers de porcs","boucherie", "150g  porc", 5, 9);

INSERT INTO store (name, category)  VALUES ("Bershka", "mode");

INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Pull", "vetement", "Taille S", 22, 10);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Sweatshirt", "vetement", "Taille S", 16, 10);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Pull à col roulé", "vetement", "Taille S", 18, 10);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("TShirt", "vetement", "Taille S", 9, 10);
INSERT INTO product (name, category, description, price, storeConcerned) VALUES ("Basket", "chaussure", "Taille 44", 29, 10);

  /* CLIENT CREATION AND THEIR PURCHASES*/

INSERT INTO client (fname, lname, mail, password, gender, age, profil) VALUES ("admin","admin","admin","admin","M", 0,"admin");

INSERT INTO client (fname, lname, mail, password, gender, age, profil) VALUES ("Reyna","Elderidge","relderidge0@mysql.com","vf5R3b4v","F",18,"sportif");
/* décathlon */
INSERT INTO transaction (client, product) VALUES (1,6);
INSERT INTO transaction (client, product) VALUES (1,7);
INSERT INTO transaction (client, product) VALUES (1,10);

INSERT INTO client (fname, lname, mail, password, gender, age, profil) VALUES ("Blinnie","Aingell","baingell1@usda.gov","Pwtg7JUoqX1u","F",18,"mode");
/* Zara et décathlon */
INSERT INTO transaction (client, product) VALUES (2,4);
INSERT INTO transaction (client, product) VALUES (2,10);

INSERT INTO client (fname, lname, mail, password, gender, age, profil) VALUES ("Reilly","Linzey","rlinzey2@sourceforge.net","Aj7q8bp","M",18,"cinéphile");
/* Zara et Bershka */
INSERT INTO transaction (client, product) VALUES (3,5);
INSERT INTO transaction (client, product) VALUES (3,46);
INSERT INTO transaction (client, product) VALUES (3,47);
INSERT INTO transaction (client, product) VALUES (3,48);

INSERT INTO client (fname, lname, mail, password, gender, age, profil) VALUES ("Hebert","Tebboth","htebboth3@arizona.edu","DOMYEWo","M",18,"dégustateur");
/* Décathlon et Sephora */
INSERT INTO transaction (client, product) VALUES (4,9);
INSERT INTO transaction (client, product) VALUES (4,11);
INSERT INTO transaction (client, product) VALUES (4,14);

INSERT INTO client (fname, lname, mail, password, gender, age, profil) VALUES ("Victor","Walbrun","vwalbrun4@wunderground.com","SzvtTFuBi","M",18,"cuisinier");
/* Grande récré et Sephora */
INSERT INTO transaction (client, product) VALUES (5,16);
INSERT INTO transaction (client, product) VALUES (5,17);
INSERT INTO transaction (client, product) VALUES (5,18);
INSERT INTO transaction (client, product) VALUES (5,12);
INSERT INTO transaction (client, product) VALUES (5,15);

INSERT INTO client (fname, lname, mail, password, gender, age, profil) VALUES ("Gloriane","Inkle","ginkle5@vimeo.com","TOWsrRLMnW0h","F",18,"parent");
/* Grande recé */
INSERT INTO transaction (client, product) VALUES (6,17);
INSERT INTO transaction (client, product) VALUES (6,19);
INSERT INTO transaction (client, product) VALUES (6,20);

INSERT INTO client (fname, lname, mail, password, gender, age, profil) VALUES ("Broderick","Korlat","bkorlat6@miitbeian.gov","cn,zqEE0ZsI","M",18,"bibliographe");
/* Fnac */
INSERT INTO transaction (client, product) VALUES (7,21);
INSERT INTO transaction (client, product) VALUES (7,23);

INSERT INTO client (fname, lname, mail, password, gender, age, profil) VALUES ("Curran","Saldler","csaldler7@sphinn.com","BnsrsaMia82x","M",18,"technophile");
/* Darty et Fnac et Flunch */
INSERT INTO transaction (client, product) VALUES (8,26);
INSERT INTO transaction (client, product) VALUES (8,24);
INSERT INTO transaction (client, product) VALUES (8,34);
INSERT INTO transaction (client, product) VALUES (8,35);

INSERT INTO client (fname, lname, mail, password, gender, age, profil) VALUES ("Tessie","Gallen","tgallen8@typepad.com","wzsjsQo","F",18,"parfumeur");
/* Flunch et Burger King et Darty */
INSERT INTO transaction (client, product) VALUES (9,31);
INSERT INTO transaction (client, product) VALUES (9,36);
INSERT INTO transaction (client, product) VALUES (9,37);
INSERT INTO transaction (client, product) VALUES (9,38);
INSERT INTO transaction (client, product) VALUES (9,30);

INSERT INTO client (fname, lname, mail, password, gender, age, profil) VALUES ("Kessia","Norssister","knorssister9@cnn.com","Vf7vWkls3c","F",18,"sportif");
/* Burger King */
INSERT INTO transaction (client, product) VALUES (10,36);
INSERT INTO transaction (client, product) VALUES (10,37);
INSERT INTO transaction (client, product) VALUES (10,38);

INSERT INTO client (fname, lname, mail, password, gender, age, profil) VALUES ("Nissy","Jaquemar","njaquemara@patch.com","YcUsm5","F",18,"mode");
/* Carrefour */
INSERT INTO transaction (client, product) VALUES (11,41);
INSERT INTO transaction (client, product) VALUES (11,42);

INSERT INTO client (fname, lname, mail, password, gender, age, profil) VALUES ("Ripley","Barrus","rbarrusb@prlog.org","TT8qR9d","M",18,"cinéphile");
/* Carrefour */
INSERT INTO transaction (client, product) VALUES (12,41);
INSERT INTO transaction (client, product) VALUES (12,42);
INSERT INTO transaction (client, product) VALUES (12,43);
INSERT INTO transaction (client, product) VALUES (12,44);

INSERT INTO client (fname, lname, mail, password, gender, age, profil) VALUES ("Charlene","Renn","crennc@economist.com","vGiCF30x","F",18,"dégustateur");
/* Carrefour */
INSERT INTO transaction (client, product) VALUES (13,43);
INSERT INTO transaction (client, product) VALUES (13,44);
INSERT INTO transaction (client, product) VALUES (13,45);

INSERT INTO client (fname, lname, mail, password, gender, age, profil) VALUES ("Denise","Gabe","dgabed@gmpg.org","mZXzMn2Ayr","F",18,"cuisinier");
/* Bershka et Fnac */
INSERT INTO transaction (client, product) VALUES (14,46);
INSERT INTO transaction (client, product) VALUES (14,48);
INSERT INTO transaction (client, product) VALUES (14,49);
INSERT INTO transaction (client, product) VALUES (14,25);

INSERT INTO client (fname, lname, mail, password, gender, age, profil) VALUES ("Cristian","Heymes","cheymese@redcross.org","AbSeMFEVCDQ","M",18,"parent");
/* Decathlon et Flunch */
INSERT INTO transaction (client, product) VALUES (15,7);
INSERT INTO transaction (client, product) VALUES (15,8);
INSERT INTO transaction (client, product) VALUES (15,31);
INSERT INTO transaction (client, product) VALUES (15,34);

INSERT INTO client (fname, lname, mail, password, gender, age, profil) VALUES ("Orlando","Houldcroft","ohouldcroftf@ameblo.jp","bVBVEK","M",18,"bibliographe");
/* Fnac et Bershka */
INSERT INTO transaction (client, product) VALUES (16,21);
INSERT INTO transaction (client, product) VALUES (16,50);

INSERT INTO client (fname, lname, mail, password, gender, age, profil) VALUES ("Peder","Dumbare","pdumbareg@de.vu","gTNaQnNy","M",18,"technophile");
/* Zara et Sephora et Burger King */
INSERT INTO transaction (client, product) VALUES (17,2);
INSERT INTO transaction (client, product) VALUES (17,5);
INSERT INTO transaction (client, product) VALUES (17,14);
INSERT INTO transaction (client, product) VALUES (17,15);
INSERT INTO transaction (client, product) VALUES (17,40);

INSERT INTO client (fname, lname, mail, password, gender, age, profil) VALUES ("Arliene","Bednall","abednallh@i2i.jp","LBsCY5Cf","F",18,"parfumeur");
/* Bershka */
INSERT INTO transaction (client, product) VALUES (18,48);
INSERT INTO transaction (client, product) VALUES (18,50);

INSERT INTO client (fname, lname, mail, password, gender, age, profil) VALUES ("Rita","Gregson","rgregsoni@answers.com","uYeoiTvurpS","F",18,"maquilleur");
/* Darty */
INSERT INTO transaction (client, product) VALUES (19,26);
INSERT INTO transaction (client, product) VALUES (19,29);

INSERT INTO client (fname, lname, mail, password, gender, age, profil) VALUES ("Goran","Bruyet","gbruyetj@uiuc.edu","HrpCaPf9g4","M",18,"sportif");
/* Fnac et Zara */
INSERT INTO transaction (client, product) VALUES (20,2);
INSERT INTO transaction (client, product) VALUES (20,3);
INSERT INTO transaction (client, product) VALUES (20,22);
