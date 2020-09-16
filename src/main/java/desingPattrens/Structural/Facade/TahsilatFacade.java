package main.java.desingPattrens.Structural.Facade;

import main.java.desingPattrens.Structural.Facade.Borc.Borc;
import main.java.desingPattrens.Structural.Facade.Borc.OdemeBilgileri;
import main.java.desingPattrens.Structural.Facade.Gecikme.GecikmeZammiHesaplamaService;
import main.java.desingPattrens.Structural.Facade.Tahsilat.TahsilatKontrolService;
import main.java.desingPattrens.Structural.Facade.Tahsilat.Kredikarti.KrediKartiService;


/**
 * İstediğin tüm fonksiyonları kullan ama dışarıya basit biir method aç!
 *
 */
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
