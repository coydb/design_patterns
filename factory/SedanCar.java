package factory;

/**
 * A sedan Car
 * @author Coy Burke
 */
public class SedanCar extends Car {

  /**
   * Paramaterized Constructor
   * @param make A String representing the make of the car
   * @param model A String representing the model of the car
   */
  public SedanCar(String make, String model) {
    super(make, model);
  }

  /**
   * Adds the frame, and prints a confirmation message
   */
  protected void addFrame() {
    System.out.println("Adding a three part frame");
  }

  /**
   * Adds the appropriate accessories for a sedan
   */
  protected void addAccessories() {
    super.accessories.add(Accessories.FLOOR_MATTS);
    super.accessories.add(Accessories.PHONE_CHARGER);
    super.accessories.add(Accessories.BACK_UP_CAMERA);
    super.accessories.add(Accessories.EXTRA_CUP_HOLDERS);
    super.accessories.add(Accessories.HEATED_SEATS);
  }
}
