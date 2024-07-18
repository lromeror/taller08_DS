/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS VIVOBOOK PRO
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String offer;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void setOffer(String offer) {
        this.offer = offer;
        notifyAllObservers();
    }

    public String getOffer() {
        return offer;
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
