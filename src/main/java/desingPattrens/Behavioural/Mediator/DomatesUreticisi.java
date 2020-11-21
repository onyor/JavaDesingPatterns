package main.java.desingPattrens.Behavioural.Mediator;

import java.math.BigDecimal;

public class DomatesUreticisi extends Uretici {
    public DomatesUreticisi(String adi, BigDecimal fiyat, Araci araci) {
        super(adi, EnumUrun.DOMATES, fiyat, araci);
    }
}
