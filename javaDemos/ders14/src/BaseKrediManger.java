public class BaseKrediManger {

    public double hesapla(double tutar){
        return tutar*1.15;
    }
    /*
    //eğer metoda final keyword eklersek bu metod hiçbir yerde override edilemez.
    public final double hesapla(double tutar){
        return tutar*1.11;
    }*/
}
