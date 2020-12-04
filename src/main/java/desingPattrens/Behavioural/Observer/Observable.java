package main.java.desingPattrens.Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<IObserver> IObserverList;

    //Initialize  ediyoruz.
    public Observable(){
        IObserverList =new ArrayList<>();
    }

    public void ekle(IObserver IObserver) {
        IObserverList.add(IObserver);
    }

    public void cikar(IObserver IObserver) {
        IObserverList.remove(IObserver);
    }

    public void haberVer(){
        for (IObserver IObserver : IObserverList) {
            IObserver.update(this);
        }
    }
}
