import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers=new ArrayList<Customer>();
        customers.add(new Customer(1,"Merve","Yılmaz"));
        customers.add(new Customer(2,"Sena","Yılmaz"));
        customers.add(new Customer(3,"Rabia","Yılmaz"));
        customers.add(new Customer(4,"İrem","Yılmaz"));

        customers.remove(new Customer(4,"İrem","Yılmaz"));
        //new ile yeni bir referans oluşturduğumuz için listeden eleman silinmez.

        Customer selda=new Customer(4,"Selda","Yılmaz");
        customers.add(selda);
        customers.remove(selda); //bu şekilde silinir.


        for(Customer c:customers){
            System.out.println(c.firstName);
        }
    }
}
