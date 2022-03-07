public class Main {

    public static void main(String[] args) {

        /*
        //abstract sınıflar kendi başlarına new lenemez. Aşağıdaki gibi kullanılırlar.
        //Ama biz bu yöntemi kullanmayacağız.
        GameCalculater gameCalculater=new GameCalculater() {
            @Override
            public void hesapla() {

            }
        };*/

        //bu yapıyı kullanacağız.
        GameCalculater gameCalculater=new WomenGameCalculator();
        gameCalculater.gameOver();
        gameCalculater.hesapla();
    }
}
