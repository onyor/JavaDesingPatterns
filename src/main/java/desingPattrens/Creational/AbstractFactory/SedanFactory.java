package main.java.desingPattrens.Creational.AbstractFactory;

public class SedanFactory implements CarFactory{
    @Override
    public ICar getCar() {
        return new Sedan();
    }
}
