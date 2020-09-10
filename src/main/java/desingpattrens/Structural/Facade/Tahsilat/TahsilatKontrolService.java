package main.java.desingpattrens.Structural.Facade.Tahsilat;

import main.java.desingpattrens.Structural.Facade.Enum.EnumBorcTuru;
import main.java.desingpattrens.Structural.Facade.Borc.Borc;
import main.java.desingpattrens.Structural.Facade.Hukuksal.HukuksalKontrolService;
import main.java.desingpattrens.Structural.Facade.Yapilandirma.YapilandirmaKontrolService;

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
