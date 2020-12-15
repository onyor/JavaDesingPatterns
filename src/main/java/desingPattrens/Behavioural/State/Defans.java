package main.java.desingPattrens.Behavioural.State;

public class Defans implements IKonsol {
    @Override
    public void kareBas() {
        System.out.println("Yardımcı oyuncu müdehale ediyor!");
    }

    @Override
    public void ucgenBas() {
        System.out.println("Kaleci açılıyor!");
    }

    @Override
    public void yuvarlakBas() {
        System.out.println("Kayarak müdahale ediliyor!");
    }

    @Override
    public void xBas() {
        System.out.println("Pres yapılıyor!");
    }
}
