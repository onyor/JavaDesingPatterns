package main.java.desingPattrens.Structural.Composite.compositeSon;

import java.math.BigDecimal;

public class Urun implements Fiyatlanabilir{
    private String adi;
    private BigDecimal fiyat;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }

    public Urun(String adi, BigDecimal fiyat) {
        this.adi = adi;
        this.fiyat = fiyat;
    }

    @Override
    public BigDecimal getFiyat() {
        return fiyat;
    }
}
