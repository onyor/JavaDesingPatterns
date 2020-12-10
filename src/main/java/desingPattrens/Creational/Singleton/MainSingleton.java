package main.java.desingPattrens.Creational.Singleton;


/**
 * Desing Pattern'ler sıklıkla karşılaşılabilecek sorunlara bu sorunların soyutlayarak tasarlanmış genel çözüm üretirler.
 * Pattern aslında bir sorun ve bu sorunun da çözümü anlamına gelmektedir.
 * 3' e ayrılır.
 * Creational
 * Structurol
 * Behavioural - Davranışsal
 *
 *
 * Singleton tekil anlamına gelmektedir.
 * İlgili nesneden bir tane olsun istiyorsak o zaman bu tasarım kalıbını kullanabiliriz.
 */

/**
 * Singleton tasarım kalıbı ile sadece bir nesne oluşur.
 * Nesne oluşması için kendi constructor' ına(yapılandırıcısına) ihtiyaç duyar.
 * Yapılandırıcısına giremiyorsa ilgili nesne yapılandırılamaz dolayısıyla oluşturulamaz.
 *
 *
 */
public class MainSingleton {
    public static void main(String[] args) {

        for (int i=0;i<10;i++){
            Singleton singleton=Singleton.getSingleton();

        }



    }
}
