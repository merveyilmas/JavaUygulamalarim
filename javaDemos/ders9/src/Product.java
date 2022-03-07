public class Product {

    //attribute | fields
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod;
    //attribute'lar yukarıdaki gibi önüne _ konularak da yazılır. Buradan attribute olduğunu anlayabiliriz.
    //_ koyarsak this kullanmamıza gerek kalmaz.
    // Ama ide nin kolay set/get oluşturma şekline göre this kullanarak da yaparız.
    //bu ide de öyle olduğu için _ kullanmadan isimlendirdik.

    //private(özel) tanımlanan değişkenlere sadece bulunduğu yerden erişilebilir.
    // Yani bir üst parantezden. Burada Product class'ı.

    //constructor oluşturduk.
    public Product(int id, String name, String description, double price, int stockAmount){
        System.out.println("Yapıcı metod çalıştı.");
        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;
        this.stockAmount=stockAmount;

    }

    public Product(){
        //bu constructor ı set ile tek tek değer vermek için oluşturduk.
        //aynı isimde iki tane contructor oluşturmamıza overloading denir.
    }

    //Değişkenlere başka yerden erişebilmek için getter/setter metodlarını yazarız.
    // Bunları erişilebilir olması için public yazarız.
    //bu şekilde setter/getter metodlarını kullanarak encapsulation yapmış oluruz.
    public int getId(){
        //get almak demek.
        return id;
    }

    public void setId(int id){
        //set kurmak,yazmak demek.
        //this bu class demek.
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0,1)+id;

        //kodun sadece getter'ı var böylece kullanıcının yazmasını engelledik.
        //bu metod kodu kendisi oluşturacak.
        //durumlara göre setter kullanmayabilirz.
    }


}
