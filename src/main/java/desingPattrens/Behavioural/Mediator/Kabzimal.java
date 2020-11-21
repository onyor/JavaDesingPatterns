package main.java.desingPattrens.Behavioural.Mediator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Kabzimal implements Araci {

    private List<Uretici> ureticiList;
    private List<Halci> halciList;

    public Kabzimal() {
        this.ureticiList = new ArrayList<>();
        this.halciList = new ArrayList<>();
    }

    @Override
    public void UreticiEkle(Uretici uretici) {
        ureticiList.add(uretici);
    }

    @Override
    public void halciEkle(Halci halci) {
        halciList.add(halci);
    }

    @Override
    public void ureticidenAl(Uretici uretici) {
        Halci halci = enUygunHalciBul(uretici.getUrun());

        satisYap(uretici, halci);
    }

    @Override
    public void haleSat(Halci halci) {
        Uretici uretici = enUygunUreticiBul(halci.getUrun());

        satisYap(uretici, halci);
    }

    private Uretici enUygunUreticiBul(EnumUrun urun) {
        Uretici enUygunUretici=null;
        for (Uretici uretici:ureticiList
        ) {
            if (urun.equals(uretici.getUrun())) {
                BigDecimal ureticiFiyat = uretici.getFiyat();
                if (enUygunUretici==null||enUygunUretici.getFiyat().compareTo(ureticiFiyat)>0){
                    enUygunUretici=uretici;
                }
            }
        }

        return enUygunUretici;
    }

    private Halci enUygunHalciBul(EnumUrun urun) {
        Halci enUygunHalci=null;
        for (Halci halci:halciList
        ) {
            if (urun.equals(halci.getUrun())) {
                BigDecimal ureticiFiyat = halci.getFiyat();
                if (enUygunHalci==null||enUygunHalci.getFiyat().compareTo(ureticiFiyat)<0){
                    enUygunHalci=halci;
                }
            }
        }

        return enUygunHalci;
    }

    private void satisYap(Uretici uretici, Halci halci) {
        System.out.println(uretici.getAdi()+" isimli üretici "
                +halci.getAdi()+" isimli halciye "+uretici.getUrun()+" sattı.");
    }
}
