package main.java.desingPattrens.Behavioural.Strategy;

public class OperationAdd implements IStrategy {
    @Override
    public int doOperation(int number1, int number2) {
        return number1+number2;
    }
}
