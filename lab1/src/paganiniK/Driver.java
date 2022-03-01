package paganiniK;

/**
 * Class to test the program
 */
public class Driver {

    /**
     * You already know
     * @param args
     */
    public static void main(String[] args) {

        //Vehicle vehicle = new Vehicle();

        System.out.println("Trying all functionality of the Car: \n");
        Car car = new Car(4, 4000, "CoolCar");
        car.start();
        car.stop();
        car.goBackward(10, 2);
        car.goForward(10, 2);
        System.out.println("Car weight: " + car.getWeight());
        System.out.println("Car number of wheels: " + car.getNumWheels());
        //car.raiseRoof();
        //car.lowerRoof();
        //car.raisePlow();
        //car.lowerPlow();
        //car.raiseLoad();
        //car.lowerLoad();
        System.out.println("\n");

        System.out.println("Trying all functionality of the Convertible with a plow: \n");
        ConvertiblePlow convertibleWithPlow = new ConvertiblePlow(4, 2500, "Convertible Plower 3000", 100);
        convertibleWithPlow.start();
        convertibleWithPlow.stop();
        convertibleWithPlow.goBackward(10, 2);
        convertibleWithPlow.goForward(10, 2);
        System.out.println("Convertible with Plow weight:  " + convertibleWithPlow.getWeight());
        System.out.println("Convertible with Plow number of wheels: " + convertibleWithPlow.getNumWheels());
        convertibleWithPlow.raisePlow();
        convertibleWithPlow.lowerPlow();
        //convertibleWithPlow.raiseLoad();
        //convertibleWithPlow.lowerLoad();
        System.out.println(convertibleWithPlow.getName() + "'s plow is " + convertibleWithPlow.getPlowWidth() + " inches wide");
        convertibleWithPlow.raiseRoof();
        convertibleWithPlow.lowerRoof();
        System.out.println("\n");

        System.out.println("Trying all functionality of the Convertible: \n");
        GeneralConvertible convertible = new GeneralConvertible(4, 2250, "Convertible converter");
        convertible.start();
        convertible.stop();
        convertible.goBackward(10, 2);
        convertible.goForward(10, 2);
        System.out.println("Regular Convertible weight: " + car.getWeight());
        System.out.println("Regular Convertible number of Wheels: " + car.getNumWheels());
        convertible.raiseRoof();
        convertible.lowerRoof();
        //convertible.raisePlow();
        //convertible.lowerPlow();
        //convertible.raiseLoad();
        //convertible.lowerLoad();
        System.out.println("\n");

        System.out.println("Trying all functionality of the Pickup: \n");
        Pickup pickup = new Pickup(6, 7000, "Picker the Pickup", 5, 100);
        pickup.start();
        pickup.stop();
        pickup.goBackward(10, 2);
        pickup.goForward(10, 2);
        System.out.println("Pickup weight: " + pickup.getWeight());
        System.out.println("Pickup number of Wheels: " + pickup.getNumWheels());
        System.out.println("Pickup load capacity: " + pickup.getLoadCapacity());
        pickup.raisePlow();
        pickup.lowerPlow();
        System.out.println(pickup.getName() + "'s plow is " + pickup.getPlowWidth() + " inches wide");
        //pickup.raiseRoof();
        //pickup.lowerRoof();
        //pickup.raiseLoad();
        //pickup.lowerLoad();
        System.out.println("\n");

        System.out.println("Trying all functionality of the DumpTruck: \n");
        DumpTruck dumpTruck = new DumpTruck(10, 10000, "Dumper the Dumptruck", 10.4, 100);
        dumpTruck.start();
        dumpTruck.stop();
        dumpTruck.goBackward(10, 2);
        dumpTruck.goForward(10, 2);
        System.out.println("Dumptruck weight: " + dumpTruck.getWeight());
        System.out.println("Dumptruck number of wheels: " + dumpTruck.getNumWheels());
        System.out.println("Dumptruck loadcapacity: " + dumpTruck.getLoadCapacity());
        dumpTruck.raiseLoad();
        dumpTruck.lowerLoad();
        dumpTruck.raisePlow();
        dumpTruck.lowerPlow();
        System.out.println(dumpTruck.getName() + "'s plow is " + dumpTruck.getPlowWidth() + " inches wide");
        //dumpTruck.raiseRoof();
        //dumpTruck.lowerRoof();
        System.out.println("\n");
    }
}
