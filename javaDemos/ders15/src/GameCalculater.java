public abstract class GameCalculater {

    //abstract sınıfda illa abstract method olmak zorunda değildir.

    //hesapla methodunu bu sınıfa bağlı olan diğer sınıflar kulllanmak zorunda abstract olarak tanımladığımız için.
    //her türe göre puan hesaplaması farklı olduğu için alt sınıflar kendilerine göre bu methodu override eder.
    //ve her türün puanı hesaplanması zorunlu old. için abstract tanımladık ki tüm türlerin puanları hesaplansın.
    public abstract void hesapla();

    //oyun herkes için aynı biteceği için bu method tüm alt sınıflar için aynıdır.
    // final anahtar kelimesini koyduğumuz için bu method override edilemez.
    public final void gameOver(){

        System.out.println("Oyun bitti.");
    }
}
