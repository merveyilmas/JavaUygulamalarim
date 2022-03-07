public class Main {

    public static void main(String[] args) {

        //yazdığımız programı müşterinin istediği veritabanına kaydedebileceği programı yazacağız.
        //müşteriler farklı veritabanları kullanabilir.

        CustomerManager customerManager=new CustomerManager();
        customerManager.databaseManager=new OracleDatabaseManager();
        customerManager.getCostumers();
    }
}
