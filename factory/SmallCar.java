import java.util.ArrayList;

/**
 * A small Car
 * @author Coy Burke
 */
public class SmallCar extends Car {
  protected ArrayList<Accessories> accessories;

  /**
   * Paramaterized Constructor
   * @param make A String representing the make of the car
   * @param model A String representing the model of the car
   */
  public SmallCar(String make, String model) {
    super(make, model);
  }

  /**
   * Adds the frame, and prints a confirmation message
   */
  protected void addFrame() {
    System.out.println("Adding a small frame");
  }

  /**
   * Adds the appropriate accessories for a small car
   */
  protected void addAccessories() {
    super.accessories.add(Accessories.FLOOR_MATTS);
    super.accessories.add(Accessories.PHONE_CHARGER);
  }
}
