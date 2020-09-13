package main.java.desingpattrens.Creational.Prototype;

public class Kategori {
    private Long id;
    private String adi;

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
}
