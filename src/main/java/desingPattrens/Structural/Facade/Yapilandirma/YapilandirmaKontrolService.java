package main.java.desingPattrens.Structural.Facade.Yapilandirma;

import main.java.desingPattrens.Structural.Facade.DateUtil;

import java.util.Date;

public class YapilandirmaKontrolService {
    /**
     * Eğer vade tarihi üzerinden 90 gün geçerse yapılandırma bozulur!'
     * @param vadeTarihi
     * @return
     */
    public boolean isYapilandirmaBozulmali(Date vadeTarihi) {
        Date gununTarihi= DateUtil.getGununTarihi();
        long gunFarki=DateUtil.gunFarkiHesapla(vadeTarihi,gununTarihi);
        boolean isYapilandirmaBozulmali=gunFarki>90;
        if (isYapilandirmaBozulmali) {
            System.out.println("Borcun yapılandırılması bozulmalı! Tahsil edilemez!");
        }

        return isYapilandirmaBozulmali;
    }
}
