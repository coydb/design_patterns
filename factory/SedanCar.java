import java.util.ArrayList;

public class SedanCar extends Car {
  protected ArrayList<Accessories> accessories;

  public SedanCar(String make, String model) {
    super(make, model);
  }

  protected void addFrame() {
    System.out.println("Adding a three part frame");
  }

  protected void addAccessories() {
    super.accessories.add(Accessories.FLOOR_MATTS);
    super.accessories.add(Accessories.PHONE_CHARGER);
    super.accessories.add(Accessories.BACK_UP_CAMERA);
    super.accessories.add(Accessories.EXTRA_CUP_HOLDERS);
    super.accessories.add(Accessories.HEATED_SEATS);
  }
}
