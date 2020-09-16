package main.java.desingPattrens.Creational.Builder;

public class MainBuilder {
    public static void main(String[] args) {
        Ev ev1 = EvBuilder.startNormalEvBuilder("İstanbul","Ümraniye","Tatlısu",2008,3)
                .setCocukParki(true)
                .setOtopark(true)
                .build();

        printEv(ev1);


        Ev ev2 = EvBuilder.startHavuzluEvBuilder("İstanbul","Ataşehir","Atatürk",2010,4)
                .setCocukParki(true)
                .setOtopark(true)
                .build();

        printEv(ev2);
    }

    private static void printEv(Ev ev) {
        System.out.println();

        System.out.println("Ev eklendi -> " + ev);

        System.out.println();
    }
}
