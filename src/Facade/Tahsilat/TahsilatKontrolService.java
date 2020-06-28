package Facade.Tahsilat;

import Facade.Enum.EnumBorcTuru;
import Facade.Borc.Borc;
import Facade.Hukuksal.HukuksalKontrolService;
import Facade.Yapilandirma.YapilandirmaKontrolService;

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
