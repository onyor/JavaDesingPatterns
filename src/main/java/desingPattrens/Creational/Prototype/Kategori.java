package main.java.desingPattrens.Creational.Prototype;

public class Kategori implements Cloneable{
    private Long id;
    private String adi;

    public Kategori() {

    }

    public Kategori(Long id, String adi) {
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
        return "Kategori{" +
                "id=" + id +
                ", adi='" + adi + '\'' +
                '}';
    }

    @Override
    protected Kategori clone() throws CloneNotSupportedException {
        return (Kategori) super.clone();
    }
}
