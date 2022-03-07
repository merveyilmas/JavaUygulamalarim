public class Main {

    public static void main(String[] args) {

        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Çok Basarili Geçtiniz..");
                break;
            case 'B':
                System.out.println("Basarili Geçtiniz..");
                break;
            case 'C':
                System.out.println("Orta Geçtiniz..");
                break;
            case 'D':
                System.out.println("Kötü Geçtiniz..");
                break;
            default:
                System.out.println("Kaldınız");
        }

        /*switch (grade) {
            case 'A':
            case 'B':
                System.out.println("Basarili Geçtiniz..");
                break;
            //A ile B de de aynı çıktıyı vermek istiyor.
        }*/
    }
}
