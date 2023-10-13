package org.example.observerPattern.observable;

import org.example.observerPattern.observer.NotificationAlertObserver;

public class MacBookObservable extends BaseObservable{

    @Override
    public void notifySubscriber() {
        for(NotificationAlertObserver observer : notificationAlertObservers){
            observer.update("macbook stock available");
        }
    }
}
