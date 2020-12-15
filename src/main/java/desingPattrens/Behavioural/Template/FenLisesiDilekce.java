package main.java.desingPattrens.Behavioural.Template;

import java.util.Date;

public class FenLisesiDilekce extends DevamsizlikDilekçeTemplate {

    private String sinif;
    private String numara;
    private String isim;
    private String sube;

    public FenLisesiDilekce(String sinif, String numara, String isim, String sube) {
        this.sinif = sinif;
        this.numara = numara;
        this.isim = isim;
        this.sube = sube;
    }

    @Override
    public Date getTarih() {
        return new Date();
    }

    @Override
    public String getKurumAdi() {
        return "Çankırı Fen Lisesi";
    }

    @Override
    public String getSehir() {
        return "Çankırı";
    }

    @Override
    public String getSinifAdi() {
        return sinif + " Fen-" + sube;
    }

    @Override
    public String getOkulNumarasi() {
        return "91";
    }

    @Override
    public String getOgrenimYili() {
        return "2020";
    }

    @Override
    public String getYariyil() {
        return "İkinci";
    }

    @Override
    public String getOgrenciAdSoyad() {
        return "Seçil Şahin";
    }
}
