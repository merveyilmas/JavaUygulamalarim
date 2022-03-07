public class Validator {
    //bir nesnenin kurallara uyup uymadığını validator ile ölçeriz.

    //validate doğrulama demek.
    //mesela ürünün adı doğru yazılmış mı, en az 2 karakter olmalı vs.

    //metotları generic yapma;
    public <T extends IEntity> void validet(T entity){

        //yani bu metottada generic sınırlaması yaptık
        //sadece customer ve product türünden değişken yollayabiliriz bu metoda.
    }
}
