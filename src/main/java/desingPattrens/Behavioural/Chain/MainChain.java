package main.java.desingPattrens.Behavioural.Chain;

public class MainChain  {
    public static void main(String[] args) {
        /**
         * Chain of Responsibility -> Sorumluluk Zinciri
         * Bir isteğin alıcı ile isteği yapanı birbirine sıkıca bağlamaktan kaçınmak gerekir.
         * Bunu yaparken bir zincir ile alıcı nesneleri zincirlernir ve yapılması gereken işlem yapılana kadar çizilen bu zincir yolu takıip edilir.
         * Görev yerine getirildiğinde zincir halkasından çıkılır.
         *
         * Örn:
         * Bir kargo şirketi düşünelim.
         * Çankırıdan Kargo verilsin.  Çankırı-Ankara-İstanbul-Antalya
         *
         * Bu bir yol. Ürün antalyaya gidecekse. Oraya kadar ilerler. Ankara'ya gidecekse oraya kadar ilerler.
         * Bu ürün ü gönderecek kişinin bu yolu bilmesine gerek yok.
         * SBM kargo olarak bu sorumluluk zincirini belirleyeceğiz.
         * Ve isteiği yapan, kargolayan kişiden bu karmaşı arındıracağız.
         * Client sadece bir istek te bulanacak. Ve tüm karmaşayı SbmKargo üstlenecek.
         * SbmKargo'ununda belli sorumlulukları olacak. Zinciri takip edecek.
         */
        KargoSirketi sbmKargo=SbmKargo.getKargoSirketi();

        sbmKargo.kargola(EnumIl.AZERBEYCAN);

        System.out.println("\n--------------------\n");

        sbmKargo.kargola(EnumIl.KARS);

        System.out.println("\n--------------------\n");

        sbmKargo.kargola(EnumIl.ANTALYA);

        System.out.println("\n--------------------\n");

        sbmKargo.kargola(EnumIl.ISTANBUL);

        System.out.println("\n--------------------\n");

        sbmKargo.kargola(EnumIl.ANKARA);

    }
}
