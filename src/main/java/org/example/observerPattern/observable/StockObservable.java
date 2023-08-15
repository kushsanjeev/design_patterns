package org.example.observerPattern.observable;

import org.example.observerPattern.observer.NotificationAlertObserver;

public interface StockObservable {
    void addSubscriber(NotificationAlertObserver notificationAlertObserver);

    void removeSubscriber(NotificationAlertObserver notificationAlertObserver);

    void notifySubscriber();

    void setStockCount(int stockCount);

    int getStockCount();
}
