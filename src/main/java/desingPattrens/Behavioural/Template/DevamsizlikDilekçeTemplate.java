package main.java.desingPattrens.Behavioural.Template;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DevamsizlikDilekçeTemplate {

    public void dilekceYazdir(){
        System.out.println(dilekceMetni());
    }

    private String dilekceMetni() {
        StringBuilder dilekceMetni = new StringBuilder();
        String formatliTarih=getFormatliTarih();

        dilekceMetni.append("*******************************************************************");
        dilekceMetni.append("\n");
        dilekceMetni.append("\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + formatliTarih);
        dilekceMetni.append("\n");
        dilekceMetni.append("\t\t\t\t" + getKurumAdi() + " müdürlüğüne");
        dilekceMetni.append("\n");
        dilekceMetni.append("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + getSehir());
        dilekceMetni.append("\n");
        dilekceMetni.append("\t");
        dilekceMetni.append("Halen okulunuzun " + getSinifAdi() + " sınıfında " + getOkulNumarasi());
        dilekceMetni.append(" öğrenci numaralı öğrencisi\n");
        dilekceMetni.append("olarak öğrenimime devam etmekteyim. " + getYariyil());
        dilekceMetni.append(" eğitim öğretim yılı " + getOgrenimYili() + "\n");
        dilekceMetni.append("dönemi içerisindeki devamsızlık durumunun tarafıma bildirilmesi\n");
        dilekceMetni.append("hususunu, Saygılarımla arz ederim.");
        dilekceMetni.append("\n\n");
        dilekceMetni.append("\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + getOgrenciAdSoyad());
        dilekceMetni.append("\n");
        dilekceMetni.append("*******************************************************************");

        return dilekceMetni.toString();
    }

    private String getFormatliTarih() {
        SimpleDateFormat format = new SimpleDateFormat("dd//MM/yyyy");
        return format.format(getTarih());
    }

    public abstract Date getTarih();

    public abstract String getKurumAdi();

    public abstract String getSehir();

    public abstract String getSinifAdi();

    public abstract String getOkulNumarasi();

    public abstract String getOgrenimYili();

    public abstract String getYariyil();

    public abstract String getOgrenciAdSoyad();
}
