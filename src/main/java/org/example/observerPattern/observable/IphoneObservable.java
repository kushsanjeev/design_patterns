package org.example.observerPattern.observable;

import org.example.observerPattern.observer.NotificationAlertObserver;

public class IphoneObservable extends BaseObservable{

    @Override
    public void notifySubscriber() {
        for(NotificationAlertObserver observer : notificationAlertObservers){
            observer.update("Iphone stock available");
        }
    }
}
