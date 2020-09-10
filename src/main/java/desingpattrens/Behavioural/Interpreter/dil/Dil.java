package main.java.desingpattrens.Behavioural.Interpreter.dil;

public abstract class Dil {

    private EnumDil dil;

    public Dil(EnumDil enumDil) {
        this.dil = enumDil;
    }

    public String turkceyeCevir(String soz) {
        String[] kelimeler= soz.split(" ");

        String turkce="";

        for (String kelime : kelimeler) {
            String turkceKelime = kelimeyiTurkceyeCevir(kelime);
            turkce=turkce+" "+turkceKelime;
        }

        return turkce;
    }

    /**
     * Secelacam -> se-ce-la-m
     * @param kelime
     * @return
     */
    private String kelimeyiTurkceyeCevir(String kelime) {
        String kelimeAyarlayici=kelime;

        String heceleri=hecele(kelimeAyarlayici);

        String[] heceList = heceleri.split("-");

        String kelimeninTurkcesi = hecelerdenKelimeBul(heceList);

        return kelimeninTurkcesi;
    }

    /**
     * se
     * ce
     * la
     * ca
     * m
     * @param heceList
     * @return
     */
    private String hecelerdenKelimeBul(String[] heceList) {
        int i=0;
        String turkceKelime = "";
        for (String hece : heceList) {
            if(i%2==0){
                turkceKelime=turkceKelime+hece;
            }
            i++;
        }
        return  turkceKelime;
    }

    /**
     * Her bir hece arasına "-" koyacak
     *
     * secelacam -> se-ce-la-ca-m
     *
     * @param kelimeAyarlayici
     * @return
     */
    private String hecele(String kelimeAyarlayici) {
        String hecelenmisHali = "";
        while(kelimeAyarlayici.length()>0){

            String hece = getHece(kelimeAyarlayici);

            hecelenmisHali = hecelenmisHali + hece + "-";

            kelimeAyarlayici = kelimeAyarlayici.replaceFirst(hece, "");

        }

        return hecelenmisHali;
    }

    private String getHece(String kelime) {
        int boyut = dil.getEk().length();
        if (kelime.length() < dil.getEk().length()) {
            boyut=kelime.length();
        }

        String substring = kelime.substring(0, boyut);

        return substring;
    }
}
