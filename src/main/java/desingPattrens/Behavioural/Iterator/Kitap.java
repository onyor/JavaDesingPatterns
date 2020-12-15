package main.java.desingPattrens.Behavioural.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Kitap {
    private String adi;

    private List<Soru> soruList;

    public Kitap(String adi) {
        this.adi = adi;
        this.soruList = new ArrayList<>();

        soruList.add(new Soru(1L));
        soruList.add(new Soru(2L));
        soruList.add(new Soru(3L));
        soruList.add(new Soru(4L));
        soruList.add(new Soru(5L));
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    /**
     * Iterator diyor ki bu listenin kendisini dönme, listenin iterator' ını dön diyor!
     * @return
     */
    public Iterator getSoruIterator() {
        return soruList.iterator();
    }

    public void setSoruList(List<Soru> soruList) {
        this.soruList = soruList;
    }
}
