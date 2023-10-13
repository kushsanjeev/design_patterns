package org.example.observerPattern.observer;

import org.example.observerPattern.observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{

    StockObservable stockObservable;
    String email;

    public EmailAlertObserver(String email, StockObservable observable){
        this.stockObservable = observable;
        this.email = email;
    }
    @Override
    public void update(String msg) {
        sendEmail(email, msg);
    }

    private void sendEmail(String email, String msg){
        System.out.println("notification " + msg + " sent to email : " + email);
        int stockAvailable = stockObservable.getStockCount();
        System.out.println(msg + " = " + stockAvailable);
    }
}
