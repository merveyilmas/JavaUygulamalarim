public class KronometreThread implements Runnable {
    //biz threadimizi bu class a yazacağız.
    //o yüzden java da bulunan runnable interfaceini implement ettik.

    private Thread thread;
    private String threadName; //threadleri birbirinden ayırabilmek için tanımladık.

    public KronometreThread(String threadName){
        //threade ismini verebilmke için yapıcı metod oluşturduk.
        this.threadName=threadName;
        System.out.println("Oluşturuluyor: "+threadName);
    }

    @Override
    public void run() {
        //bu metodun içine yazdıklarımız thread şeklinde çalışacaktır.
        System.out.println("Çalıştırılıyor: "+threadName);

        //kronometremizi oluşturuyoruz.
            try {

                for(int i=1;i<10;i++){
                System.out.println(threadName+": "+i);
                Thread.sleep(1000); //burası 1 saniye bekletir görebilmemiz için.
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //biz burda kronometre örneği yaptık ama burada mesela;
            // veritabanından 1000 tane kayıt çekeceğiz her türlü işlemi yaptırabilirz.

        System.out.println("Thread bitti: "+threadName);

    }

    public void start(){
        System.out.println("Thread nesnesi oluşuyor..");

        if (thread==null){
            thread=new Thread(this,threadName);
            thread.start();
        }
    }
}
