public class Main {

    public static void main(String[] args) {

        AccountManager accountManager=new AccountManager();
        accountManager.deposit(1000);

        try {
            //hata çıkma olasılığı old için yani throw ile hata fırlayabilir.
            //bu yüzden try-cacth içinde yazmalıyız. Yoksa hata verir.
            accountManager.withdraw(2000);
        } catch (BalanceInsufficentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hesap bakiyesi: "+accountManager.getBalance());


    }
}
