package main.java.desingPattrens.Structural.Bridge.BridgeIlk;

public class Bilgisayar {
    private Spotify spotify;
    private Hoparlor hoparlor;

    public Bilgisayar(){
        System.out.println("Bilgisayar Çalıştı!");
        spotify=new Spotify();
        hoparlor=new Hoparlor();
    }

    public Spotify getSpotify() {
        return spotify;
    }

    public void setSpotify(Spotify spotify) {
        this.spotify = spotify;
    }

    public Hoparlor getHoparlor() {
        return hoparlor;
    }

    public void setHoparlor(Hoparlor hoparlor) {
        this.hoparlor = hoparlor;
    }

    public void muzikCal(Muzik muzik) {
        String ses = spotify.muzikCal(muzik);
        hoparlor.sesiCal(ses);

    }
}
