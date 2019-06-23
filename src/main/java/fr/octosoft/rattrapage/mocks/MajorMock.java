package fr.octosoft.rattrapage.mocks;

import fr.octosoft.rattrapage.daos.ClientDAO;
import fr.octosoft.rattrapage.daos.ProductDAO;
import fr.octosoft.rattrapage.daos.StoreDAO;
import fr.octosoft.rattrapage.daos.TransactionDAO;
import fr.octosoft.rattrapage.entities.Client;
import fr.octosoft.rattrapage.entities.Product;
import fr.octosoft.rattrapage.entities.Store;
import fr.octosoft.rattrapage.entities.Transaction;
import fr.octosoft.rattrapage.services.ClientService;
import fr.octosoft.rattrapage.services.ProductService;
import fr.octosoft.rattrapage.services.StoreService;
import fr.octosoft.rattrapage.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;

public class MajorMock {

    @Autowired
    StoreDAO storeDAO;

    @Autowired
    ClientDAO clientDAO;

    @Autowired
    ProductDAO productDAO;

    @Autowired
    TransactionDAO transactionDAO;

    @Autowired
    StoreService storeService = new StoreService(storeDAO);
    ClientService clientService = new ClientService(clientDAO);
    ProductService productService = new ProductService(productDAO);
    TransactionService transactionService = new TransactionService(transactionDAO);

    public void createStores() {
        storeService.createStore(new Store("Zara", "mode"));
        storeService.createStore(new Store("Decathlon", "sport"));
        storeService.createStore(new Store("Sephora", "beaute"));
        storeService.createStore(new Store("La Grande Récré", "enfant"));
        storeService.createStore(new Store("Fnac", "culture"));
        storeService.createStore(new Store("Darty", "hightech"));
        storeService.createStore(new Store("Flunch", "restauration"));
        storeService.createStore(new Store("Burger King", "restauration"));
        storeService.createStore(new Store("Carrefour", "alimentation"));
        storeService.createStore(new Store("Bershka", "mode"));
    }

