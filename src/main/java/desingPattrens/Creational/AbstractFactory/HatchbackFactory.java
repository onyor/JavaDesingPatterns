package main.java.desingPattrens.Creational.AbstractFactory;

public class HatchbackFactory implements CarFactory {
    @Override
    public ICar getCar() {
        return new Hatchback();
    }
}
