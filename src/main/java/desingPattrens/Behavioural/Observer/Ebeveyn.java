package main.java.desingPattrens.Behavioural.Observer;

public class Ebeveyn implements IObserver {
    private String adi;

    public Ebeveyn(String adi) {
        this.adi=adi;
    }

    @Override
    public void update(Observable observable) {

        Termometre termometre= (Termometre) observable;
        System.out.println(adi+" dedi ki: ooo sıcaklık "+ termometre.getAnlikSicaklik()+" derece olmuş!");
    }
}
