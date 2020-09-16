package main.java.desingPattrens.Creational.Prototype;

import java.util.Date;

public class MainPrototype {
    public static void main(String[] args) {

        long id1 = 1L;
        long id2 = 2L;

        GenelEntityServis genelEntityServis = new GenelEntityServis();
        Date ilkTarih = new Date();
        Belge belge1 = genelEntityServis.findBelgeById(id1);
        belgeyiVeSaniyeFarkiniYazdir(ilkTarih, belge1);

        Date ilkTarih2 = new Date();
        Belge belge2 = genelEntityServis.findBelgeById(id2);
        //belgeyiVeSaniyeFarkiniYazdir(ilkTarih2, belge2);

        Date ilkTarih3 = new Date();
        Belge belgeClone = null;
        try {
            belgeClone = belge1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        belgeClone.setAdi("Günlük");
        belgeClone.setVeri("Sevgili Yazıcı");
        belgeClone.getBelgeTuru().setAdi("Kişisel 3");
        belgeyiVeSaniyeFarkiniYazdir(ilkTarih3,belgeClone);

        System.out.println(belge1);
    }

    private static void belgeyiVeSaniyeFarkiniYazdir(Date ilkTarih, Belge belge1) {
        Date sonTarih = new Date();
        Long saniyeFarki = getSaniyeFarki(ilkTarih, sonTarih);

        System.out.println(belge1);
        System.out.println(saniyeFarki);

        System.out.println("\n");
    }

    private static Long getSaniyeFarki(Date ilkTarih, Date sonTarih) {
        long has=1000;

        long saniyeFarki = (sonTarih.getTime() / has) - (ilkTarih.getTime() / has);

        return saniyeFarki;

    }
}
