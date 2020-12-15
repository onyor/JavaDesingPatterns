package main.java.desingPattrens.Behavioural.Memento;


/**
 * Notepad deki bütün özellikleri karşılayabiliyor olmalı memento.
 * Çünkü notepad' i yedekleyecek.
 */
public class NotePadMemento {
    private String metin;

    public NotePadMemento(){
        metin = "";
    }

    public NotePadMemento(String metin) {
        this.metin = metin;
    }

    public String getMetin() {
        return metin;
    }
}
