package Visitor.islemler;

import Visitor.saglikBakanligi.EnumHastaDurumu;
import Visitor.saglikBakanligi.EnumHastalik;
import Visitor.saglikBakanligi.Hasta;
import Visitor.saglikBakanligi.Hastane;

import java.util.ArrayList;
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
