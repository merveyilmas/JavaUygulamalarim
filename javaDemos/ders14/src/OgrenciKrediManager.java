public class OgrenciKrediManager extends BaseKrediManger{

    //baseKrediManager daki hesapla fonk yerine aynı isimdeki bu fonk çalışır ve biz o fonk u ezmiş olduk.
    //buna override (üzerine yaazma) denir.
    public double hesapla(double tutar){

        return tutar*1.10;
    }
}
