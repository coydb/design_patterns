import java.util.ArrayList;

public abstract class Car {
  private String make;
  private String model;
  protected ArrayList<Accessories> accessories;

  public Car(String make, String model) {
    this.make = make;
    this.model = model;
    this.accessories = new ArrayList<Accessories>();
  }

  public void assemble() {
    addFrame();
    addWheels();
    addEngine();
    addWindows();
    addAccessories();
    displayAccessories();
  }

  protected abstract void addFrame();

  protected abstract void addAccessories();

  protected void addWheels() {
    System.out.println("Adding the Wheels");
  }

  protected void addEngine() {
    System.out.println("Adding a Standard Engine");
  }

  protected void addWindows() {
    System.out.println("Adding Windows");
  }

  protected void displayAccessories() {
    System.out.println("Accessories: ");
    for (Accessories accsessory : accessories) {
        System.out.println("- "+accsessory);
    }
  }
}
