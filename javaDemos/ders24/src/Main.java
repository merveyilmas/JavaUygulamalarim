public class Main {

    public static void main(String[] args) {

	try{
        int[] sayilar=new int[]{1,2,3};
        System.out.println(sayilar[4]);

    }catch(StringIndexOutOfBoundsException e){

        //hata var ise hatayı yazdırdık.
        System.out.println(e);

    }catch (ArrayIndexOutOfBoundsException e) {

        //hataları yakalamayı böyle ayırmamızın sebebi;
        //Hataya göre kullanıcıları yönlendirebiliriz.
        //Mesela hesapta para yok para yükleme sayfasına yönlendirilir.
        System.out.println(e);

    }catch (Exception e){

        System.out.println("Loglandı: "+e);

    }finally{

        System.out.println("Burası her türlü çalışır. Hata olsa da olmasa da..");
        //burayı şu şekilde kullanırız;
        //mesela try da veri tabanı işlemleri için veritabanını açtık.
        //ama hata aldık.
        //veri tabanı açık kalıp bellekte yer kaplamaması için kapatmamız lazım.
        //burada kapatırız.
    }

    }
}
