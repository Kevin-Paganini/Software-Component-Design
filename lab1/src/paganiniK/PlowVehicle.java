package paganiniK;

/**
 * Interface that all vehicles with plows use
 */
public interface PlowVehicle {
    void raisePlow();

    void lowerPlow();

    double getPlowWidth();

    void setPlowWidth(double plowWidth);

}
