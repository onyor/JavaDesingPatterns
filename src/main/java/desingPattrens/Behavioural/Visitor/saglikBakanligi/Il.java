package main.java.desingPattrens.Behavioural.Visitor.saglikBakanligi;

import java.util.ArrayList;
import java.util.List;

public class Il {
    private String adi;
    private List<Hastane> hastaneList;

    public Il(String adi) {
        this.adi = adi;
        hastaneList=new ArrayList<>();
    }

    public void hastaneEkle(Hastane hastane){
        hastaneList.add(hastane);
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<Hastane> getHastaneList() {
        return hastaneList;
    }

    public void setHastaneList(List<Hastane> hastaneList) {
        this.hastaneList = hastaneList;
    }

    public String accept(VisitorDesingPattern visitor){
        /**
         * accept methotu şunu yapıyor
         * benim visitor' sınıfımdaki il için belirttiğim işi yapsın.
         */
        return visitor.visitIl(this);
    }
}
