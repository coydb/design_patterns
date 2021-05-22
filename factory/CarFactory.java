/**
 * A factory for creating Cars
 * @author Coy Burke
 */
public class CarFactory {

  /**
   * Creates and assembles the specified type of car
   * @param type A String representing the type of car
   * @param make A String representing the make of the car
   * @param model A String representing the model of the car
   * @return A Car with specifications matching the input
   * paramaters.
   */
  public static Car createCar(String type, String make, String model) {
    Car car = null;
    System.out.println("Creating a " + make + " " + model);

    if (type.equalsIgnoreCase(CarType.SMALL.toString()))
      car = new SmallCar(make, model);
    if (type.equalsIgnoreCase(CarType.SEDAN.toString()))
      car = new SedanCar(make, model);
    if (type.equalsIgnoreCase(CarType.LUXURY.toString()))
      car = new LuxuryCar(make, model);

    car.assemble();
    return car;
  }
}