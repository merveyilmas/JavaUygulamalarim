public class ProductManager {

    public void add(Product product){

        //biz bu şekilde nesne oluşturup fonksiyonu çağırmak istemezsek o fonksiyonu static tanımlarız.
        //ve static tanımlayar class adı ile o methoda erişebiliriz.
        //ama referans oluşturudğumuzda onunla işimiz bitince o referans gösterilen yer bellekten atılır.
        //ama static tanımladığımız methodlar bellkten atılmaz.
        //ProductValidator productValidator=new ProductValidator();

        if(ProductValidator.isValid(product)){
            System.out.println("Eklendi.");
        }else{
            System.out.println("Ürün bilgileri geçersiz.");
        }
    }
}
