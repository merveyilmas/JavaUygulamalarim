//java da tanımlı paketler vardır. bunlara built-in denir.
import java.util.Scanner;

//bizim yazdığımız paket:
import matematik.DortIslem;
import matematik.Logaritma;
//bu ikisini ayrı ayrı tanımlamak yerine;
// import matematik.*;
//bu şekilde de tanımlayabiliriz

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Sayı giriniz:");
        int sayi=scanner.nextInt();
        System.out.println("Sayınız: "+sayi);

        //class adını yazınca kendisi import ediyor paketi.
        DortIslem dortIslem=new DortIslem();
        System.out.println(dortIslem.topla(2,6));

        Logaritma logaritma=new Logaritma();
        System.out.println(logaritma.logaritmaHesapla());


    }
}
