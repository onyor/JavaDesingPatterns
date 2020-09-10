package main.java.desingpattrens.Structural.Facade.Borc;

import main.java.desingpattrens.Structural.Facade.Enum.EnumBorcTuru;

import java.math.BigDecimal;
import java.util.Date;

public class Borc {
    private Long id;
    private EnumBorcTuru borcTuru;
    private BigDecimal borcTutari;
    private Date vadeTarihi;

    public Borc() {

    }

    public Borc(long id, EnumBorcTuru borcTuru, BigDecimal borcTutari, Date vadeTarihi) {
        this.id = id;
        this.borcTuru = borcTuru;
        this.borcTutari = borcTutari;
        this.vadeTarihi = vadeTarihi;
    }

    //<editor-fold desc="Getter & Setter & toString()">
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public EnumBorcTuru getBorcTuru() {
        return borcTuru;
    }

    public void setBorcTuru(EnumBorcTuru borcTuru) {
        this.borcTuru = borcTuru;
    }

    public BigDecimal getBorcTutari() {
        return borcTutari;
    }

    public void setBorcTutari(BigDecimal borcTutari) {
        this.borcTutari = borcTutari;
    }

    public Date getVadeTarihi() {
        return vadeTarihi;
    }

    public void setVadeTarihi(Date vadeTarihi) {
        this.vadeTarihi = vadeTarihi;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    //</editor-fold>
}
