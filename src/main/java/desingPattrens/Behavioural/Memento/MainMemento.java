package main.java.desingPattrens.Behavioural.Memento;

public class MainMemento {
    /**
     * Memento -> Hatıra
     * Bir nesnenin daha önceden istediğimiz herhangi bir durumuna dönmesini istersek bu desing pattern' i kullanabilriz.
     *
     * Örn;
     * Elimiz de bir notepad olsun. Klavyeden yazılar giriyoruz diyelim.
     * Yazarlardan kayıt alıyoruz.
     * Yazma işlemini yaparken hata yaptık diyelim, önceki aldığımız kayıt a geri dönebiliyoruz.
     * @param args
     */
    public static void main(String[] args) {
        Hafiza hafiza = new Hafiza();

        NotePad notePad = new NotePad();

        notePad.ekle("O");
        notePad.ekle("N");
        notePad.ekle("U");
        notePad.ekle("R");

        /**
         * Kaydetme anında NotePad nesnesin den metin alınarak,
         * NotePadMemento sınıfına yollanır, instance' ı alınır ve bir nesne oluşturulur.
         * Bu nesne NotePadMemento türünde bir nesnedir ve Hafıza class' ında bir listeye eklenir.
         */
        versiyonKaydet(hafiza, notePad);

        notePad.ekle("_YILDIZ");

        versiyonKaydet(hafiza, notePad);
        notePad.ekle(".");
        notePad.yazdir();
        geriAl(hafiza, notePad);
        versiyonKaydet(hafiza,notePad);

        notePad.ekle("!!!");

        geriAl(hafiza, notePad);

    }

    private static void geriAl(Hafiza hafiza, NotePad notePad) {
        notePad.geriDon(hafiza.sonVersiyonuGetir());
        notePad.yazdir();
    }

    private static void versiyonKaydet(Hafiza hafiza, NotePad notePad) {
        NotePadMemento memento = notePad.kaydet();
        hafiza.ekle(memento);

        notePad.yazdir();
    }
}
