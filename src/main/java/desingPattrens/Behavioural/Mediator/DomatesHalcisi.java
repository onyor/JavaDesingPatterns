package main.java.desingPattrens.Behavioural.Mediator;

import java.math.BigDecimal;

public class DomatesHalcisi extends Halci {
    public DomatesHalcisi(String adi, BigDecimal fiyat, Araci araci) {
        super(adi, EnumUrun.DOMATES, fiyat, araci);
    }
}
