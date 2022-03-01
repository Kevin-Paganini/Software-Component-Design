package mketour.actors;

import mketour.CityMap;
import mketour.Taggable;

public class CarObserver implements Observer {

    private String challenge = "Challenge: Find all the letters in MSOE\n" +
            "Goal: MSOE\n" +
            "Found: ";
    private String busChallenge = "Challenge: Find all the letters in BUS\n" +
            "Goal: Bus\n" +
            "Found: ";
    private static boolean busChallengeFound = false;

    public static void setBusChallengeFound(boolean flag){
        busChallengeFound = flag;
    }

    /**
     * Updates the plate challenge, when person runs into car
     * Updates Bus challenge once it is found and runs into cars
     *
     * @param tag
     * @param cityMap
     * @param self
     */
    @Override
    public void update(Taggable tag, CityMap cityMap, Taggable self) {
        boolean carChallengeDone = false;
        boolean busChallengeDone = false;


        Car car = (Car) self;
        String search = car.getCarSearch().search(car.getName());


        if (busChallengeFound){
            String busSearch = car.getBusSearch().search(car.getName());
            StringBuilder sb1 = new StringBuilder();
            sb1.append(busChallenge);
            sb1.append(busSearch);
            if (busSearch.equals("BUS")){
                busChallengeDone = true;
            }
            cityMap.updateBusChallenge(sb1.toString(), busChallengeDone);

        }
        StringBuilder sb = new StringBuilder();
        sb.append(challenge);
        sb.append(search);
        sb.append("\n\n");
        if (search.equals("MSOE")){
            carChallengeDone = true;
        }
        cityMap.updatePlateChallenge(sb.toString(), carChallengeDone);
    }
}

