public class Main {

    public static void main(String[] args) {

    Product product=new Product();
    product.name="mause";
    product.price=1000;

    ProductManager productManager=new ProductManager();
    productManager.add(product);

    //static tanımladığımız için direkt class adı ile erişebildik.
    DatabaseHelper.Crud.delete();


    }
}
