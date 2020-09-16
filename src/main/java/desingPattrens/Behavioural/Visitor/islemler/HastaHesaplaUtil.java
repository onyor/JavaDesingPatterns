package main.java.desingPattrens.Behavioural.Visitor.islemler;

import main.java.desingPattrens.Behavioural.Visitor.saglikBakanligi.EnumHastaDurumu;
import main.java.desingPattrens.Behavioural.Visitor.saglikBakanligi.EnumHastalik;
import main.java.desingPattrens.Behavioural.Visitor.saglikBakanligi.Hasta;
import main.java.desingPattrens.Behavioural.Visitor.saglikBakanligi.Hastane;

import java.util.List;

public class HastaHesaplaUtil {
    public static int hastaSayisiHesapla(Hastane hastane, EnumHastalik hastalik){
        List<Hasta> hastaList = hastane.getHastaList();

        int hastaSayisi=0;
        for (Hasta hasta: hastaList
             ) {
            if (hastalik.equals(hasta.getHastalik())) {
                hastaSayisi++;
            }
        }
        return hastaSayisi;
    }

    public static int hastaSayisiHesapla(Hastane hastane, EnumHastalik hastalik, EnumHastaDurumu hastaDurumu){
        List<Hasta> hastaList = hastane.getHastaList();

        int hastaSayisi=0;
        for (Hasta hasta: hastaList
        ) {
            if (hastalik.equals(hasta.getHastalik())) {
                if (hastaDurumu.equals((hasta.getHastaDurumu()))) {
                    hastaSayisi++;
                }
            }
        }
        return hastaSayisi;
    }
}
