/**
 * A luxury Car
 * @author Coy Burke
 */
public class LuxuryCar extends Car {
  
  /**
   * Paramaterized Constructor
   * @param make A String representing the make of the car
   * @param model A String representing the model of the car
   */
  public LuxuryCar(String make, String model) {
    super(make, model);
  }

  /**
   * Adds the frame, and prints a confirmation message
   */
  protected void addFrame() {
    System.out.println("Adding a beautiful frame");
  }

  /**
   * Adds the engine, and prints a confirmation message
   */
  @Override
  protected void addEngine() {
    System.out.println("Adding a Supped Up Engine");
  }

  /**
   * Adds the appropriate accessories for a luxury car
   */
  protected void addAccessories() {
    super.accessories.add(Accessories.FLOOR_MATTS);
    super.accessories.add(Accessories.PHONE_CHARGER);
    super.accessories.add(Accessories.BACK_UP_CAMERA);
    super.accessories.add(Accessories.EXTRA_CUP_HOLDERS);
    super.accessories.add(Accessories.HEATED_SEATS);
    super.accessories.add(Accessories.SPORTS_SEATS);
    super.accessories.add(Accessories.WINDOW_TINT);
    super.accessories.add(Accessories.HIGH_END_SOUND);
    super.accessories.add(Accessories.TRUNK_ORGANIZER);
    super.accessories.add(Accessories.BLUE_TOOTH);
  }
}
