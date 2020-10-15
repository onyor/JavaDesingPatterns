package main.java.desingPattrens.Behavioural.Command;

import main.java.desingPattrens.Behavioural.Command.Commands.*;

import java.math.BigDecimal;

public class MainCommand {
    public static void main(String[] args) {
        BigDecimal toplam = CalculatorOld.islem(IslemTuru.TOPLAMA, BigDecimal.TEN, BigDecimal.ONE);
        BigDecimal fark = CalculatorOld.islem(IslemTuru.CIKARMA, BigDecimal.TEN, BigDecimal.ONE);
        BigDecimal us = CalculatorOld.islem(IslemTuru.UST, BigDecimal.TEN, BigDecimal.valueOf(2));
        BigDecimal mod = CalculatorOld.islem(IslemTuru.MOD, BigDecimal.TEN, BigDecimal.valueOf(3));

        System.out.println("Toplam = " + toplam);
        System.out.println("Fark = " + fark);
        System.out.println("ÜST = " + us);
        System.out.println("MOD = " + mod);


        System.out.println("/////////////////////////////////////////////////////////////");

        BigDecimal sayi1 = BigDecimal.TEN;
        BigDecimal sayi2 = BigDecimal.valueOf(2);
        BigDecimal sayi3 = BigDecimal.valueOf(5);

        BigDecimal toplam2 = CalculatorNew.islem(new ToplamaCommand(), sayi1, sayi2,sayi3);
        BigDecimal fark2 = CalculatorNew.islem(new CikarmaCommand(), sayi1, sayi2);
        BigDecimal carpma2 = CalculatorNew.islem(new CarpmaCommand(), sayi1, sayi2);
        BigDecimal bolme2 = CalculatorNew.islem(new BolmeCommand(), sayi1, sayi2);
        BigDecimal us2 = CalculatorNew.islem(new UsAlmaCommand(), sayi1, sayi2);
        BigDecimal mod2 = CalculatorNew.islem(new ModCommand(), sayi1, sayi2);
        System.out.println("Toplama = "+ toplam2);
        System.out.println("Çıkarma = "+ fark2);
        System.out.println("Çarpma = "+ carpma2);
        System.out.println("Bölme = "+ bolme2);
        System.out.println("Üs = "+ us2);
        System.out.println("Mod = "+ mod2);
    }
}
