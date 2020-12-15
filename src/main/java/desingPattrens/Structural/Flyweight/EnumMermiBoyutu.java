package main.java.desingPattrens.Structural.Flyweight;

public enum EnumMermiBoyutu {
    DOKUZMILIMETRE(9),
    BESELLIALTI(5.56),
    YEDIALTMISIKI(7.62)
    ;

    private double boyut;

    EnumMermiBoyutu(double boyut) {
        this.boyut=boyut;
    }

    public double getBoyut() {
        return boyut;
    }

    @Override
    public String toString() {
        return String.valueOf(boyut);
    }
}
