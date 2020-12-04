package main.java.desingPattrens.Structural.Proxy;

        import java.math.BigDecimal;

public class MainProxy {

    /**
     * Asıl işi yapan nesne yerine, vekil bir nesne kullanılmasına olanak tanır.
     * Asıl nesneye erişmeden önce işlemler ya da kontroller yapabiliriz.
     * -A remote Proxy  -> Farklı adres alanında ki temsilci için locak bir temsilci oluşturmamızı sağlar.
     * -A Virtual Proxy -> maliyetli nesneler için sanal bir temsilci sağlar. (Örn: Lazy Loading)
     * -A Protection Proxy -> orginal nesneye erişim kontrol' ünü sağlıyor.
     * -A Smart Reference -> bir nesneye eişildiğinde öncesi ve ya sonra belli işlemlerin kullanılmasını sağlar
     *
     * Şirket bilgilerine ulaşılabilecek bir yapı kuralım,
     * Şirket Yöneticileri erişebilir olacak, dışarıdan alelade bir kişi bu bilgilere erişmemeli.
     * @param args
     */
    public static void main(String[] args) {
        YoneticiProxy yoneticiProxy = new YoneticiProxy("yusuf", "123");
        try {
            BigDecimal ciro = yoneticiProxy.getCiro();
            System.out.println("Şirket Cirosu: "+ciro);
        } catch (IllegalAccessException e) {
            System.out.println("Hassas bilgilere erişiminiz yoktur!");
        }
    }
}
