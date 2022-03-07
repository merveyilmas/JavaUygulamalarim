public class BalanceInsufficentException extends Exception{
    //buraya kendimiz bir hata türü oluşturduk.

    String message;

    public BalanceInsufficentException(String message){

        this.message=message;
    }

    @Override
    public String getMessage() {

        return this.message;
    }
}
