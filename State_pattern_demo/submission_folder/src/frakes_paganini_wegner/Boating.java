package frakes_paganini_wegner;

/**
 * Boating state for the vehicle
 */
public class Boating extends State{


    /**
     * Move the vehicle
     */
    @Override
    public void move() {
        double x = vehicle.getX();
        double y = vehicle.getY();



        if(x < 550){
            vehicle.setX(x + 4);
        }
        changeState(x, y);
    }

    /**
     * Changes state from boating to next state
     * @param x
     * @param y
     */
    @Override
    public void changeState(double x, double y) {
        if(x >= 550){
            vehicle.changeState(nextState);
        }
    }
}
