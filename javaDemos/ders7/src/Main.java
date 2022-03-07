public class Main {

    public static void main(String[] args) {

        DortIslem dortIslem=new DortIslem();

        int sonuc=dortIslem.toplama(3,4);
        System.out.println(sonuc);

        dortIslem.cikarma(5,3);
        dortIslem.carpma(3,7);
        dortIslem.bolme(12,6);
    }
}