    public void createProducts() {
        productService.createProduct(new Product("Chemise", "vetement", "Taille S", 20, storeService.listStore(1l).iterator().next()));
        productService.createProduct(new Product("Tshirt", "vetement", "Taille S", 11, storeService.listStore(1l).iterator().next()));
        productService.createProduct(new Product("Tshirt", "vetement", "Taille M", 15, storeService.listStore(1l).iterator().next()));
        productService.createProduct(new Product("Basket", "chaussure", "Taille 42", 45, storeService.listStore(1l).iterator().next()));
        productService.createProduct(new Product("Bottine", "chaussure", "Taille 45", 90, storeService.listStore(1l).iterator().next()));

        productService.createProduct(new Product("Basket running", "chaussure", "Taille 41", 22, storeService.listStore(2l).iterator().next()));
        productService.createProduct(new Product("Raquette de tennis", "equipement de sport", "55cm - 1,25mm", 65, storeService.listStore(2l).iterator().next()));
        productService.createProduct(new Product("Ballon de foot", "equipement de sport", "20cm", 11, storeService.listStore(2l).iterator().next()));
        productService.createProduct(new Product("Ballon de basket", "equipement de sport", "18cm", 16, storeService.listStore(2l).iterator().next()));
        productService.createProduct(new Product("Short Adidas", "vetement", "Taille M", 22, storeService.listStore(2l).iterator().next()));

        productService.createProduct(new Product("Palette Beauty", "maquillage", "Fard à paupière", 30, storeService.listStore(3l).iterator().next()));
        productService.createProduct(new Product("Mascara Outrageous","maquillage", "Mascara", 12, storeService.listStore(3l).iterator().next()));
        productService.createProduct(new Product("Parfum Dior", "parfum", "Sauvage 50ml", 55, storeService.listStore(3l).iterator().next()));
        productService.createProduct(new Product("Parfum Dior", "parfum", "Poison 50ml", 65, storeService.listStore(3l).iterator().next()));
        productService.createProduct(new Product("Parfum Dolce Gabbana", "parfum", "The One 100ml", 72, storeService.listStore(3l).iterator().next()));

        productService.createProduct(new Product("1000 bornes", "jouet", "Jeu de société", 16, storeService.listStore(4l).iterator().next()));
        productService.createProduct(new Product("Poupée Lili Coeur", "jouet", "Poupée/figurine", 22, storeService.listStore(4l).iterator().next()));
        productService.createProduct(new Product("Figurine Spiderman","jouet", "Poupée/figurine", 8, storeService.listStore(4l).iterator().next()));
        productService.createProduct(new Product("Monopoly Star Wars","jouet", "Jeu de société", 19, storeService.listStore(4l).iterator().next()));
        productService.createProduct(new Product("Déguisement Zorro", "deguisement", "100% coton", 32, storeService.listStore(4l).iterator().next()));

        productService.createProduct(new Product("Les liaisons dangereuses", "livre", "Roman - Pierre Choderlos de Laclos", 12, storeService.listStore(5l).iterator().next()));
        productService.createProduct(new Product("Germinal", "livre", "Roman - Emile Zola", 9, storeService.listStore(5l).iterator().next()));
        productService.createProduct(new Product("Avatar", "film", "Film - James Cameron", 15, storeService.listStore(5l).iterator().next()));
        productService.createProduct(new Product("Titanic", "film", "Film - James Cameron", 12, storeService.listStore(5l).iterator().next()));
        productService.createProduct(new Product("Chromebook C423NA", "ordinateur", "Ordinateur 13", 340, storeService.listStore(5l).iterator().next()));

        productService.createProduct(new Product("Macbook Pro 2015", "ordinateur", "Oridnateur 13", 1250, storeService.listStore(6l).iterator().next()));
        productService.createProduct(new Product("Macbook Pro 2017", "ordinateur", "Ordinateur 15", 1550, storeService.listStore(6l).iterator().next()));
        productService.createProduct(new Product("TV Samsung 49Q6", "ordinateur", "Télévision 115cm", 990, storeService.listStore(6l).iterator().next()));
        productService.createProduct(new Product("Brandt B1960", "télevision", "Télévision 150cm", 535, storeService.listStore(6l).iterator().next()));
        productService.createProduct(new Product("TV Samsung UE32", "télevision", "Télévision 73cm", 1060, storeService.listStore(6l).iterator().next()));

        productService.createProduct(new Product("F menu viande", "restauration générale", "Formule midi et soir", 10, storeService.listStore(7l).iterator().next()));
        productService.createProduct(new Product("F menu poisson", "restauration générale", "Formule midi et soir", 11, storeService.listStore(7l).iterator().next()));
        productService.createProduct(new Product("Formule express viande", "restauration générale", "Formule midi et soir", 8, storeService.listStore(7l).iterator().next()));
        productService.createProduct(new Product("Formule express poisson", "restauration générale", "Formule midi et soir", 9, storeService.listStore(7l).iterator().next()));
        productService.createProduct(new Product("Petits fluncheurs", "restauration générale", "Formule midi et soir", 5, storeService.listStore(7l).iterator().next()));

        productService.createProduct(new Product("Menu Double Steakhouse", "restauration rapide", "Formule midi et soir", 12, storeService.listStore(8l).iterator().next()));
        productService.createProduct(new Product("Menu Maxi Double Steakhouse", "restauration rapide", "Formule midi et soir", 13, storeService.listStore(8l).iterator().next()));
        productService.createProduct(new Product("Menu Whooper", "restauration rapide", "Formule midi et soir", 8, storeService.listStore(8l).iterator().next()));
        productService.createProduct(new Product("Menu enfant Whooper", "restauration rapide", "Formule midi et soir", 7, storeService.listStore(8l).iterator().next()));
        productService.createProduct(new Product("Menu Crispy Chicken Barbecue", "restauration rapide", "Formule midi et soir", 14, storeService.listStore(8l).iterator().next()));

        productService.createProduct(new Product("Banane", "fruit et légume", "Lot de 3", 3, storeService.listStore(9l).iterator().next()));
        productService.createProduct(new Product("Concombre", "fruit et légume", "Unité", 1, storeService.listStore(9l).iterator().next()));
        productService.createProduct(new Product("Ananas", "fruit et légume", "Unité", 2, storeService.listStore(9l).iterator().next()));
        productService.createProduct(new Product("1 steak  araignée", "boucherie", "250g  boeuf", 7, storeService.listStore(9l).iterator().next()));
        productService.createProduct(new Product("10 travers de porcs","boucherie", "150g  porc", 5, storeService.listStore(9l).iterator().next()));

        productService.createProduct(new Product("Pull", "vetement", "Taille S", 22, storeService.listStore(10l).iterator().next()));
        productService.createProduct(new Product("Sweatshirt", "vetement", "Taille S", 16, storeService.listStore(10l).iterator().next()));
        productService.createProduct(new Product("Pull à col roulé", "vetement", "Taille S", 18, storeService.listStore(10l).iterator().next()));
        productService.createProduct(new Product("TShirt", "vetement", "Taille S", 9, storeService.listStore(10l).iterator().next()));
        productService.createProduct(new Product("Basket", "chaussure", "Taille 44", 29, storeService.listStore(10l).iterator().next()));
    }

