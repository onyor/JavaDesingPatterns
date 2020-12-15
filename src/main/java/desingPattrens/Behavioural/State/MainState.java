package main.java.desingPattrens.Behavioural.State;

public class MainState {
    /**
     * State -> Durum anlamına gelmektedir.
     * Bir nesnenin içinde bulunduğu durum değiştiğinde sanki bu nesne komple değişmiş gibi bir reaksiyon vermesini sağlayan bir desing pattern'dir.
     * @param args
     */

    /**
     * Örn:
     * PS konsol da bir futbol maçı yapıyor olalım.
     * Eğer takımımız attack yapıyor ise konsol daki tuşlar farklı fonksiyonlar da
     * Eğer takımımız defence durumundaysa konsolda ki tuşlar bu sefer yine farklı fonksiyonlar da çalışırlar.
     * İşte bu tam olarak state desing pattern'dir.
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        Oyun oyun = new Oyun();

        Thread thread = new Thread();

        oyun.x();
        beklemeSuresi(thread);
        oyun.yuvalar();
        beklemeSuresi(thread);
        oyun.kare();
        beklemeSuresi(thread);
        oyun.topuKaptır();
        beklemeSuresi(thread);
        oyun.x();
        beklemeSuresi(thread);
        oyun.kare();
        beklemeSuresi(thread);
        oyun.topuKap();
        beklemeSuresi(thread);
        oyun.ucgen();
        beklemeSuresi(thread);
        oyun.x();
        beklemeSuresi(thread);
        oyun.kare();
        beklemeSuresi(thread);
        System.out.println("Vurdu Gol olduuuuuu. GOL GOL GOL !!!!");
    }

    private static void beklemeSuresi(Thread thread) throws InterruptedException {
        thread.sleep(1000);
    }
}
