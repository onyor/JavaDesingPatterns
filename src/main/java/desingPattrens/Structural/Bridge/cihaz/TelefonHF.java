package main.java.desingPattrens.Structural.Bridge.cihaz;

import main.java.desingPattrens.Structural.Bridge.Muzik;
import main.java.desingPattrens.Structural.Bridge.muzikcalar.IMuzikCihazi;
import main.java.desingPattrens.Structural.Bridge.sescihazi.ISesCihazi;

public class TelefonHF extends MuzikCalabilenBilgisayar {
    public TelefonHF(ISesCihazi sesCihazi, IMuzikCihazi muzikCihazi) {
        super(sesCihazi, muzikCihazi);
    }

    @Override
    public void muzikCal(Muzik muzik) {

        System.out.println("Telefonda  Çalıştı");
        super.muzikCal(muzik);
    }
}
