package main.java.desingPattrens.Structural.Bridge;
import main.java.desingPattrens.Structural.Bridge.cihaz.BilgisayarHS;
import main.java.desingPattrens.Structural.Bridge.cihaz.TelefonHF;
import main.java.desingPattrens.Structural.Bridge.muzikcalar.FizzyApp;
import main.java.desingPattrens.Structural.Bridge.sescihazi.HoparlorCihaz;

public class MainBridge {
    public static void main(String[] args) {
        /**
         * Bridge tasarım kalıbı tasarımlarımızı yaparken soyutlamalar yaparak daha esnek uygulamalar yapmamızı sağlayan bir tasarım kalıbı.
         * Bir soyutlamayı onun kendi implementasyonun dan ayırki ikiside birbirinden bağımsız bir şikilde çeşitlendirilebilsin.
         * Burada bahsedilen nesnenin veya uygulamanın yapısı.
         *
         * Örn:
         * Müzik dinleyeceğiz.
         * Bir cihaza ihtiyaç var -> Bilgisayar
         * Bilgisayarın müzik çalara -> Spotify
         * Peki sesi ne verecek -> Hoparlör
         */
        Muzik muzik = new Muzik("Sezen Aksu - Gülümse", "Gülümse hadi gülümse");

        BilgisayarHS bilgisayarHS = new BilgisayarHS();
        TelefonHF telefonHF=new TelefonHF(new HoparlorCihaz(),new FizzyApp());

        bilgisayarHS.muzikCal(muzik);
        telefonHF.muzikCal(muzik);
    }
}
