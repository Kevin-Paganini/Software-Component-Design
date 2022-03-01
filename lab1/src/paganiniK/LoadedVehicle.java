package paganiniK;

/**
 * Vehicles that can load stuff
 * @author paganinik
 */
public class LoadedVehicle extends Vehicle implements PlowVehicle {
    private double loadCapacity;
    private double plowWidth;

    /**
     * Constructor
     * @param numWheels
     * @param weight
     * @param name
     * @param loadCapacity
     * @param plowWidth
     */
    public LoadedVehicle(int numWheels, double weight, String name, double loadCapacity, double plowWidth) {
        super(numWheels, weight, name);
        this.loadCapacity = loadCapacity;
        this.plowWidth = plowWidth;
    }


    /**
     * raising the plow
     */
    @Override
    public void raisePlow() {
        System.out.println("Raising the Plow of " + getName());
    }

    /**
     * lowering the plow
     */
    @Override
    public void lowerPlow() {
        System.out.println("Lowering the Plow of " + getName());
    }

    /**
     * Getters and Setters
     *
     */
    @Override
    public double getPlowWidth() {
        return plowWidth;
    }

    @Override
    public void setPlowWidth(double plowWidth) {
        this.plowWidth = plowWidth;
    }

    public void setLoadCapacity(double loadCapacity){
        this.loadCapacity = loadCapacity;
    }
    public double getLoadCapacity(){
        return loadCapacity;
    }
}
