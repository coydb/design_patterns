import java.util.ArrayList;

public class LuxuryCar extends Car {
  protected ArrayList<Accessories> accessories;

  public LuxuryCar(String make, String model) {
    super(make, model);
  }

  protected void addFrame() {
    System.out.println("Adding a beautiful frame");
  }

  @Override
  protected void addEngine() {
    System.out.println("Adding a Supped Up Engine");
  }

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
