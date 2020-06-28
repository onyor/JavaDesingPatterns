package Facade;

import Facade.Borc.Borc;
import Facade.Borc.OdemeBilgileri;
import Facade.Gecikme.GecikmeZammiHesaplamaService;
import Facade.Tahsilat.TahsilatKontrolService;
import Facade.Tahsilat.Kredikarti.KrediKartiService;

import java.math.BigDecimal;

public class TahsilatFacade {
    private GecikmeZammiHesaplamaService gecikmeZammiHesaplamaService;
    private TahsilatKontrolService tahsilatKontrolService;
    private KrediKartiService krediKartiService;

    public TahsilatFacade() {
        gecikmeZammiHesaplamaService=new GecikmeZammiHesaplamaService();
        tahsilatKontrolService=new TahsilatKontrolService();
        krediKartiService=new KrediKartiService();
    }

    public boolean tahsilatYap(Borc borc, OdemeBilgileri odemeBilgileri) {
        boolean tahsilatUygun = tahsilatKontrolService.isTahsilatUygun(borc);

        if (!tahsilatUygun) {
            return false;
        }

        BigDecimal borcTutari=borc.getBorcTutari();
        BigDecimal gecikmeZammi=gecikmeZammiHesaplamaService.gecikmeZamHesapla(borcTutari,borc.getVadeTarihi());
        BigDecimal odenecekTutar=borcTutari.add(gecikmeZammi);
        System.out.println("Bilgi: Kredi kartından "+ odenecekTutar+" TL tahsilat deneniyor.");

        boolean isSuccess=krediKartiService.krediKartindanTahsilDene(odemeBilgileri,odenecekTutar);

        return isSuccess;
    }
}
