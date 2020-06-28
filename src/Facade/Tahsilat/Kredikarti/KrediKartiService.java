package Facade.Tahsilat.Kredikarti;

import Facade.Borc.OdemeBilgileri;

import java.math.BigDecimal;

public class KrediKartiService {
    private KrediKartiKontrolService krediKartiKontrolService;

    public KrediKartiService() {
        krediKartiKontrolService=new KrediKartiKontrolService();
    }

    public boolean krediKartindanTahsilDene(OdemeBilgileri odemeBilgileri, BigDecimal odenecekTutar){
        boolean kredikartiGecerli = krediKartiKontrolService.isKrediKartiGecerli(odemeBilgileri);

        if (!kredikartiGecerli) {
            return false;
        }

        boolean yeterliLimitVar = isYeterliLimitVar(odemeBilgileri, odenecekTutar);

        if (!yeterliLimitVar) {
            return false;
        }
        System.out.println("Kredi kartından "+odenecekTutar+" TL tahsil edilmiştir.");

        return true;
    }

    private boolean isYeterliLimitVar(OdemeBilgileri odemeBilgileri, BigDecimal odenecekTutar) {
        BigDecimal limit=getKrediKartiLimiti(odemeBilgileri);

        boolean isYeterliLimitVar=limit.compareTo(odenecekTutar)>0;

        if (!isYeterliLimitVar) {
            System.out.println("Kartta yeterli limit bulunmamaktadır!");

        }
        return isYeterliLimitVar;
    }

    private BigDecimal getKrediKartiLimiti(OdemeBilgileri odemeBilgileri) {
        BigDecimal limit=BigDecimal.ZERO;

        String kartUzerindekiIsim=odemeBilgileri.getKartUzerindekiIsim();

        if (kartUzerindekiIsim.contains("Onur")) {
            limit = new BigDecimal(100);
        } else if (kartUzerindekiIsim.contains("Seçil")) {
            limit = new BigDecimal(1000);
        } else if (kartUzerindekiIsim.contains("Tahacan")) {
            limit=BigDecimal.TEN;
        }

        return limit;
    }
}
