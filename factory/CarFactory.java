public class CarFactory {
  public static Car createCar(String type, String make, String model) {
    System.out.println("Creating a " + make + " " + model);
    Car car = null;
    if (type.equalsIgnoreCase(CarType.SMALL.toString())) {
      car = new SmallCar(make, model);
    }
    if (type.equalsIgnoreCase(CarType.SEDAN.toString())) {
      car = new SedanCar(make, model);
    }
    if (type.equalsIgnoreCase(CarType.LUXURY.toString())) {
      car = new LuxuryCar(make, model);
    }
    car.assemble();
    return car;
  }
}
