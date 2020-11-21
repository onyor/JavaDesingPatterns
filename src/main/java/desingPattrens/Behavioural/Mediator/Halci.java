package main.java.desingPattrens.Behavioural.Mediator;

import java.math.BigDecimal;

public abstract class Halci {
    private String adi;
    private EnumUrun urun;
    private BigDecimal fiyat;

    private Araci araci;

    public Halci(String adi, EnumUrun urun, BigDecimal fiyat, Araci araci) {
        this.adi = adi;
        this.urun = urun;
        this.fiyat = fiyat;
        this.araci = araci;
    }

    public void urunAl(){
        araci.haleSat(this);
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
}
