package frakes_paganini_wegner;

public abstract class State {

    protected Vehicle vehicle;
    protected State nextState = null;


    /**
     * Set vehicle to enact states on
     * @param vehicle
     */
    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;

    }

    /**
     * Set the next state you want
     * @param state
     */
    public void setNextState(State state){
        this.nextState = state;
    }

    /**
     * Every state needs a move method
     */
    public abstract void move();

    /**
     * Change from one state to the next depending on the X, Y position
     * @param x
     * @param y
     */
    public abstract void changeState(double x, double y);


}
