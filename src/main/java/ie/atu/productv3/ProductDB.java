package ie.atu.productv3;


import ie.atu.productv5.Music;
import ie.atu.productv5.TV;

public class ProductDB {
     public static Product getProduct(String productCode) {
         Product myProduct = null;
         if (productCode.equalsIgnoreCase("java")) {
             Book myBook = new Book();
             myBook.setCode(productCode);
             myBook.setDescription("ATU Java Programming");
             myBook.setPrice(57.50);
             myBook.setAuthor("Joe Brown");
             myProduct = myBook;
         } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
             myBook.setCode(productCode);
             myBook.setDescription("Java Servlets and JSP");
             myBook.setPrice(57.50);
             myBook.setAuthor("Mike White");
             myProduct = myBook;
         } else if (productCode.equalsIgnoreCase("mysql")) {
             Book myBook = new Book();
             myBook.setCode(productCode);
             myBook.setDescription("Lennon's MySQL");
             myBook.setPrice(54.50);
             myBook.setAuthor("Jim Lennon");
             myProduct = myBook;
         }

         if (productCode.equalsIgnoreCase("studios")) {
             Software mySoftware = new Software();
             mySoftware.setCode(productCode);
             mySoftware.setDescription("Visual Studios");
             mySoftware.setPrice(57.50);
             mySoftware.setVersion("Microsoft 1.1");
             myProduct = mySoftware;
         } else if (productCode.equalsIgnoreCase("eclipse")) {
             Software mySoftware = new Software();
             mySoftware.setCode(productCode);
             mySoftware.setDescription("Build Java apps");
             mySoftware.setPrice(57.50);
             mySoftware.setVersion("Eclipse Neon");
             myProduct = mySoftware;
         } else if (productCode.equalsIgnoreCase("oracle")) {
             Software mySoftware = new Software();
             mySoftware.setCode(productCode);
             mySoftware.setDescription("Latest MySQL");
             mySoftware.setPrice(54.50);
             mySoftware.setVersion("Oracle 3.0");
             myProduct = mySoftware;
         }
         if (productCode.equalsIgnoreCase("PINK")) {
             Music myMusic = new Music();
             myMusic.setCode(productCode);
             myMusic.setDescription("Wish You Were Here");
             myMusic.setPrice(7.99);
             myMusic.setArtist("Pink Floyd");
             myMusic.setLabel("Columbia Group");
             myProduct = myMusic;
         }
         if (productCode.equalsIgnoreCase("kdl43")){
             TV myTV = new TV();
             myTV.setCode(productCode);
             myTV.setDescription("SONY BRAVIA SMART TV KFL43WF663");
             myTV.setPrice(819.00);
             myTV.setScreenSize("55\"");
             myTV.setManufacture("Sony");
             myProduct = myTV;
         }

         return myProduct;
     }
}

