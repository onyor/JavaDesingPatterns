package main.java.desingpattrens.Behavioural.Strategy;

public class MainStrategy {
    public static void main(String[] args) {
        Context context = new Context(new OperationMultiply());
        System.out.println(context.executeStrategy(5, 4));

        context = new Context(new OperationSubstract());
        System.out.println(context.executeStrategy(5, 4));

        context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(5, 4));
    }
}
