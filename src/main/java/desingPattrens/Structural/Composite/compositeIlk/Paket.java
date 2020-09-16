package main.java.desingPattrens.Structural.Composite.compositeIlk;

import java.util.ArrayList;
import java.util.List;

public class Paket {
    private String adi;
    //Bir liste içerisinde tüm ürünleri tutacağız.
    private List<Urun> urunList;

    public Paket(String adi) {
        urunList = new ArrayList<>();
        this.adi = adi;
    }

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
}
