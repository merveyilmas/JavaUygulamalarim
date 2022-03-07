public class CustomerManager {

    // birinci yol sacede bunu kullanırız ve maindeki birinci yol referanslamayı kullanırız.
    // ICustomerDal iCustomerDal;

    //ikinci yol
    private ICustomerDal iCustomerDal;

    //ikinci yolda yapıcı method oluştururuz.
    public CustomerManager(ICustomerDal iCustomerDal){
        this.iCustomerDal=iCustomerDal;
    }

    public void add(){
        //burada iş kodları yazılır. Müşterinin ismi eklendi vs.

        //eğer aşağıdaki bu yapıyı kullanırsak bağlı oluruz yani sistem sadece oracle da çalışıyor demek.
        //OracleCustomerDal oracleCustomerDal=new OracleCustomerDal();

        //o yüzden bu şekilde kullanırız.
        iCustomerDal.Add();
    }
}
