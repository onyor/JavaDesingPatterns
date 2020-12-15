package main.java.desingPattrens.Structural.Adapter;

public class SamsungTelefon implements Telefon {

    private int calismaVoltaji;

    public SamsungTelefon() {
        this.calismaVoltaji=5;
    }

    @Override
    public int sarjEt() {
        System.out.println("Samsung Telefon Çalişiyor.");
        return calismaVoltaji;
    }

}
