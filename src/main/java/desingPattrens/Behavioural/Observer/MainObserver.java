package main.java.desingPattrens.Behavioural.Observer;

import java.math.BigDecimal;


/**
 * Kelime anlamı gözlemci
 * Bir yerde, bir şey değiştiğinde başka yerlerde bunlardan haberdak olmak isterse bu desing pattern kullanılabilir.
 * (Örn: Youtube - Abone Ol - Zil butonu)
 * Kanal Observable - Aboneler Observer
 */


/**
 * Bizim örneğimizde Observable (Termometre)
 */
public class MainObserver {

    public static void main(String[] args) {
        BigDecimal minSicaklik = BigDecimal.valueOf(23);
        BigDecimal maxSicaklik = BigDecimal.valueOf(28);

        Termometre termometre = new Termometre(minSicaklik, maxSicaklik);

        Ebeveyn anne = new Ebeveyn("Anne");
        Ebeveyn baba = new Ebeveyn("Baba");

        for(int i=termometre.getAnlikSicaklik().intValue(); i<=30 ; i++){
            termometre.setAnlikSicaklik(BigDecimal.valueOf(i));
        }

        termometre.ekle(anne);
        //termometre.ekle(baba);

        for(int i=termometre.getAnlikSicaklik().intValue(); i>=22 ; i--){
            termometre.setAnlikSicaklik(BigDecimal.valueOf(i));
        }
    }
}
