import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String,String> sozluk=new HashMap<String,String>();
        sozluk.put("book","kitap");
        sozluk.put("door","kapı");
        sozluk.put("umbrella","şemsiye");
        //sozluk.remove("door");
        //sozluk.clear();

        System.out.println(sozluk);
        System.out.println(sozluk.get("door"));
        System.out.println("HashMap'in boyutu: "+sozluk.size());

        for(String item:sozluk.keySet()){
            System.out.println("Ahahtar kelime: "+item+" Değeri: "+sozluk.get(item));
        }




    }
}
