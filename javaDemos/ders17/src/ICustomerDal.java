public interface ICustomerDal {

    //dal data access layer demektir.
    //interface ler class değildir sadece referans tutabilirler.
    //java da katmanlar vardır. bu katmanlar arasında bağlantılar interfacelere yazılır.

    //bu interface i implement eden herkes aşağıdaki methodu kullanmak zorundadır.

    //method interface de bu şekilde tanımlanır.
    void Add();
}
