package main.java.desingPattrens.Creational.Factory;

public class CarFactory {
    public static ICar getCar(String tip) {

        //Peki bir çok araba modeli olduğunu düşünürsek ne yapmamız gerekyor!!!
        if ("Sedan".equalsIgnoreCase(tip)) return new Sedan();
        else if ("Hatchback".equalsIgnoreCase(tip)) return new Hatchback();

        return null;
    }
}
