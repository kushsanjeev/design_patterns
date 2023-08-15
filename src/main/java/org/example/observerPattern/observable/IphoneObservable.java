package org.example.observerPattern.observable;

import org.example.observerPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{

    List<NotificationAlertObserver> notificationAlertObservers = new ArrayList<>();
    int stockCount = 0;
    @Override
    public void addSubscriber(NotificationAlertObserver observer) {
        notificationAlertObservers.add(observer);
    }

    @Override
    public void removeSubscriber(NotificationAlertObserver observer) {
        notificationAlertObservers.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationAlertObserver observer : notificationAlertObservers){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockCountAdded) {
        if(stockCount > 0){
            notifySubscriber();
        }
        stockCount = stockCount + newStockCountAdded;
    }

    @Override
    public int getStockCount() {
        return 0;
    }
}
