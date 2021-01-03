package main.java.desingPattrens.Behavioural.Chain;

public class SbmKargo {
    public static KargoSirketi getKargoSirketi(){
        CankiriSube cankiriSube = new CankiriSube();
        AnkaraSube ankaraSube = new AnkaraSube();
        IstanbulSube istanbulSube = new IstanbulSube();
        AntalyaSube antalyaSube = new AntalyaSube();
        KarsSube karsSube=new KarsSube();

        KargoSirketi sbmKargo = cankiriSube
                .setSonrakiKargoSirketi(ankaraSube
                        .setSonrakiKargoSirketi(istanbulSube
                                .setSonrakiKargoSirketi(antalyaSube
                                    .setSonrakiKargoSirketi(karsSube
                                    ))));

        return sbmKargo;
    }
}
