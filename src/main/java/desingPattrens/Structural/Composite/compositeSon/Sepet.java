package main.java.desingPattrens.Structural.Composite.compositeSon;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Sepet {
    private String adi;
    private List<Fiyatlanabilir> fiyatlanabilirList;

    public  BigDecimal toplamOdenecekTutar() {
        BigDecimal toplamTutar = BigDecimal.ZERO;
        for (Fiyatlanabilir fiyatlanabilir : fiyatlanabilirList) {
            toplamTutar = toplamTutar.add(fiyatlanabilir.getFiyat());
        }
        return toplamTutar;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<Fiyatlanabilir> getFiyatlanabilirList() {
        return fiyatlanabilirList;
    }

    public void setFiyatlanabilirList(List<Fiyatlanabilir> fiyatlanabilirList) {
        this.fiyatlanabilirList = fiyatlanabilirList;
    }

    public Sepet(String adi) {
        this.adi = adi;
        this.fiyatlanabilirList = new ArrayList<>();
    }
}
