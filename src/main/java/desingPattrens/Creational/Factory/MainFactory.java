package main.java.desingPattrens.Creational.Factory;

public class MainFactory {
    /**
     * Factory' nin kelime anlamı üretim.
     * Üretim denince akla ilk gelen bu tasarım kalıbının creational bir tasarım kalıbı olduğu.
     * Peki ne üreticek?
     * Yani aklımıza gelebilecek her türlü nesneyi üretebilir.
     * Nesneyi oluşturma işini müşteriden fabrikaya bırakmak için bu tasarım kalıbını kullanabilriz.
     *
     * Örn: Kullandığımız araç.
     * Kullanığımız araçları galeri'den alıırız. Ama fabrikalarda üretilirler.
     * Bizde nesneyi oluşturma işlemini, daha detaylı örneklendirirsen new' leme işlemini fabrikalara vereceğiz.
     * @param args
     */

    public static void main(String[] args) {
        ICar hatchbackAraba=CarFactory.getCar("Hatchback");
        ICar sedanAraba=CarFactory.getCar("Sedan");
        System.out.println(hatchbackAraba.getType());
        System.out.println(sedanAraba.getType());
    }
}
