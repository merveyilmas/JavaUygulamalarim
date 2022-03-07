import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        int[] dizi=new int[]{1,2,3};
        dizi=new int[4]; //burada diziye yeni bir referans değeri atadık.
        System.out.println(dizi[0]); //bu yüzden cevap sıfır yazdırılır. Çünkü yeni referansın değerleri yok.

        //Koleksiyonlar(ArrayList) da aslında bir dizidir.
        //Normal bir diziden farkı;
        //yeni bir referans oluşturulduğunda eski referanstaki değerleri yeni referansa atar ve
        //üzerine ekleme ypmaya devam eder.
        //Yani dizilerin geliştirilmiş halidir.

        //Aşağıdaki gibi tanımlanan arrayliste her türden değişken ekleyebiliriz.
        ArrayList arrayList=new ArrayList();
        arrayList.add(1);
        arrayList.add("Ankara");
        arrayList.add(13);
        //arrayList.remove(0);
        //arrayList.clear();
        System.out.println("Diziniz boyutu: "+arrayList.size());
        System.out.println("3. indeks: "+arrayList.get(2));
        System.out.println("1. indeks değiştirildi: "+arrayList.set(0,100));

        int i=0;

        for(Object o: arrayList){

            System.out.println(i+". indeks: "+o);
            i++;
        }

        System.out.println("---------------------------");
        i=0;

        //string tipinde bir arraylist oluşturduk.
        ArrayList<String> arrayList2=new ArrayList<String>();
        arrayList2.add("Zonguldak");
        arrayList2.add("Ankara");
        arrayList2.add("Trabzon");

        Collections.sort(arrayList2);

        for(String s: arrayList2){

            System.out.println(i+". indeks: "+s);
            i++;
        }



    }
}
