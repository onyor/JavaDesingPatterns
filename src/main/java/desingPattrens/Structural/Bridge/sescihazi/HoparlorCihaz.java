package main.java.desingPattrens.Structural.Bridge.sescihazi;

public class HoparlorCihaz implements ISesCihazi{
    @Override
    public void sesiCal(String ses) {
        System.out.println(this.toString()+ " :  ses veriyor -> "+ ses);
    }

    @Override
    public String toString() {
        return "Hoparlör";
    }
}
