# MongoDriverDaoBoot
Atlas cloud connection

1. host, uri olmalı diğer durumda hata veriyor.
2. mongodb atlas linux veriyor içine mongod binary kuruyor server olarak ayağa kalkıyor
   dns veriyor elastic ip veriyor.


---
  Run the boot application from mvn process
---
1. Download project and maven application, point the pom directory.
2. mvn spring-boot:run


---
Boot Olmasaydı Dao Katmanını Kendimiz Yazıcaktık Dao Exception, Template Mantığını Koyup. enum olucaktı
---

MongoClientURI uri = new MongoClientURI(
                "mongodb+srv://tugberk:<pass>@couples-list-chvsn.mongodb.net/test?retryWrites=true");

        MongoClient mongoClient = new MongoClient(uri);
        System.out.println(mongoClient);

        MongoDatabase db = mongoClient.getDatabase("wishdb");

        var col = db.getCollection("wishs");
        for (var document : col.find())
            System.out.println(document.get("todo"));

        System.out.println(col.countDocuments());
        System.out.println(col.count());
