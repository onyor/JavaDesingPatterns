package main.java.desingPattrens.Behavioural.Command;

import java.math.BigDecimal;

public class CalculatorNew {
    public static BigDecimal islem(Islem islem, BigDecimal sayi1, BigDecimal sayi2) {
        return islem.islem(sayi1, sayi2);
    }
    public static BigDecimal islem(Islem islem, BigDecimal sayi1, BigDecimal sayi2,BigDecimal sayi3) {
        return islem.islem(sayi1, sayi2,sayi3);
    }
}
