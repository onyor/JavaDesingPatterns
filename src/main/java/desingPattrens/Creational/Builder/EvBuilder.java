package main.java.desingPattrens.Creational.Builder;

public class EvBuilder {
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

    public static EvBuilder startNormalEvBuilder(String il, String ilce, String mahalle, int binaYili, int odaSayisi) {
        EvBuilder evBuilder=new EvBuilder();
        evBuilder.il = il;
        evBuilder.ilce=ilce;
        evBuilder.mahalle=mahalle;
        evBuilder.binaYili=binaYili;
        evBuilder.odaSayisi=odaSayisi;

        return evBuilder;
    }

    public static EvBuilder startHavuzluEvBuilder(String il, String ilce, String mahalle, int binaYili, int odaSayisi) {

        EvBuilder evBuilder=new EvBuilder();
        evBuilder.il = il;
        evBuilder.ilce=ilce;
        evBuilder.mahalle=mahalle;
        evBuilder.binaYili=binaYili;
        evBuilder.odaSayisi=odaSayisi;
        evBuilder.isHavuz=true;

        return evBuilder;
    }

    public Ev build() {
        Ev ev = new Ev();

        ev.setIl(il);
        ev.setIlce(ilce);
        ev.setMahalle(mahalle);

        ev.setBinaYili(binaYili);
        ev.setOdaSayisi(odaSayisi);
        ev.setBanyoSayisi(banyoSayisi);
        ev.setTuvaletSayisi(tuvaletSayisi);
        ev.setBalkonSayisi(balkonSayisi);

        ev.setDublex(isDublex);
        ev.setEsyali(isEsyali);
        ev.setOtopark(isOtopark);
        ev.setCocukParki(isCocukParki);
        ev.setKlima(isKlima);
        ev.setHavuz(isHavuz);

        return ev;
    }

    public EvBuilder setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
        return this;
    }

    public EvBuilder setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
        return this;
    }

    public EvBuilder setBalkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
        return this;
    }

    public EvBuilder setDublex(boolean dublex) {
        isDublex = dublex;
        return this;
    }

    public EvBuilder setEsyali(boolean esyali) {
        isEsyali = esyali;
        return this;
    }

    public EvBuilder setOtopark(boolean otopark) {
        isOtopark = otopark;
        return this;
    }

    public EvBuilder setCocukParki(boolean cocukParki) {
        isCocukParki = cocukParki;
        return this;
    }

    public EvBuilder setKlima(boolean klima) {
        isKlima = klima;
        return this;
    }

    public EvBuilder setHavuz(boolean havuz) {
        isHavuz = havuz;
        return this;
    }
}
