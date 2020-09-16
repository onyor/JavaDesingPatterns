package main.java.desingPattrens.Behavioural.Visitor.saglikBakanligi;

public class Hasta {
    private String adi;
    private EnumHastalik hastalik;
    private EnumHastaDurumu hastaDurumu;

    public Hasta(String adi, EnumHastalik hastalik, EnumHastaDurumu hastaDurumu) {
        this.adi = adi;
        this.hastalik = hastalik;
        this.hastaDurumu = hastaDurumu;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public EnumHastalik getHastalik() {
        return hastalik;
    }

    public void setHastalik(EnumHastalik hastalik) {
        this.hastalik = hastalik;
    }

    public EnumHastaDurumu getHastaDurumu() {
        return hastaDurumu;
    }

    public void setHastaDurumu(EnumHastaDurumu hastaDurumu) {
        this.hastaDurumu = hastaDurumu;
    }
}
