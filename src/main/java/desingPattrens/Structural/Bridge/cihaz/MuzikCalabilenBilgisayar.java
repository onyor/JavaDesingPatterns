package main.java.desingPattrens.Structural.Bridge.cihaz;

import main.java.desingPattrens.Structural.Bridge.Muzik;
import main.java.desingPattrens.Structural.Bridge.muzikcalar.IMuzikCihazi;
import main.java.desingPattrens.Structural.Bridge.sescihazi.ISesCihazi;

public abstract class MuzikCalabilenBilgisayar {
    protected ISesCihazi sesCihazi;
    protected IMuzikCihazi muzikCihazi;

    public MuzikCalabilenBilgisayar(ISesCihazi sesCihazi, IMuzikCihazi muzikCihazi) {
        this.sesCihazi = sesCihazi;
        this.muzikCihazi = muzikCihazi;
    }

    public MuzikCalabilenBilgisayar() {

    }

    void muzikCal(Muzik muzik){
        String ses = muzikCihazi.muzikCal(muzik);
        sesCihazi.sesiCal(ses);
    }
}
