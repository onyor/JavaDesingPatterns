package main.java.desingPattrens.Behavioural.Command.Commands;

import main.java.desingPattrens.Behavioural.Command.Islem;

import java.math.BigDecimal;

public class ToplamaCommand implements Islem {
    @Override
    public BigDecimal islem(BigDecimal sayi1, BigDecimal sayi2) {
        return sayi1.add(sayi2);
    }

    @Override
    public BigDecimal islem(BigDecimal sayi1, BigDecimal sayi2, BigDecimal sayi3) {
        sayi1 = sayi1.add(sayi2);
        return sayi1.add(sayi3);
    }
}
