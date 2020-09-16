package main.java.desingPattrens.Structural.Facade.Borc;

public class OdemeBilgileri {
    private String kartUzerindekiIsim;
    private String kartNo;
    private long skAy;
    private long skYil;
    private long cvvNo;

    public OdemeBilgileri() {

    }

    public OdemeBilgileri(String kartUzerindekiIsim, String kartNo, long skAy, long skYil, long cvvNo) {
        this.kartUzerindekiIsim = kartUzerindekiIsim;
        this.kartNo = kartNo;
        this.skAy = skAy;
        this.skYil = skYil;
        this.cvvNo = cvvNo;
    }

    //<editor-fold desc="Getter & Setter & toString()">
    public String getKartUzerindekiIsim() {
        return kartUzerindekiIsim;
    }

    public void setKartUzerindekiIsim(String kartUzerindekiIsim) {
        this.kartUzerindekiIsim = kartUzerindekiIsim;
    }

    public String getKartNo() {
        return kartNo;
    }

    public void setKartNo(String kartNo) {
        this.kartNo = kartNo;
    }

    public long getSkAy() {
        return skAy;
    }

    public void setSkAy(long skAy) {
        this.skAy = skAy;
    }

    public long getSkYil() {
        return skYil;
    }

    public void setSkYil(long skYil) {
        this.skYil = skYil;
    }

    public long getCvvNo() {
        return cvvNo;
    }

    public void setCvvNo(long cvvNo) {
        this.cvvNo = cvvNo;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    //</editor-fold>

}

