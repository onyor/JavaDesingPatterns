package Factory;

public class CarFactory {
    public static ICar getCar(String tip) {

        if ("Sedan".equalsIgnoreCase(tip)) return new Sedan();
        else if ("Hatchback".equalsIgnoreCase(tip)) return new Hatchback();

        return null;
    }
}
