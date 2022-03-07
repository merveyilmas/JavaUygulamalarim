import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        
        //finally bloğunda dosyayı kapatabilmek için buraya tanımladık.
        BufferedReader bufferedReader = null;

        int total=0;

        try {
            //bazı fonksiyonları try-catch in içine yazmamız gerekir.
            //yazmazsak hata verir. BUnlardan birisi de fileReader dır.
            bufferedReader=new BufferedReader(new FileReader("C:\\javaDemos\\ders25\\src\\file.txt"));

            //dosyalar satır satır okunur. bu yüzden bunu tanımladık.
            String line=null;
            while ((line=bufferedReader.readLine()) != null){

                //tüm satırları tek tek topladık.
                total+=Integer.valueOf(line);
            }
            System.out.println("Toplam: "+total);

        }catch (FileNotFoundException e){
            //dosya bulunamadı hatası

            e.printStackTrace();
        }finally {

            //eğer dosya açılmış halde değilse kapatılacak bir dosya yoktur.
            //dolayısıyla yine hata ile karşılaşırız.
            //bu yüzden main fonksiyonuna throws ile exception ı eklememiz gerekir.
            //çünkü buradan da bir hata çıkabilir.
            //eğer main fonk nun oraya throws ile hata yazmak istemiyorsak finally bloğunu da try-catch içine alabiliriz.
            /*try {
            bufferedReader.close();
        }catch (Exception e){
            e.printStackTrace();
        } */
            
            bufferedReader.close();
        }

    }
}
