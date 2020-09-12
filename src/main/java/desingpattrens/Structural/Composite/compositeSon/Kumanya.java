package main.java.desingpattrens.Structural.Composite.compositeSon;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Kumanya implements Fiyatlanabilir {
    private String adi;
    private List<Urun> urunList;
    private List<Paket> paketList;

    public Kumanya(String adi) {
        this.adi = adi;
        urunList = new ArrayList<>(); // Listeleri initials ediyoruz.
        paketList = new ArrayList<>();
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

    @Override
    public BigDecimal getFiyat() {
        BigDecimal toplamUrunFiyati = FiyatHesaplamaUtil.getToplamUrunFiyati(urunList);
        BigDecimal toplamPaketFiyati = FiyatHesaplamaUtil.getToplamPaketFiyati(paketList);

        BigDecimal toplamFiyat = toplamPaketFiyati.add(toplamUrunFiyati);

        return toplamFiyat;
    }
}
