package main.java.desingPattrens.Structural.Bridge.muzikcalar;

import main.java.desingPattrens.Structural.Bridge.Muzik;
import main.java.desingPattrens.Structural.Bridge.sescihazi.ISesCihazi;

public class SpotifyApp implements IMuzikCihazi {
    @Override
    public String muzikCal(Muzik muzik) {
        System.out.println(this.toString()+ " : " + muzik + " şarkısını çalıyor.");
        return muzik.getSes();
    }

    @Override
    public String toString() {
        return "Spotify";
    }
}
