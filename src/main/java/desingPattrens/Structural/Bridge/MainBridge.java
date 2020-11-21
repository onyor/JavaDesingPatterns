package main.java.desingPattrens.Structural.Bridge;
import main.java.desingPattrens.Structural.Bridge.cihaz.BilgisayarHS;
import main.java.desingPattrens.Structural.Bridge.cihaz.TelefonHF;
import main.java.desingPattrens.Structural.Bridge.muzikcalar.FizzyApp;
import main.java.desingPattrens.Structural.Bridge.sescihazi.HoparlorCihaz;

public class MainBridge {
    public static void main(String[] args) {
        Muzik muzik = new Muzik("Sezen Aksu - Gülümse", "Gülümse hadi gülümse");

        BilgisayarHS bilgisayarHS = new BilgisayarHS();
        TelefonHF telefonHF=new TelefonHF(new HoparlorCihaz(),new FizzyApp());

        bilgisayarHS.muzikCal(muzik);
        telefonHF.muzikCal(muzik);
    }
}
