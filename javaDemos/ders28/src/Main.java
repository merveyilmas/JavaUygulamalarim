import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //arrayList string türünde bir class tır. Bu şekilde ki yapılara generic class denir.
        //generic old zaman farklı türler ile çalışmamız sağlanıyor.
        //generic lere tip güvenli çalışmak için ihtiyaç duyarız.
        ArrayList<String> arrayList=new ArrayList<>();

        MyList<String> sehirler=new MyList<>();
        sehirler.add("alaplı");

        MyList<Customer> customer=new MyList<>();
        customer.add(new Customer());


    }
}
