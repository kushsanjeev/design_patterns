package org.example.observerPattern.observable;

import org.example.observerPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseObservable implements StockObservable{

    public abstract void notifySubscriber();

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
    public void setStockCount(int newStockCountAdded) {
        stockCount = stockCount + newStockCountAdded;
        if(stockCount > 0){
            notifySubscriber();
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
