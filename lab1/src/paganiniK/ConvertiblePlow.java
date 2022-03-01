package paganiniK;

/**
 * Convertible with a plow extends GeneralConvertible
 * and implements the plow interface
 * @author paganinik
 */
public class ConvertiblePlow extends GeneralConvertible implements PlowVehicle {

    private double plowWidth;

    /**
     * Constructor
     * @param numWheels
     * @param weight
     * @param name
     * @param plowWidth
     */
    public ConvertiblePlow(int numWheels, double weight, String name, double plowWidth) {
        super(numWheels, weight, name);
        this.plowWidth = plowWidth;
    }

    /**
     * Raising the plow
     */
    @Override
    public void raisePlow() {
        System.out.println("Raising the plow of " + getName());
    }

    /**
     * lowering th plow
     */
    @Override
    public void lowerPlow() {
        System.out.println("lowering the plow of " + getName());
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

}
