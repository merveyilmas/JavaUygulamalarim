public class Main {

    public static void main(String[] args) {

        //constructor oluşturduktan sonra bu şekilde bilgileri yazabiliriz.
        Product product=new Product(1,"Laptop","Asus Laptop",2000,5);

        /*Product product=new Product();
        product.name="Laptop";
        //System.out.println("Ürünün adı:"+product.name);
        //setter/getter ları yazmadan önce attribute lara bu şekilde erişebiliyorduk.
        //ama setter/getter ları yazınca private çevirdik attributeları bu yüzden set ile değişkenlere yazıyoruz.

        //bunları da kullanabilirz istersek.
        //boş constructor oluşturduk.
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Asus Laptop");
        product.setPrice(2000);
        product.setStockAmount(5);*/

        ProductManager productManager=new ProductManager();
        productManager.add(product);

        //getter metodunu kullanarak bu şekilde okuruz.
        System.out.println(product.getKod());


    }
}
