public class Main {

    public static void main(String[] args) {

        char harf='O';

        switch(harf){
            case 'A':
            case 'O':
            case 'U':
            case 'I':
                System.out.println("Kalın sesli bir harfdir");
                break;
            default:
                System.out.println("İnce sesli bir harfdir");
                break;

        }
    }
}
