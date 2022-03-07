public class Main {

    public static void main(String[] args) {

        BaseKrediManger[] krediMangers=new BaseKrediManger[]{
                new TarimKrediManager(), new OgretmenKrediManager(), new OgrenciKrediManager()};

        for(BaseKrediManger krediManger:krediMangers){
            System.out.println(krediManger.hesapla(1000));
        }
    }
}
