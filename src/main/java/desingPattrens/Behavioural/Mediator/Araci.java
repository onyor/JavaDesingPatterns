package main.java.desingPattrens.Behavioural.Mediator;

public interface Araci {

    void UreticiEkle(Uretici uretici);
    void halciEkle(Halci halci);

    void ureticidenAl(Uretici uretici);
    void haleSat(Halci halci);
}
