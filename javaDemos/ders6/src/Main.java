public class Main {

    public static void main(String[] args) {

        //reference type(aşağıdaki nesne);   //new ile bellekte yeni bir yer açtık.
        CustomerManager customerManager=new CustomerManager();
        customerManager.add();
        customerManager.remove();
        customerManager.update();

        //value type (stack de kaydedilir veriler)
        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2);

        //reference type (heap de adres ile gösterilir değerler)
        int[] dizi1=new int[]{1,2,3};
        int[] dizi2=new int[]{4,5,6};
        dizi2=dizi1; //şu anda dizi1 in adresi dizi2 ye atandı ikisi de aynı adresi gösteriyor.
        dizi1[0]=10;
        System.out.println(dizi2[0]); //aynı adresi gösterdikleri için çıktı 10 olur.
    }
}
