package main.java.desingPattrens.Behavioural.Command.Commands;

import main.java.desingPattrens.Behavioural.Command.Islem;

import java.math.BigDecimal;

public class UsAlmaCommand implements Islem {

    @Override
    public BigDecimal islem(BigDecimal sayi1, BigDecimal sayi2) {
        return sayi1.pow(sayi2.intValue());
    }

    @Override
    public BigDecimal islem(BigDecimal sayi1, BigDecimal sayi2, BigDecimal sayi3) {
        return null;
    }
}
