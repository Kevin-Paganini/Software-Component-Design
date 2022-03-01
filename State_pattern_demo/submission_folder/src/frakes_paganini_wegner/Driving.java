package frakes_paganini_wegner;

/**
 * Driving state for the vehicle
 */
public class Driving extends State{


    /**
     * Move the vehicle
     */
    @Override
    public void move() {
        double x = vehicle.getX();
        double y = vehicle.getY();

        if(y > 225){
            vehicle.setY(y - 10);
        }

        if(x < 250){
            vehicle.setX(x + 10);
        }


        changeState(x, y);


    }

    /**
     * Changes state from driving to next state
     * @param x
     * @param y
     */
    @Override
    public void changeState(double x, double y) {
        if(x >= 250 && y <= 225){
            vehicle.changeState(nextState);
        }
    }
}
