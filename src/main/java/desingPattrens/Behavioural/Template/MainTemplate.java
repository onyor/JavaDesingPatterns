package main.java.desingPattrens.Behavioural.Template;

public class MainTemplate {
    /**
     * Template -> Şablon anlamına gelmektedir.
     * Behavioural bir tasarım kalıbıdır.
     *
     * Bir işlemdeki algoritmanın iskeletini belirleyin ve bunu üst sınıfta yapın.
     * Bu işlemde ki bazı adımları, bazı implementasyonları ise alt sınıfa erteleyeyin.
     *
     * Bu sayede alt sınıflara algoritmanın yapısını değiştirme olanağı vermeden,
     * Sadece bu algoritmanın izin verilen adımlarının değiştirilmesine olanak sağlayın.
     * @param args
     */

    /**
     * Örn:
         * Kuruma verilecek bir dilekçe düşünün ve sürekli kuruma aynı dilekçenin bir çok farklı örneklerinden geliyo olsun.
         * Bu dilekçelerin analizi ve okunması zor olacaktır.
         * Biz bu farklı farklı dilekçe örneklerinde asıl iskeleti(gerekli olan bilgileri) çıkartıp bir şablon yaparsak.
         * Artık dilekçeler daha okunabilir ve kolay yazılabilir olacaktır!
     * @param args
     */
    public static void main(String[] args) {
        AnadoluLisesiDilekce anadoluLisesiDilekce = new AnadoluLisesiDilekce("12-Fen-A", "1093", "Onur Yıldız");
        FenLisesiDilekce fenLisesiDilekce = new FenLisesiDilekce("10", "91", "Seçil Şahin", "B");


        anadoluLisesiDilekce.dilekceYazdir();

        System.out.println("\n\n");
        fenLisesiDilekce.dilekceYazdir();
    }
}
