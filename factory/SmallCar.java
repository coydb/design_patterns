import java.util.ArrayList;

public class SmallCar extends Car {
  protected ArrayList<Accessories> accessories;

  public SmallCar(String make, String model) {
    super(make, model);
  }

  protected void addFrame() {
    System.out.println("Adding a small frame");
  }

  protected void addAccessories() {
    super.accessories.add(Accessories.FLOOR_MATTS);
    super.accessories.add(Accessories.PHONE_CHARGER);
  }
  
}
