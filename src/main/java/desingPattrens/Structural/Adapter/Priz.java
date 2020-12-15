package main.java.desingPattrens.Structural.Adapter;

public class Priz {
    public void elektrikVer(ElektrikliEvAletleri elektrikliEvAletleri) {
        int volt = elektrikliEvAletleri.prizeTakVeCalistir();
        System.out.println("Prizden " + volt + " volt alınıyor.");
    }
}
