package main.java.desingPattrens.Structural.Bridge.cihaz;

import main.java.desingPattrens.Structural.Bridge.Muzik;
import main.java.desingPattrens.Structural.Bridge.muzikcalar.IMuzikCihazi;
import main.java.desingPattrens.Structural.Bridge.muzikcalar.SpotifyApp;
import main.java.desingPattrens.Structural.Bridge.sescihazi.HoparlorCihaz;
import main.java.desingPattrens.Structural.Bridge.sescihazi.ISesCihazi;

public class BilgisayarHS extends MuzikCalabilenBilgisayar {
    public BilgisayarHS(){
        sesCihazi = new HoparlorCihaz();
        muzikCihazi = new SpotifyApp();
    }

    @Override
    public void muzikCal(Muzik muzik) {

        System.out.println("Bilgisayar Çalıştı");
        super.muzikCal(muzik);
    }
}
