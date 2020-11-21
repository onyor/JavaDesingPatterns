package main.java.desingPattrens.Structural.Bridge.BridgeIlk;

public class Spotify {
    public String muzikCal(Muzik muzik){
        System.out.println("Spotify : " + muzik + " şarkısını çalıyor.");

        return muzik.getSes();
    }
}
