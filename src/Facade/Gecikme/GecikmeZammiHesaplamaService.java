package Facade.Gecikme;

import Facade.DateUtil;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class GecikmeZammiHesaplamaService {
    private GecikmeZammiOraniEntityService entityService;

    public GecikmeZammiHesaplamaService() {
        entityService = new GecikmeZammiOraniEntityService();
    }

    public BigDecimal gecikmeZamHesapla(BigDecimal tutar, Date vadeTarihi) {
        BigDecimal gecikmeZammi = BigDecimal.ZERO;
        if (vadeTarihi.compareTo(new Date()) > 0) {
            return gecikmeZammi;
        }
        gecikmeZammi = gecikmeZammiHesapla(tutar, vadeTarihi);
        return gecikmeZammi;
    }

    private BigDecimal gecikmeZammiHesapla(BigDecimal tutar, Date vadeTarihi) {
        BigDecimal gecikmeZammiOrani = entityService.getGecikmeZammiOran();
        Date gununTarihi = DateUtil.getGununTarihi();

        long gunFarkiL = DateUtil.gunFarkiHesapla(vadeTarihi, gununTarihi);

        BigDecimal gunFarki = BigDecimal.valueOf(gunFarkiL);

        BigDecimal gecikmeZammi = gecikmeZammiOrani.multiply(gunFarki).multiply(tutar);

        gecikmeZammi = gecikmeZammi.setScale(2, RoundingMode.HALF_DOWN);


        if (gecikmeZammi.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("Bilgi: Gecikme zammı hesaplandı. Gecikme Zammı Tutari: " + gecikmeZammi);

        }

        return gecikmeZammi;
    }
}
