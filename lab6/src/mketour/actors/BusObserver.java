package mketour.actors;

import mketour.CityMap;
import mketour.Taggable;

public class BusObserver implements Observer{
    boolean foundBusChallenge = false;

    /**
     * Updates bus challenge to be shown, once person runs into bus
     * than practically does nothing
     * @param tag
     * @param cityMap
     * @param self
     */
    @Override
    public void update(Taggable tag, CityMap cityMap, Taggable self){
        if (!foundBusChallenge){
            cityMap.updateBusChallenge("Challenge: Find all the letters in BUS\n" +
                    "Goal: Bus\n" +
                    "Found: ***", false);
            CarObserver.setBusChallengeFound(true);
            foundBusChallenge = true;
        }
    }
}
