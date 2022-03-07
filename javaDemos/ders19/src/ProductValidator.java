public class ProductValidator {

    //new leyerek method kullanırsak bu yapıcı metod çalışır.
    public ProductValidator(){

        System.out.println("Yapıcı method çalıştı.");
    }

    //new lemeden static methodu direkt kullanırsak bu yapıcı metod çalışır.
    //birden fazla static yapıcı metod oluşturulabilir.
    static{
        System.out.println("Static yapıcı method çalıştı.");
    }

    public static boolean isValid(Product product){

        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }

    }

    //ana class static tanımlanamaz ama içinde oluşturulan başka bir class static tanımlanabilir.
    //bu class a inner class denir.

    /*public static class BaskaClass{

        public static void ekle(){

        }
    }*/
}
