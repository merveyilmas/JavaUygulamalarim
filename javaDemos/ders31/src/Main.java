import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {

        //selectDemo();
    }

    public static void selectDemo() throws SQLException {
        Connection connection=null;
        DbHelper helper=new DbHelper();

        Statement statement=null; //statement cümle demek. Sql sorgularımızı bu nesne ile yapacağız.
        ResultSet resultSet; //sonuçlar topluluğu dmeek. Yani bizim sorgularımızın sonuçları burada toplanır.

        try{

            connection=helper.getConnection(); //bağlantımızı yaptık.

            statement=connection.createStatement();
            resultSet=statement.executeQuery("select Code,Name,Continent,Region from country");

            //verilerimizi kaydetmek için country türünde arrraylist oluşturduk.
            ArrayList<Country> countries=new ArrayList<Country>();

            while (resultSet.next()){ //resultSet i tek tek iterasyon yapacak
                //System.out.println(resultSet.getString("Name"));
                //verilerin türü ne ise onu kullanacağız: getString.

                //verileri arrayliste country türünde ekkledik.
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }
            System.out.println(countries.size()); //verileri kayıt etmiş mi kontrol ediyoruz.

        }catch(SQLException exception){
            helper.showErrorMessgae(exception);
        }finally {
            connection.close();
        }
    }

    public static void insertData() throws SQLException {
        Connection connection=null;
        DbHelper helper=new DbHelper();

        //insert işlemini biz genelde kullanıcıdıan aldığımız için PreparedStatement kullanırız.
        PreparedStatement statement=null;
        ResultSet resultSet; //sonuçlar topluluğu dmeek. Yani bizim sorgularımızın sonuçları burada toplanır.

        try{
            //bağlantımızı yaptık.
            connection=helper.getConnection();

            //? lerini biz vericez.
            String sql="insert into city(Name,CountryCode,District,Population) values(?,?,?,?)";

            //cümleyi hazırladık.
            statement=connection.prepareStatement(sql);

            // (? sırası,veri)
            statement.setString(1,"Düzce 2");
            statement.setString(2,"TUR");
            statement.setString(3,"Turkey");
            statement.setInt(4,100000);

            //kaç tane değişkeni etkilediğini görmek için result ı ekrana yazdırabiliriz. değişkene atamasak da olur.
            int result=statement.executeUpdate(); //ve çalıştırdık.

            System.out.println("Kayıt eklendi.");

        }catch(SQLException exception){
            helper.showErrorMessgae(exception);
        }finally {
            connection.close();
            statement.close();
        }
    }

    public static void updateData() throws SQLException {
        Connection connection=null;
        DbHelper helper=new DbHelper();

        //insert işlemini biz genelde kullanıcıdıan aldığımız için PreparedStatement kullanırız.
        PreparedStatement statement=null;
        ResultSet resultSet; //sonuçlar topluluğu dmeek. Yani bizim sorgularımızın sonuçları burada toplanır.

        try{
            //bağlantımızı yaptık.
            connection=helper.getConnection();

            //? lerini biz vericez.
            String sql="update city set population=100000,district='Turkey' where id=?";

            //cümleyi hazırladık.
            statement=connection.prepareStatement(sql);
            //id mizi verdik.
            statement.setInt(1,4090);


            //kaç tane değişkeni etkilediğini görmek için result ı ekrana yazdırabiliriz. değişkene atamasak da olur.
            int result=statement.executeUpdate(); //ve çalıştırdık.

            System.out.println("Kayıt güncellendi.");

        }catch(SQLException exception){
            helper.showErrorMessgae(exception);
        }finally {
            connection.close();
            statement.close();
        }
    }

    public static void deleteData() throws SQLException {
        Connection connection=null;
        DbHelper helper=new DbHelper();

        //insert işlemini biz genelde kullanıcıdıan aldığımız için PreparedStatement kullanırız.
        PreparedStatement statement=null;
        ResultSet resultSet; //sonuçlar topluluğu dmeek. Yani bizim sorgularımızın sonuçları burada toplanır.

        try{
            //bağlantımızı yaptık.
            connection=helper.getConnection();

            //? lerini biz vericez.
            String sql="delete from city where id=?";

            //cümleyi hazırladık.
            statement=connection.prepareStatement(sql);
            //id mizi verdik.
            statement.setInt(1,4090);


            //kaç tane değişkeni etkilediğini görmek için result ı ekrana yazdırabiliriz. değişkene atamasak da olur.
            int result=statement.executeUpdate(); //ve çalıştırdık.

            System.out.println("Kayıt silindi.");

        }catch(SQLException exception){
            helper.showErrorMessgae(exception);
        }finally {
            connection.close();
            statement.close();
        }
    }
}
