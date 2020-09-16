package main.java.desingPattrens.Structural.Composite.compositeIlk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Sepet {
    private String adi;
    private List<Urun> urunList;
    private List<Paket> paketList;
    private List<Kumanya> kumanyaList;

    public Sepet(String adi) {
        paketList = new ArrayList<>();
        urunList = new ArrayList<>();
        this.adi=adi;
    }

    public BigDecimal getToplamTutar(){
        BigDecimal toplamTutar=BigDecimal.ZERO;

        for (Urun urun : urunList) {
            toplamTutar = toplamTutar.add(urun.getFiyat());
        }

        for (Paket paket : paketList) {
            List<Urun> urunList = paket.getUrunList();
            for (Urun urun : urunList) {
                toplamTutar = toplamTutar.add(urun.getFiyat());
            }
        }


        return  toplamTutar;
    }

    public String getAdi() {
        return adi;
    }

    public void  setAdi(String adi){
        this.adi=adi;
    }

    public List<Urun> getUrunList(){
        return urunList;
    }

    public void setUrunList(List<Urun> urunList) {
        this.urunList = urunList;
    }

    public List<Paket> getPaketList(){
        return paketList;
    }

    public void setPaketList(List<Paket> paketList) {
        this.paketList=paketList;
    }

    public List<Kumanya> getKumanyaList(){
        return kumanyaList;
    }

    public void setKumanyaList(List<Kumanya> kumanyaList) {
        this.kumanyaList=kumanyaList;
    }
}
