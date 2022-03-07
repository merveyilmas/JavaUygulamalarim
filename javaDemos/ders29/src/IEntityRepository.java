public interface IEntityRepository<T extends IEntity > {
     //entity veritabanı nesnesi demektir.
     //veritabanın da yapılacak metotları tanımladık.

     //T yi IEntity e extends ettik böylece generic sınırlaması yaptık.
     //yani entity interfacesine bağlı olmayan sınıfların türünden değişken alınamaz.

     void add(T entity);
     void delete(T entity);
     void update(T entity);

}
