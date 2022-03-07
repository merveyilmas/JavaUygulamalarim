import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        readFile();
        writeFile();
        readFile();

    }

    public static void fileCreate(){

        File file=new File("C:\\javaDemos\\files\\students.txt");

        try {
            //createNewFile dosya oluşturulduysa true, oluşturulmadıysa false döndürür.
            if(file.createNewFile()){
                System.out.println("Dosya Oluşturuldu..");
            }else{
                System.out.println("Dosya zaten mevcut..");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void getFileInfo(){

        File file=new File("C:\\javaDemos\\files\\students.txt");

        //exists böyle bir dosya var mı yok mu kontrol eder.
        if(file.exists()){

            System.out.println("Dosya Adı: "+file.getName());
            System.out.println("Dosya Yolu: "+file.getAbsolutePath());
            System.out.println("Dosya Yazılabilir mi?: "+file.canRead());
            System.out.println("Dosya Okunabilir mi?: "+file.canRead());
            System.out.println("Dosya Boyutu (byte): "+file.length());
        }

    }

    public static void readFile(){

        File file=new File("C:\\javaDemos\\files\\students.txt");

        try {

            Scanner reader=new Scanner(file);

            //hasNextLine okunacak satır varsa demek.
            while (reader.hasNextLine()){

                String line= reader.nextLine();
                System.out.println(line);
            }
            reader.close(); //bellekte açık kalmasın diye kapatmalıyız.

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(){

        try {
            //dosya adından sonra true yazmazsak her şeyi siler ve üstüne yazar.
            BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\javaDemos\\files\\students.txt",true));
            writer.newLine(); //yeni satır oluşturduk alt satıra yazması için.
            writer.write("Merve Yılmaz"); //dosyaya yazdık.
            System.out.println("Dosyaya yazıldı..");
            writer.close(); //bellekte açık kalmasın diye kapattık.

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
