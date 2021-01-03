package main.java.desingPattrens.Behavioural.Mediator;

import java.math.BigDecimal;

public class MainMediator {
	/**
	 * Mediator -> Kelime anlamı Arabulucu
	 * Birbiri ile ilişkili nesnelerin arasında ilişkiyi birebir kurmak yerine
	 * Buraya aracılık eden bir aracı tanımlayıp ilişkiyi bunun üzerinden yürütmeye yarayan desing pattern' dir.
	 * Böylelikle nesneler arasında karmaşık sıkı sıkıya bir bağ kurulmaz.
	 * Bu sayede nesneler birbirinden bağımsız bir şekilde değiştirilebilir olurlar bakım vb. kolaylaşmış olur.
	 *
	 * Örn: Yediğimiz ürünler sofraya gelene kadar bir yol izlemekte bunu örneklendirirsek
	 *
	 * Çiftçiler bu sebzeleri üretirler, sonrasında ise bu ürünün satış aşaması var.
	 * Bu ürünler hal ve marketlere gidiyor. Ve oradan soframıza gelmekte.
	 *
	 * Çiftçi ve Halci arasında bir ilişki söz konusu. Ve burada bir çok çiftçi ve halci söz konusu bir karmaşıklık var.
	 * Bir bu karmaşıklığın önüne geçebilmek için bir aracıya ihtiyacımız var.
	 * Bu aracı da -> Kabzamal dır.
	 * Ürünü çiftçiden alır ve hal' e satar.
	 * @param args
	 */

	public static void main(String[] args) {
		Kabzimal kabzimal = new Kabzimal();

		DomatesUreticisi ureticiFurkan = new DomatesUreticisi("Furkan", BigDecimal.valueOf(5), kabzimal);
		DomatesUreticisi ureticiBahadir = new DomatesUreticisi("Bahadır", BigDecimal.valueOf(4), kabzimal);
		DomatesUreticisi ureticiYusuf = new DomatesUreticisi("Yusuf", BigDecimal.valueOf(3), kabzimal);

		DomatesHalcisi halciAhmet = new DomatesHalcisi("Ahmet", BigDecimal.valueOf(9), kabzimal);
		DomatesHalcisi halciMehmet = new DomatesHalcisi("Mehmet", BigDecimal.valueOf(7), kabzimal);

		kabzimal.UreticiEkle(ureticiYusuf);
		kabzimal.UreticiEkle(ureticiBahadir);
		kabzimal.UreticiEkle(ureticiFurkan);

		kabzimal.halciEkle(halciAhmet);
		kabzimal.halciEkle(halciMehmet);

		ureticiBahadir.urunSat();
		halciMehmet.urunAl();


	}

}