    public void createClients() {
        clientService.createClient(new Client("admin","admin","admin","admin","M", 0,"admin"));
        clientService.createClient(new Client("Reyna","Elderidge","relderidge0@mysql.com","vf5R3b4v","F",18,"sportif"));
        clientService.createClient(new Client("Blinnie","Aingell","baingell1@usda.gov","Pwtg7JUoqX1u","F",18,"mode"));
        clientService.createClient(new Client("Reilly","Linzey","rlinzey2@sourceforge.net","Aj7q8bp","M",18,"cinéphile"));
        clientService.createClient(new Client("Hebert","Tebboth","htebboth3@arizona.edu","DOMYEWo","M",18,"dégustateur"));
        clientService.createClient(new Client("Victor","Walbrun","vwalbrun4@wunderground.com","SzvtTFuBi","M",18,"cuisinier"));
        clientService.createClient(new Client("Gloriane","Inkle","ginkle5@vimeo.com","TOWsrRLMnW0h","F",18,"parent"));
        clientService.createClient(new Client("Broderick","Korlat","bkorlat6@miitbeian.gov","cn,zqEE0ZsI","M",18,"bibliographe"));
        clientService.createClient(new Client("Curran","Saldler","csaldler7@sphinn.com","BnsrsaMia82x","M",18,"technophile"));
        clientService.createClient(new Client("Tessie","Gallen","tgallen8@typepad.com","wzsjsQo","F",18,"parfumeur"));
        clientService.createClient(new Client("Kessia","Norssister","knorssister9@cnn.com","Vf7vWkls3c","F",18,"sportif"));
        clientService.createClient(new Client("Nissy","Jaquemar","njaquemara@patch.com","YcUsm5","F",18,"mode"));
        clientService.createClient(new Client("Ripley","Barrus","rbarrusb@prlog.org","TT8qR9d","M",18,"cinéphile"));
        clientService.createClient(new Client("Charlene","Renn","crennc@economist.com","vGiCF30x","F",18,"dégustateur"));
        clientService.createClient(new Client("Denise","Gabe","dgabed@gmpg.org","mZXzMn2Ayr","F",18,"cuisinier"));
        clientService.createClient(new Client("Cristian","Heymes","cheymese@redcross.org","AbSeMFEVCDQ","M",18,"parent"));
        clientService.createClient(new Client("Orlando","Houldcroft","ohouldcroftf@ameblo.jp","bVBVEK","M",18,"bibliographe"));
        clientService.createClient(new Client("Peder","Dumbare","pdumbareg@de.vu","gTNaQnNy","M",18,"technophile"));
        clientService.createClient(new Client("Arliene","Bednall","abednallh@i2i.jp","LBsCY5Cf","F",18,"parfumeur"));
        clientService.createClient(new Client("Rita","Gregson","rgregsoni@answers.com","uYeoiTvurpS","F",18,"maquilleur"));
        clientService.createClient(new Client("Goran","Bruyet","gbruyetj@uiuc.edu","HrpCaPf9g4","M",18,"sportif"));
    }

