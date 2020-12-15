package main.java.desingPattrens.Behavioural.Iterator;

import java.util.Iterator;

public class SoruIterator implements Iterator {

    private Soru[] sorular;
    private int next;

    public SoruIterator(Soru[] sorular) {
        this.sorular = sorular;
    }

    @Override
    public boolean hasNext() {
        if (next < sorular.length) {
            return true;
        }
        else
            return false;
    }

    @Override
    public Object next() {
        Soru soru=sorular[this.next];
        next++;

        return soru;
    }
}
