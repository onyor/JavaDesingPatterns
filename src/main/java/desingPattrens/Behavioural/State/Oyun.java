package main.java.desingPattrens.Behavioural.State;

public class Oyun {
    private IKonsol konsol;

    public Oyun() {
        System.out.println("oyun Başladı!!!");

        this.konsol = new Hucum();
    }

    public void ucgen(){
        konsol.ucgenBas();
    }

    public void kare(){
        konsol.kareBas();
    }

    public void yuvalar(){
        konsol.yuvarlakBas();
    }

    public void x(){
        konsol.xBas();
    }

    public void topuKap(){
        System.out.println("Topu kaptık hücüma çıkılıyor!");
        konsol = new Hucum();
    }

    public void topuKaptır(){
        System.out.println("Top kaptırıldı Allah'ını seven defansa gelsin");
        konsol = new Defans();
    }
}
