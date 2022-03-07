public class Main {

    public static void main(String[] args) {

        /*BaseLogger[] loggers={new DatabaseLogger(), new EmailLogger(), new FileLogger()};

        for(BaseLogger logger:loggers){
            logger.Log("Log mesajı");  } */

        CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
        customerManager.add();


    }
}
