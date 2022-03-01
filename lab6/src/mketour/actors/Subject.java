package mketour.actors;

import mketour.CityMap;
import mketour.Taggable;
import java.util.ArrayList;


/**
 * Subject class to implement subject part of the pattern
 */
public class Subject {

    private ArrayList<Observer> observers = new ArrayList<>();

    public void attachObservers(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(Taggable tag, CityMap cityMap, Taggable self){
        for(int i = 0; i < observers.size(); i++){

                observers.get(i).update(tag, cityMap, self);



        }
    }
}