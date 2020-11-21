package main.java.desingPattrens.Behavioural.Mediator;

import java.math.BigDecimal;

public abstract class Uretici {
    private String adi;
    private EnumUrun urun;
    private BigDecimal fiyat;

    private Araci araci;

    public Uretici(String adi, EnumUrun urun, BigDecimal fiyat, Araci araci) {
        this.adi = adi;
        this.urun = urun;
        this.fiyat = fiyat;
        this.araci = araci;
    }

    public void urunSat(){
        araci.ureticidenAl(this);
}

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public EnumUrun getUrun() {
        return urun;
    }

    public void setUrun(EnumUrun urun) {
        this.urun = urun;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }

    public Araci getAraci() {
        return araci;
    }

    public void setAraci(Araci araci) {
        this.araci = araci;
    }

    @Override
    public String toString() {
        return "Uretici{" +
                "adi='" + adi + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }
}
