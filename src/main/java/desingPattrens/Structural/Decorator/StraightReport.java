package main.java.desingPattrens.Structural.Decorator;

/**
 * Düz Rapor
 * Normalde burayı extend edecektik çizgili/imzalı/küçük olarak
 * Buna gerek kalmayacak.
 */
public class StraightReport implements IReport {

    private  String text;

    public StraightReport(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
