package main.java.desingPattrens.Behavioural.Chain;

public enum EnumIl {
    ISTANBUL("İstanbul"),
    ANKARA("Ankara"),
    ANTALYA("Antalya"),
    CANKIRI("Çankırı"),
    KARS("Kars"),
    AZERBEYCAN("Azerbeycan");

    private String il;

    EnumIl(String il) {
        this.il = il;
    }

    public String getIl() {
        return il;
    }

}
