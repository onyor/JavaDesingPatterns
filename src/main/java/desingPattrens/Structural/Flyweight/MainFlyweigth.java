package main.java.desingPattrens.Structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class MainFlyweigth {
    /**
     * Kelime anlamı -> 'Sineksiklet'
     * Strutctural bir desing pattern' dır.
     * Bazen uygulamalarımızın yapısı gereği bir çok nesne oluşturmamız gerekmektedir.
     * Fakat bu nesnelerin bir çoğu birbirine benzerdir. Hatta bazen birbirinin aynısıdır.
     *
     * Bu durumda nesneleri her seferinde oluşturmak yerine, bir havuz oluşturup
     * Eğer bu havuzun içerisinde varsa bu havuzun içerisinden alınıp kullanılır.
     * Yok ise sıfırdan oluşturulur.
     *
     * Bu sayede benzer nesnelerin oluşturulması önlenerek daha performanslı bir uygulama yazılmış olur.
     *
     * @param args
     */

    /**
     * Bir tane savaş oyunu yazdığımızı düşünelim.
     * Yüzbaşı ve Yüzbaşının da askerleri var diyelim.
     * operasyon Ateş etmek.
     * mermileri her seferinde oluşturmak program için maliyetli olacaktır!
     *
     * @param args
     */
    public static void main(String[] args) {
        List<Asker> askerList = new ArrayList<>();

        Yuzbasi yuzbasi=new Yuzbasi();

        askerList.add(yuzbasi);

        for (int i = 0; i < 50; i++) {
            Er er = new Er();
            askerList.add(er);
        }

        for (Asker asker : askerList) {
            asker.atesEt();
        }

        for (Asker asker : askerList) {
            asker.tara();
        }
    }
}
