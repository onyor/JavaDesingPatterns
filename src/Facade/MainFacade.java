package Facade;

import Facade.Enum.EnumBorcTuru;
import Facade.Borc.Borc;
import Facade.Borc.OdemeBilgileri;

import java.math.BigDecimal;
import java.util.Date;

public class MainFacade {
    //psvm
    public static void main(String[] args) {
        TahsilatFacade tahsilatFacade=new TahsilatFacade();

        Long id=10L;
        BigDecimal borcTutar = new BigDecimal(10);
        EnumBorcTuru borcTuru=EnumBorcTuru.NORMAL;
        Date vadeTarihi = DateUtil.tarihOlustur("01.01.2020");

        Borc borc=new Borc(id, borcTuru,borcTutar,vadeTarihi);

        OdemeBilgileri odemeBilgileri = new OdemeBilgileri("Onur Yıldız", "1032 5487 4585 5485", 01L, 2023L, 123L);

        boolean isSuccess = tahsilatFacade.tahsilatYap(borc, odemeBilgileri);

        if (isSuccess) {
            System.out.println("Tahsilat yapıldı!");
        } else {
            System.out.println("Tahsilay yapılamadı!");
        }
    }
}
