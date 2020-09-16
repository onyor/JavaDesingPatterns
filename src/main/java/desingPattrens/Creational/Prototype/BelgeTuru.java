package main.java.desingPattrens.Creational.Prototype;

public class BelgeTuru implements Cloneable {
    private Long id;
    private String adi;

    public BelgeTuru() {

    }

    public BelgeTuru(Long id, String adi) {
        this.id = id;
        this.adi = adi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Override
    public String toString() {
        return "BelgeTuru{" +
                "id=" + id +
                ", adi='" + adi + '\'' +
                '}';
    }

    @Override
    protected BelgeTuru clone() throws CloneNotSupportedException {
        return (BelgeTuru) super.clone();
    }
}
