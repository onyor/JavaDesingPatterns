package Facade.Tahsilat.Kredikarti;

import Facade.DateUtil;
import Facade.Borc.OdemeBilgileri;

import java.util.Date;

public class KrediKartiKontrolService {
    public boolean isKrediKartiGecerli(OdemeBilgileri odemeBilgileri){
        Long sonKullanmaAy=odemeBilgileri.getSkAy();
        Long sonKullanmaYil=odemeBilgileri.getSkYil();

        Date gununTarihi= DateUtil.getGununTarihi();

        Long gununAyi=DateUtil.tarihinAyi(gununTarihi);
        Long gununYili=DateUtil.tarihinYili(gununTarihi);

        boolean isKrediKartiGecerli=false;
        if (sonKullanmaYil.compareTo(gununYili) > 0) {
            isKrediKartiGecerli=true;
        } else if (sonKullanmaYil.compareTo(gununYili) == 0) {
            if (sonKullanmaAy.compareTo(gununAyi) >= 0) {
                isKrediKartiGecerli=true;
            }
        }

        if(!isKrediKartiGecerli){
            System.out.println("Geçersiz kredi kartı bilgiler!");
        }
        return isKrediKartiGecerli;
    }
}
