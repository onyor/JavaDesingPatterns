package main.java.desingpattrens.Creational.Factory;

public class MainFactory {
        public static void main(String[] args) {
            ICar hatchbackAraba=CarFactory.getCar("Hatchback");
            ICar sedanAraba=CarFactory.getCar("Sedan");


            System.out.println(hatchbackAraba.getType());
            System.out.println(sedanAraba.getType());
        }
}
