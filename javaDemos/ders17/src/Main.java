public class Main {

    public static void main(String[] args) {

        /*
        //interfacelerde abstractlar gibi yalnız new lenemezler.
        ICustomerDal iCustomerDal=new ICustomerDal() {
            @Override
            public void add() {

            }
        };*/

        //bu şekilde interfaceler onu implement eden başka class ın polymorphisim kullanarak referansını tutabilir.
        //ICustomerDal iCustomerDal=new OracleCustomerDal();

        //sadece bu şekilde referans oluşturamıyoruz interfacelerde.
        //çünkü hem interfaceler newlenemez. Biz de customer manager da ICustomerDal ı kullandığımız için methodda interface new lemiş oluruz.
        //newlesek bile gösterilecek bir şey olmadığı için metodda hata verir.
        /*CustomerManager customerManager=new CustomerManager();
        customerManager.add();*/

        //o yüzden bu şekilde polymorphisim kullanarak referans eşitleriz.
        //veri tabanını değistirmek istersek eşitlediğimiz referansı değiştiririz.
        //birinci yol
        /*CustomerManager customerManager=new CustomerManager();
        customerManager.iCustomerDal=new OracleCustomerDal();
        customerManager.add();*/

        //ikinci yol daha çok kullanılır.
        CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}
