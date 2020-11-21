package main.java.desingPattrens.Behavioural.Mediator;

import java.math.BigDecimal;

public class MainMediator {

	public static void main(String[] args) {
		Kabzimal kabzimal = new Kabzimal();

		DomatesUreticisi ureticiBahadir = new DomatesUreticisi("Bahadır", BigDecimal.valueOf(4), kabzimal);
		DomatesUreticisi ureticiYusuf = new DomatesUreticisi("Yusuf", BigDecimal.valueOf(3), kabzimal);

		DomatesHalcisi halciAhmet = new DomatesHalcisi("Ahmet", BigDecimal.valueOf(9), kabzimal);
		DomatesHalcisi halciMehmet = new DomatesHalcisi("Mehmet", BigDecimal.valueOf(7), kabzimal);

		kabzimal.UreticiEkle(ureticiBahadir);
		kabzimal.UreticiEkle(ureticiYusuf);
		kabzimal.halciEkle(halciAhmet);
		kabzimal.halciEkle(halciMehmet);

		ureticiBahadir.urunSat();
		halciMehmet.urunAl();


	}

}
