package main.java.desingPattrens.Structural.Proxy;

import java.math.BigDecimal;

public class GercekYonetici implements ISirketBilgileri {
    @Override
    public BigDecimal getCiro() {
        return BigDecimal.valueOf(100000);
    }
}
