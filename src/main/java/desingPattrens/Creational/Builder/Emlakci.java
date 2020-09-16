package main.java.desingPattrens.Creational.Builder;

public class Emlakci {
    public static void main(String[] args) {
        Ev ev1 =new Ev();
        ev1.setIl("ıstanbul");
        ev1.setIlce("Ataşehir");
        ev1.setMahalle("Atatürk");
        ev1.setOdaSayisi(3);
        ev1.setBinaYili(2010);
        ev1.setKlima(true);

        Ev ev2 = new Ev("İstanbul", "Ümraniye", "Tatlı Su", 2008, 2, 3, 2, 0, false, false, true, true, true, false);
        printEv(ev1);
        printEv(ev2);
    }

    private static void printEv(Ev ev) {
        System.out.println();

        System.out.println("Ev eklendi -> " + ev);

        System.out.println();
    }
}
