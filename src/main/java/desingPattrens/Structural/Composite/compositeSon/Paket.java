package main.java.desingPattrens.Structural.Composite.compositeSon;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Paket implements Fiyatlanabilir {
    private String adi;
    private List<Urun> urunList;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<Urun> getUrunList() {
        return urunList;
    }

    public void setUrunList(List<Urun> urunList) {
        this.urunList = urunList;
    }

    public Paket(String adi) {
        this.adi = adi;
        urunList = new ArrayList<>();
    }

    @Override
    public BigDecimal getFiyat() {
        return FiyatHesaplamaUtil.getToplamUrunFiyati(urunList);
    }
}
