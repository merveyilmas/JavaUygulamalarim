public class AccountManager {

    private double balance;

    public void deposit(double amount){

        balance = getBalance() + amount;
    }

    public void withdraw(double amount) throws BalanceInsufficentException {

        if(amount<=balance){
            balance = getBalance() - amount;
        }else{
            //çekilmek istenen para miktarı hespta yok ise hata fırlattık.
            throw new BalanceInsufficentException("Bakiye yetersiz!");
        }

    }

    public double getBalance() {
        return balance;
    }

    //balance: hesaptaki para miktarı
    //deposit: yatırıolan para
    //amount: miktar
    //withdraw: hesaptan para çekmek
}
