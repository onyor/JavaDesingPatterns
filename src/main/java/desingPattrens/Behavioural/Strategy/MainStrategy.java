package main.java.desingPattrens.Behavioural.Strategy;

public class MainStrategy {
    /**
     * Bir algoritma ailesi tanımlayıp her birini kapsülleyip, değiştirilebilir yapmalıyız.
     *
     * Algoritmanın onu kullanan client'lardan bağımsız olarak değiştirilmesine izin verilmelidir.
     * @param args
     */
    public static void main(String[] args) {
        Context context = new Context(new OperationMultiply());
        System.out.println(context.executeStrategy(5, 4));

        context = new Context(new OperationSubstract());
        System.out.println(context.executeStrategy(5, 4));

        context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(5, 4));
    }
}
