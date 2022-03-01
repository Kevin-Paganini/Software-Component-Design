package mketour.actors;

import mketour.CityMap;
import mketour.Taggable;

public class MuseumObserver implements Observer{
    @Override
    public void update(Taggable tag, CityMap cityMap, Taggable self) {

            cityMap.updateMuseumChallenge();



    }
}
