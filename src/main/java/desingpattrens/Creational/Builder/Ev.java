package main.java.desingpattrens.Creational.Builder;

public class Ev {
    private String il;
    private String ilce;
    private String mahalle;

    private int binaYili;
    private int odaSayisi;
    private int banyoSayisi;
    private int tuvaletSayisi;
    private int balkonSayisi;

    private boolean isDublex;
    private boolean isEsyali;
    private boolean isOtopark;
    private boolean isCocukParki;
    private boolean isKlima;
    private boolean isHavuz;

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public int getBinaYili() {
        return binaYili;
    }

    public void setBinaYili(int binaYili) {
        this.binaYili = binaYili;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public int getBanyoSayisi() {
        return banyoSayisi;
    }

    public void setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
    }

    public int getTuvaletSayisi() {
        return tuvaletSayisi;
    }

    public void setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
    }

    public int getBalkonSayisi() {
        return balkonSayisi;
    }

    public void setBalkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
    }

    public boolean isDublex() {
        return isDublex;
    }

    public void setDublex(boolean dublex) {
        isDublex = dublex;
    }

    public boolean isEsyali() {
        return isEsyali;
    }

    public void setEsyali(boolean esyali) {
        isEsyali = esyali;
    }

    public boolean isOtopark() {
        return isOtopark;
    }

    public void setOtopark(boolean otopark) {
        isOtopark = otopark;
    }

    public boolean isCocukParki() {
        return isCocukParki;
    }

    public void setCocukParki(boolean cocukParki) {
        isCocukParki = cocukParki;
    }

    public boolean isKlima() {
        return isKlima;
    }

    public void setKlima(boolean klima) {
        isKlima = klima;
    }

    public boolean isHavuz() {
        return isHavuz;
    }

    public void setHavuz(boolean havuz) {
        isHavuz = havuz;
    }

    public Ev(){

    }

    //Teleskobik Constructor
    public Ev(String il, String ilce, String mahalle, int binaYili, int odaSayisi, int banyoSayisi, int tuvaletSayisi, int balkonSayisi, boolean isDublex, boolean isEsyali, boolean isOtopark, boolean isCocukParki, boolean isKlima, boolean isHavuz) {
        this.il = il;
        this.ilce = ilce;
        this.mahalle = mahalle;
        this.binaYili = binaYili;
        this.odaSayisi = odaSayisi;
        this.banyoSayisi = banyoSayisi;
        this.tuvaletSayisi = tuvaletSayisi;
        this.balkonSayisi = balkonSayisi;
        this.isDublex = isDublex;
        this.isEsyali = isEsyali;
        this.isOtopark = isOtopark;
        this.isCocukParki = isCocukParki;
        this.isKlima = isKlima;
        this.isHavuz = isHavuz;
    }

    @Override
    public String toString() {
        return "Ev{" +
                "il='" + il + '\'' +
                ", ilce='" + ilce + '\'' +
                ", mahalle='" + mahalle + '\'' +
                ", binaYili=" + binaYili +
                ", odaSayisi=" + odaSayisi +
                ", banyoSayisi=" + banyoSayisi +
                ", tuvaletSayisi=" + tuvaletSayisi +
                ", balkonSayisi=" + balkonSayisi +
                ", isDublex=" + isDublex +
                ", isEsyali=" + isEsyali +
                ", isOtopark=" + isOtopark +
                ", isCocukParki=" + isCocukParki +
                ", isKlima=" + isKlima +
                ", isHavuz=" + isHavuz +
                '}';
    }
}
