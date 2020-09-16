package main.java.desingPattrens.Structural.Facade.Tahsilat;

import main.java.desingPattrens.Structural.Facade.Enum.EnumBorcTuru;
import main.java.desingPattrens.Structural.Facade.Borc.Borc;
import main.java.desingPattrens.Structural.Facade.Hukuksal.HukuksalKontrolService;
import main.java.desingPattrens.Structural.Facade.Yapilandirma.YapilandirmaKontrolService;

public class TahsilatKontrolService {
    private YapilandirmaKontrolService yapilandirmaKontrolService;
    private HukuksalKontrolService hukuksalKontrolService;

    public TahsilatKontrolService() {
        yapilandirmaKontrolService=new YapilandirmaKontrolService();
        hukuksalKontrolService=new HukuksalKontrolService();
    }

    public boolean isTahsilatUygun(Borc borc){

        boolean yapilandirmaBozulmali=false;
        if (EnumBorcTuru.YAPILANDIRMA.equals(borc.getBorcTuru())) {
            yapilandirmaBozulmali = yapilandirmaKontrolService.isYapilandirmaBozulmali(borc.getVadeTarihi());
        }

        boolean hukuksalIslemde=hukuksalKontrolService.isHukuksalIslemde(borc.getId());

        boolean isBorcTahsilataUygun=!(yapilandirmaBozulmali||hukuksalIslemde);
        return isBorcTahsilataUygun;
    }

}
