package frakes_paganini_wegner;

/**
 * Flying state of the vehicle
 */
public class Flying extends State {
  // To determine if to go up or down
  private boolean goingUp = true;

  /**
   * Move the airplane
   */
  @Override
  public void move() {
    double x = vehicle.getX();
    double y = vehicle.getY();

    if(y > 0 && goingUp){
      vehicle.setY(y - 10);
    }
    else if(y <10 && goingUp){
      vehicle.setY(y + 10);
      goingUp = false;
    }
    else {
      vehicle.setY(y + 10);
    }



    if(x > 10){
      vehicle.setX(x - 10);
    }

    changeState(x, y);


  }

  /**
   * Changes state from flying to next state
   * @param x
   * @param y
   */
  @Override
  public void changeState(double x, double y) {
    if(x <= 10 && y <= 350){
      goingUp = true;
      vehicle.changeState(nextState);
    }
  }
}
