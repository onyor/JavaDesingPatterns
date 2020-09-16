package main.java.desingPattrens.Structural.Composite.compositeIlk;

import java.util.ArrayList;
import java.util.List;

public class Kumanya {
    private String adi;
    private List<Urun> urunList;
    private List<Paket> paketList;

    public Kumanya(String adi) {
        paketList = new ArrayList<>();
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

    public List<Paket> getPaketList() {
        return paketList;
    }

    public void setPaketList(List<Paket> paketList) {
        this.paketList = paketList;
    }
}
