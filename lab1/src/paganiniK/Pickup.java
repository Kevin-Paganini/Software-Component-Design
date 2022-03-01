package paganiniK;

/**
 * Pickup truck class that extends loadedVehicle
 * @author paganinik
 */
public class Pickup extends LoadedVehicle {

    /**
     * Constructor
     * @param numWheels
     * @param weight
     * @param name
     * @param loadCapacity
     * @param plowWidth
     */
    public Pickup(int numWheels, double weight, String name, double loadCapacity, double plowWidth) {
        super(numWheels, weight, name, loadCapacity, plowWidth);
    }


}
