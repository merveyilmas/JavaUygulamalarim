public class MySqlCustomerDal implements ICustomerDal, IRepository{

    //Interfacelerde extends yerine implements kelimesi kullanılır.
    //implement in extends den farkı; bir class birden fazla interface i implement edebilir.
    //eğer arada extends kullanılacaksa şu şekiled kullanılır;
    //public class MySqlCustomerDal extends OracleCustomerDal implements ICustomerDal, IRepository

    @Override
    public void Add() {

        System.out.println("My sql eklendi.");
    }
}
