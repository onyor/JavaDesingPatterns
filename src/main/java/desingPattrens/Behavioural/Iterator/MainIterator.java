package main.java.desingPattrens.Behavioural.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainIterator {
    /**
     * Kelime anlamı -> Yineleyici
     * Bu tasarım kalıbı için kümelenmiş bir nesnenin öğelerini, onların kendi içerisindeki tasarım şeklini göstermeden sırayla erişmek için bir yol sağlar.
     *
     * Örn:
     * Kitap nesnesi içerisinde sorular liste halinde tutuluyor.
     * Fasikül içerisinde de sorular bir array içerisinde tutuluyor.
     *
     * Ve ben bu soruları bir yere yazmak istiyorum. Biri array, diğeri liste döndüğü için bunların her biri için farklı bir operasyon izlemem gerekiyor.
     *
     * Bu pattern de bunların hepsinden bağımsız bir iterator döndürerek nesnelerin içerisinde gezebilmemizi sağlıyor.
     * @param args
     */


    public static void main(String[] args) {
        Kitap kitap = new Kitap("Matematik");
        Fasikul fasikul = new Fasikul("Türkçe");

        /**
         * Yeni İşlem
         */
        Iterator soruIteratorKitap = kitap.getSoruIterator();
        yazdir(soruIteratorKitap);

        Iterator soruIteratorFasikul=fasikul.getSoruIterator();
        yazdir(soruIteratorFasikul);
    }

    private static void yazdir(Iterator soruIterator) {
        while (soruIterator.hasNext()){
            //Soyut bir şey olduğu için (Soru) case işlemini yaptık.
            Soru soru = (Soru) soruIterator.next();

            Long soruNo = soru.getSoru();

            System.out.println("Soru No: " + soruNo);
        }
    }

    /**
     * Bu eski hali yazdırabilmek için ne kadar türde nesne varsa o kadar overloading yapmak gerekiyordu.
     */
    /*
    public static void main(String[] args) {
        Kitap kitap = new Kitap("Matematik");
        List<Soru> soruList = kitap.getSoruList();
        yazdir(soruList);

        Fasikul fasikul = new Fasikul("Türkçe");
        Soru[] sorular = fasikul.getSorular();
        yazdir(sorular);
    }

    private static void yazdir(List<Soru> soruList) {
        for (Soru soru : soruList) {
            Long soruNo = soru.getSoru();
            System.out.println("Soru No: " + soruNo);
        }
    }

    private static void yazdir(Soru[] sorular) {
        for (Soru soru : sorular) {
            Long soruNo = soru.getSoru();
            System.out.println("Soru No: " + soruNo);
        }
    }
    */
}
