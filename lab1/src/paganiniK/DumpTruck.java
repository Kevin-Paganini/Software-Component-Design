package paganiniK;

/**
 * Dumptruck class that extends the loaded vehicle class
 * @author paganinik
 */
public class DumpTruck extends LoadedVehicle{
    /**
     * Constructor
     * @param numWheels
     * @param weight
     * @param name
     * @param loadCapacity
     * @param plowWidth
     */
    public DumpTruck(int numWheels, double weight, String name, double loadCapacity, double plowWidth) {
        super(numWheels, weight, name, loadCapacity, plowWidth);
    }

    /**
     * Raise the load
     */
    public void raiseLoad(){
        System.out.println("raising the load of " + getName());
    }

    /**
     * lower the load
     */
    public void lowerLoad(){
        System.out.println("lowering the load of " + getName());
    }

}
