package main.java.desingPattrens.Behavioural.Command.Commands;

import main.java.desingPattrens.Behavioural.Command.Islem;

import java.math.BigDecimal;

public class ModCommand implements Islem {
    @Override
    public BigDecimal islem(BigDecimal sayi1, BigDecimal sayi2) {
        return sayi1.remainder(sayi2);
    }

    @Override
    public BigDecimal islem(BigDecimal sayi1, BigDecimal sayi2, BigDecimal sayi3) {
        return null;
    }
}
