package Visitor;

import Visitor.islemler.*;
import Visitor.saglikBakanligi.*;

public class MainVisitor {
    public static void main(String[] args) {



        Hasta onur = new Hasta("Ahmet", EnumHastalik.COVID, EnumHastaDurumu.AGIR_HASTA);
        Hasta secil = new Hasta("Ahmet", EnumHastalik.COVID, EnumHastaDurumu.IYILESTI);
        Hasta hakki = new Hasta("Ahmet", EnumHastalik.COVID, EnumHastaDurumu.ZATURRE);
        Hasta yazici = new Hasta("Ahmet", EnumHastalik.COVID, EnumHastaDurumu.EVDE_KARANTINA);
        Hasta mahmut = new Hasta("Ahmet", EnumHastalik.COVID, EnumHastaDurumu.OLUM);

        Hastane capa = new Hastane("Çapa");

        capa.hastaEkle(onur);
        capa.hastaEkle(secil);
        capa.hastaEkle(hakki);
        capa.hastaEkle(yazici);
        capa.hastaEkle(mahmut);

        Il istanbul=new Il("İstanbul");
        istanbul.hastaneEkle(capa);

        Ulke turkiye = new Ulke("Türkiye");
        turkiye.ilEkle(istanbul);

        raporUlke(turkiye);

    }

    private static void raporUlke(Ulke ulke) {
        CovidHastaSayisiVisitor hastaSayisiVisitor=new CovidHastaSayisiVisitor();
        //String hastaSayisi=hastaSayisiVisitor.visitUlke(ulke);

        CovidOlumSayisiVisitor olumSayisiVisitor= new CovidOlumSayisiVisitor();
       // String olumSayisi = olumSayisiVisitor.visitUlke(ulke);

        CovidZaturreSayisiVisitor zaturreSayisiVisitor= new CovidZaturreSayisiVisitor();
       // String zaturreSayisi = zaturreSayisiVisitor.visitUlke(ulke);

        CovidAgirHastaSayisiVisitor agirHastaSayisiVisitor= new CovidAgirHastaSayisiVisitor();
       // String agirHastaSayisi = agirHastaSayisiVisitor.visitUlke(ulke);

        CovidIyilesenSayisiVisitor iyilesenSayisiVisitor= new CovidIyilesenSayisiVisitor();
       // String iyilesenSayisi = iyilesenSayisiVisitor.visitUlke(ulke);



        //aşağıdaki gibi ülke üzerinden de sayıları bulabilirdik.
        String hastaSayisi = ulke.accept(hastaSayisiVisitor);
        String olumSayisi = ulke.accept(olumSayisiVisitor);
        String zaturreSayisi = ulke.accept(zaturreSayisiVisitor);
        String agirHastaSayisi = ulke.accept(agirHastaSayisiVisitor);
        String iyilesenSayisi = ulke.accept(iyilesenSayisiVisitor);

/*
        //ya da ilin sayılarını yine aşağıdaki gibi bulabilirdik.
        String hastaSayisi = istanbul.accept(hastaSayisiVisitor);
        String olumSayisi = istanbul.accept(olumSayisiVisitor);
        String zaturreSayisi = istanbul.accept(zaturreSayisiVisitor);
        String agirHastaSayisi = istanbul.accept(agirHastaSayisiVisitor);
        String iyilesenSayisi = istanbul.accept(iyilesenSayisiVisitor);

 */

        System.out.println("Hasta Sayısı: " + hastaSayisi);
        System.out.println("Ölüm Sayısı: " + olumSayisi);
        System.out.println("Zaturre Sayısı: " + zaturreSayisi);
        System.out.println("Ağır Hasta Sayısı: " + agirHastaSayisi);
        System.out.println("İyileşen Hasta Sayısı: " + iyilesenSayisi);
    }
}
