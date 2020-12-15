package main.java.desingPattrens.Structural.Adapter;

public class MainAdapter {
    /**
     * Adapter -> Prizden 220V gelen enerji'yi 19V(misal) dönüştürerek bilgisayarın çalışmasını sağlar!
     * Adapter kısaca dönüştürmeye yarar diyebiliriz.
     * Yapısal(Structural) bir desing pattern söz  konusu.
     * @param args
     */

    /**
     * Örn;
     * Telefon <--- Adapter <---- Priz
     * @param args
     */


    /**
     * Başka bir örnek!!
     * Aracı bir uygulama yazalım.
     * Bir servisten veri alıyoruz, başka bir servise paslıyoruz.
     * Gelen verileri XML formatın da alıyoruz diyelim. Fakat paslamak istediğim servis de bendeb JSON formatın da istiyor.
     * XML <-> JSON adapter yazmamız gerekiyor.
     * @param args
     */
    public static void main(String[] args) {
        Priz priz=new Priz();

        ElektrikliEvAletleri elektrikliEvAletleri = new Buzdolabı();
        priz.elektrikVer(elektrikliEvAletleri);

        priz.elektrikVer(new TelefonEEAAdapter(new SamsungTelefon()));

    }
}
