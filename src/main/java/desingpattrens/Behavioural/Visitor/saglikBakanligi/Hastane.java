package main.java.desingpattrens.Behavioural.Visitor.saglikBakanligi;

import java.util.ArrayList;
import java.util.List;

public class Hastane {
    private String adi;
    private List<Hasta> hastaList;

    public String getAdi() {
        return adi;
    }

    public void hastaEkle(Hasta hasta){
        hastaList.add(hasta);
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<Hasta> getHastaList() {
        return hastaList;
    }

    public void setHastaList(List<Hasta> hastaList) {
        this.hastaList = hastaList;
    }

    public Hastane(String adi) {
        this.adi = adi;
        hastaList = new ArrayList<>();
    }

    public String accept(VisitorDesingPattern visitor){
        /**
         * accept methotu şunu yapıyor
         * benim visitor' sınıfımdaki hastane için belirttiğim işi yapsın.
         */
        return visitor.visitHastane(this);
    }
}
