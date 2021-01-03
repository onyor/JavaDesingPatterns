package main.java.desingPattrens.Structural.Facade;

import main.java.desingPattrens.Structural.Facade.Enum.EnumBorcTuru;
import main.java.desingPattrens.Structural.Facade.Borc.Borc;
import main.java.desingPattrens.Structural.Facade.Borc.OdemeBilgileri;

import java.math.BigDecimal;
import java.util.Date;

public class MainFacade {
    /***
     * Facade -> Cephe
     * Uygulamamızı kendi karmaşıklığından ayırıp basit haline dışarıya açmamızı sağlayan bir yapısal bir tasarım kalıbıdır.
     * Uygulamamızı açıcağımız bir client olduğunu düşünelim bu client neye ihtiyaç duyacaksa onu verecek geri kalan bütün karmaşıklıktan onu arındırmaktır facade' ın amacı.
     *
     * Örn:
     * Bir ödeme sistemi programı yazdığımızı düşünelim.
     * Bu ödeme sistemlerinde ana tema borç.
     * Bir kişinin borcu vardır ve bunu tahsil ederiz.
     * Ve bu her zaman kolay değildir. Gecikme Zammı ve davalı olma durumları söz konusu olabilir. Borcun durumunu etkiler.
     * - Yapılandırma
     * - Gecikme Zammı
     * - Hukuksal işlem
     * - Borç
     *
     * Karmaşık bir olay söz konusu.
     * Burdaki bu karışıklığı uygulamamıza vereceğimiz client'lerden ayırmamız gerekiyor.
     * Bunudanasıl yapıyoruz.
     * Client'dan borçları ve kredi kartlarını alıyoruz.
     * Bunu kendi ödeme sistemleri programımıza göndereceğiz.
     * Ve tahsilat yap.  Result: Onaylandı/ Reddedildi
     * Client sadece bize borç bilgilerini ve kredi kartı bilgilerini gönderecek
     * İçeride ne yapıldığını hangi kontroller var bunu bilmeyecek.
     * @param args
     */
    //psvm
    public static void main(String[] args) {
        TahsilatFacade tahsilatFacade=new TahsilatFacade();

        Long id=10L;
        BigDecimal borcTutar = new BigDecimal(100);
        EnumBorcTuru borcTuru=EnumBorcTuru.NORMAL;
        Date vadeTarihi = DateUtil.tarihOlustur("02.04.2020");

        Borc borc=new Borc(id, borcTuru,borcTutar,vadeTarihi);

        OdemeBilgileri odemeBilgileri = new OdemeBilgileri("Seçil Yıldız", "1032 5487 4585 5485", 01L, 2023L, 123L);

        boolean isSuccess = tahsilatFacade.tahsilatYap(borc, odemeBilgileri);

        if (isSuccess) {
            System.out.println("Tahsilat yapıldı!");
        } else {
            System.out.println("Tahsilay yapılamadı!");
        }
    }
}
