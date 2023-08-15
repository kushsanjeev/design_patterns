package org.example.observerPattern.observer;

import org.example.observerPattern.observable.StockObservable;

public class EmailAlertObservable implements NotificationAlertObserver{

    StockObservable stockObservable;
    String email;

    public EmailAlertObservable(String email, StockObservable observable){
        this.stockObservable = observable;
        this.email = email;
    }
    @Override
    public void update() {
        sendEmail(email);
    }

    private void sendEmail(String email){
        System.out.println("email product is now available sent to email : "+ email);
    }
}
