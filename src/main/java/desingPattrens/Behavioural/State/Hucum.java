package main.java.desingPattrens.Behavioural.State;

public class Hucum implements IKonsol {
    @Override
    public void kareBas() {
        System.out.println("Şut çekiliyor!");
    }

    @Override
    public void ucgenBas() {
        System.out.println("Arapası veriliyor!");
    }

    @Override
    public void yuvarlakBas() {
        System.out.println("Orta açılıyor!");
    }

    @Override
    public void xBas() {
        System.out.println("Kısa pas veriliyor!");
    }
}
