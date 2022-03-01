package paganiniK;

/**
 * Regular convertible without plow extends Car
 * @author paganinik
 */
public class GeneralConvertible extends Car{

    /**
     * Constructor
     * @param numWheels
     * @param weight
     * @param name
     */
    public GeneralConvertible(int numWheels, double weight, String name) {
        super(numWheels, weight, name);
    }

    /**
     * raising the roof
     */
    public void raiseRoof(){
        System.out.println("Raising the roof of " + getName() + " woop woop.");
    }

    /**
     * lowering the roof
     */
    public void lowerRoof(){
        System.out.println("Lowering the roof of " + getName() + " :(");
    }


}
