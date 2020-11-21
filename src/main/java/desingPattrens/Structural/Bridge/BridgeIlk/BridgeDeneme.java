package main.java.desingPattrens.Structural.Bridge.BridgeIlk;

public class BridgeDeneme {
    public static void main(String[] args) {
        Muzik muzik = new Muzik("Sezen Aksu - Gülümse", "Gülümse hadi gülümse");

        Bilgisayar bilgisayar=new Bilgisayar();

        bilgisayar.muzikCal(muzik);

    }
}
