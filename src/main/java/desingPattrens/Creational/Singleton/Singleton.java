package main.java.desingPattrens.Creational.Singleton;

public class Singleton {
    private static Singleton singleton;

    private static int count=0;

    public static Singleton getSingleton() {

        //Bu if control'ü sayesinde de programı yavaşlatmamış olduk.
        //Lazy loading yapmış olduk ayrıca, maxsimum performans ile bir tasarım yapmış olduk.
        if(singleton==null){
            //synchronized -> Nesnenin ilk oluştuğu zamanda ihtiyaç duyulur
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton=new Singleton();
                }
            }
        }
        count++;
        System.out.println(count);
        return singleton;
    }

    private Singleton(){
        System.out.println("Nesne oluşturuldu!");
    }


}
