import java.awt.*;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        //stringi char dizisi olarak düşünebiliriz, 0. indisten başlar.
        String mesaj="Bugün hava çok güzel.";

        System.out.println(mesaj);
        System.out.println("Eleman sayısı:"+mesaj.length());
        System.out.println("5. harf:"+mesaj.charAt(4));
        System.out.println(mesaj.concat(" yaşasın!"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("s"));

        char[] karakterler=new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf('e'));

        String yenimesaj=mesaj.replace(" ","-");
        System.out.println(yenimesaj);

        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2,4));

        for(String kelime:mesaj.split(" ")){

            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        String yeniMesaj="    trim deneme    ";
        System.out.println(yeniMesaj.trim());
    }
}
