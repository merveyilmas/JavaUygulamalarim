public class Main {

    public static void main(String[] args) {

        System.out.println(topla(2,4));
        System.out.println(topla2(1,2,3,4,5,6));
    }

    public static int topla(int sayi1, int sayi2){

        return sayi1+sayi2;
    }

    public static int topla2(int... sayi1){

        int toplam=0;

        for(int i=0;i<sayi1.length;i++){
            toplam+=sayi1[i];
        }
        return toplam;
    }
}
