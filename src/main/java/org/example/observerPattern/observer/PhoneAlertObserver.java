package org.example.observerPattern.observer;

import org.example.observerPattern.observable.StockObservable;

public class PhoneAlertObserver implements NotificationAlertObserver{
    StockObservable stockObservable;
    String mobile;

    public PhoneAlertObserver(String mobile, StockObservable observable){
        this.stockObservable = observable;
        this.mobile = mobile;
    }
    @Override
    public void update(String msg) {
        sendEmail(mobile, msg);
    }

    private void sendEmail(String mobile, String msg){
        System.out.println("message " + msg + " sent to mobile no. : " + mobile);
        int stockAvailable = stockObservable.getStockCount();
        System.out.println(msg + " = " + stockAvailable);
    }
}
