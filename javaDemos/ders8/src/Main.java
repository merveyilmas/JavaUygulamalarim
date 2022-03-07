import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //main metodu static olduğu için static olmayan hiçbir metod çağırılamaz.
        veriAlma();
        bilgilendirmeMesaji();
        bilgilendirmeMesaji2();
        bilgilendirmeMesaji3();
    }

    public static void veriAlma(){
        String sayi= JOptionPane.showInputDialog("Bir sayi giriniz:");
        System.out.println(sayi);
    }

    public static void bilgilendirmeMesaji(){

        JOptionPane.showMessageDialog(null,"Bilgilendirme Mesajı");
    }

    public static void bilgilendirmeMesaji2(){
        JOptionPane.showMessageDialog(null,"Bilgilendirme Mesajı","Sonuc",JOptionPane.OK_OPTION);
    }

    public static void bilgilendirmeMesaji3(){
        int a=7;
        JOptionPane.showMessageDialog(null,a,"Sonuc",JOptionPane.WARNING_MESSAGE);
    }

}
