package main.java.desingPattrens.Structural.Flyweight;

public abstract class Asker {

    private EnumMermiBoyutu mermiBoyutu;

    public Asker(EnumMermiBoyutu mermiBoyutu) {
        this.mermiBoyutu=mermiBoyutu;
    }

    public void atesEt() {
        //Performansı düşük versiyonu.
        //Mermi mermi=new Mermi(mermiBoyutu);

        //Performanslı hale getirildi.
        Mermi mermi=MermiFactory.mermiUret(mermiBoyutu);

        mermi.atesle();
    }

    public void tara(){
        for (int i = 0; i < 5; i++) {
            atesEt();
        }
    }
}
