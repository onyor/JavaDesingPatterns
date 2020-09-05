package Visitor.saglikBakanligi;

import java.util.ArrayList;
import java.util.List;

public class Ulke {
    private String adi;
    private List<Il> ilList ;

    public Ulke(String adi) {
        this.adi = adi;
        ilList = new ArrayList<>();
    }

    public void ilEkle(Il il){
        ilList.add(il);
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<Il> getIlList() {
        return ilList;
    }

    public void setIlList(List<Il> ilList) {
        this.ilList = ilList;
    }

    public String accept(VisitorDesingPattern visitor){
        /**
         * accept methotu şunu yapıyor
         * benim visitor' sınıfımdaki ülke için belirttiğim işi yapsın.
         */
        return visitor.visitUlke(this);
    }
}