    public void createTransactions() {
        transactionService.createTransaction(new Transaction(clientService.listClient(1l).iterator().next(), productService.listProduct(6l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(1l).iterator().next(), productService.listProduct(7l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(1l).iterator().next(), productService.listProduct(10l).iterator().next()));

        transactionService.createTransaction(new Transaction(clientService.listClient(2l).iterator().next(), productService.listProduct(4l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(2l).iterator().next(), productService.listProduct(10l).iterator().next()));

        transactionService.createTransaction(new Transaction(clientService.listClient(3l).iterator().next(), productService.listProduct(5l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(3l).iterator().next(), productService.listProduct(46l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(3l).iterator().next(), productService.listProduct(47l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(3l).iterator().next(), productService.listProduct(48l).iterator().next()));

        transactionService.createTransaction(new Transaction(clientService.listClient(4l).iterator().next(), productService.listProduct(9l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(4l).iterator().next(), productService.listProduct(11l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(4l).iterator().next(), productService.listProduct(14l).iterator().next()));

        transactionService.createTransaction(new Transaction(clientService.listClient(5l).iterator().next(), productService.listProduct(12l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(5l).iterator().next(), productService.listProduct(15l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(5l).iterator().next(), productService.listProduct(16l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(5l).iterator().next(), productService.listProduct(17l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(5l).iterator().next(), productService.listProduct(18l).iterator().next()));

        transactionService.createTransaction(new Transaction(clientService.listClient(6l).iterator().next(), productService.listProduct(17l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(6l).iterator().next(), productService.listProduct(19l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(6l).iterator().next(), productService.listProduct(20l).iterator().next()));

        transactionService.createTransaction(new Transaction(clientService.listClient(7l).iterator().next(), productService.listProduct(21l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(7l).iterator().next(), productService.listProduct(23l).iterator().next()));

        transactionService.createTransaction(new Transaction(clientService.listClient(8l).iterator().next(), productService.listProduct(24l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(8l).iterator().next(), productService.listProduct(26l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(8l).iterator().next(), productService.listProduct(34l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(8l).iterator().next(), productService.listProduct(35l).iterator().next()));

        transactionService.createTransaction(new Transaction(clientService.listClient(9l).iterator().next(), productService.listProduct(30l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(9l).iterator().next(), productService.listProduct(31l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(9l).iterator().next(), productService.listProduct(36l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(9l).iterator().next(), productService.listProduct(37l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(9l).iterator().next(), productService.listProduct(38l).iterator().next()));

        transactionService.createTransaction(new Transaction(clientService.listClient(10l).iterator().next(), productService.listProduct(36l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(10l).iterator().next(), productService.listProduct(37l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(10l).iterator().next(), productService.listProduct(38l).iterator().next()));

        transactionService.createTransaction(new Transaction(clientService.listClient(11l).iterator().next(), productService.listProduct(41l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(11l).iterator().next(), productService.listProduct(42l).iterator().next()));

        transactionService.createTransaction(new Transaction(clientService.listClient(12l).iterator().next(), productService.listProduct(41l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(12l).iterator().next(), productService.listProduct(42l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(12l).iterator().next(), productService.listProduct(43l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(12l).iterator().next(), productService.listProduct(44l).iterator().next()));

        transactionService.createTransaction(new Transaction(clientService.listClient(13l).iterator().next(), productService.listProduct(43l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(13l).iterator().next(), productService.listProduct(44l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(13l).iterator().next(), productService.listProduct(45l).iterator().next()));

        transactionService.createTransaction(new Transaction(clientService.listClient(14l).iterator().next(), productService.listProduct(25l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(14l).iterator().next(), productService.listProduct(46l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(14l).iterator().next(), productService.listProduct(48l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(14l).iterator().next(), productService.listProduct(49l).iterator().next()));

        transactionService.createTransaction(new Transaction(clientService.listClient(15l).iterator().next(), productService.listProduct(7l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(15l).iterator().next(), productService.listProduct(8l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(15l).iterator().next(), productService.listProduct(31l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(15l).iterator().next(), productService.listProduct(34l).iterator().next()));

        transactionService.createTransaction(new Transaction(clientService.listClient(16l).iterator().next(), productService.listProduct(21l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(16l).iterator().next(), productService.listProduct(50l).iterator().next()));

        transactionService.createTransaction(new Transaction(clientService.listClient(17l).iterator().next(), productService.listProduct(2l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(17l).iterator().next(), productService.listProduct(5l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(17l).iterator().next(), productService.listProduct(14l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(17l).iterator().next(), productService.listProduct(15l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(17l).iterator().next(), productService.listProduct(40l).iterator().next()));

        transactionService.createTransaction(new Transaction(clientService.listClient(18l).iterator().next(), productService.listProduct(48l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(18l).iterator().next(), productService.listProduct(50l).iterator().next()));

        transactionService.createTransaction(new Transaction(clientService.listClient(19l).iterator().next(), productService.listProduct(26l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(19l).iterator().next(), productService.listProduct(29l).iterator().next()));

        transactionService.createTransaction(new Transaction(clientService.listClient(20l).iterator().next(), productService.listProduct(2l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(20l).iterator().next(), productService.listProduct(3l).iterator().next()));
        transactionService.createTransaction(new Transaction(clientService.listClient(20l).iterator().next(), productService.listProduct(22l).iterator().next()));

    }
}
