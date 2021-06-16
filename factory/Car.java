package factory;

import java.util.ArrayList;

/**
 * An abstract class for a Car
 * @author Coy Burke
 */
public abstract class Car {
  private String make;
  private String model;
  protected ArrayList<Accessories> accessories;

  /**
   * Paramaterized Constructor
   * @param make A String representing the make of the car
   * @param model A String representing the model of the car
   */
  public Car(String make, String model) {
    this.make = make;
    this.model = model;
    this.accessories = new ArrayList<Accessories>();
  }

  /**
   * Assembles the car, and displays its accessories
   */
  public void assemble() {
    addFrame();
    addWheels();
    addEngine();
    addWindows();
    addAccessories();
    displayAccessories();
  }

  /**
   * Abstract class for adding the frame
   */
  protected abstract void addFrame();

  /**
   * Abstract class for adding the accessories
   */
  protected abstract void addAccessories();

  /**
   * Adds the wheels, and prints a confirmation message
   */
  protected void addWheels() {
    System.out.println("Adding the Wheels");
  }

  /**
   * Adds the engine, and prints a confirmation message
   */
  protected void addEngine() {
    System.out.println("Adding a Standard Engine");
  }

  /**
   * Adds the windows, and prints a confirmation message
   */
  protected void addWindows() {
    System.out.println("Adding Windows");
  }

  /**
   * Lists all accessories that the car has
   */
  protected void displayAccessories() {
    System.out.println("Accessories: ");
    for (Accessories accsessory : accessories) {
        System.out.println("- "+accsessory);
    }
  }
}
