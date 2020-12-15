package main.java.desingPattrens.Creational.AbstractFactory;

public class MainAbstractFactory {
    /**
     * Factory deseninde ki if/ else if yapısından kurtulmak için, abstract factory tasarım kalıbını kullanıyoruz.
     * @param args
     */
    public static void main(String[] args) {
        CarFactory sedan=new SedanFactory();
        CarFactory hatchback=new HatchbackFactory();
        ICar hatchbackProduct=hatchback.getCar();
        ICar sedanProduct=sedan.getCar();

        System.out.println(hatchbackProduct.getType());
        System.out.println(sedanProduct.getType());
    }
}
