package paganiniK;

/**
 * Abstract class that every other class inherits from
 * @author paganinik
 */
public abstract class Vehicle {
    private int numWheels;
    private double weight;
    private String name;

    /**
     * Cool Constructor for vehicles
     * @param numWheels
     * @param weight
     * @param name
     */
    public Vehicle(int numWheels, double weight, String name){
        this.numWheels = numWheels;
        this.weight = weight;
        this.name = name;

    }

    /**
     * starts car
     */
    public void start(){
        System.out.println("Time to drive " + name);
    }

    /**
     * stops car
     */
    public void stop(){
        System.out.println("Done driving " + name);
    }

    /**
     * car go backward
     * @param speed
     * @param accel
     */
    public void goBackward(double speed, double accel){
        System.out.println("BEEP, BEEP, " + name + " is going backwards!");
    }

    /**
     * Car go forward
     * @param speed
     * @param accel
     */
    public void goForward(double speed, double accel){
        System.out.println("BEEP, BEEP, " + name +  " is going forwards");
    }

    /*
     *************************************************************************************\\
     *                                   GETTERS AND SETTERS                               *
     **************************************************************************************\
     */
    public void setNumWheels(int numWheels){
        this.numWheels = numWheels;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getNumWheels(){
        return numWheels;
    }

    public double getWeight() {
        return weight;
    }

    public String getName(){
        return name;
    }
}
