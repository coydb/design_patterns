package decorator;

import java.util.Random;

/**
 * An extension of the Password Class
 * @author Coy Burke
 */
public class EasyPassword extends Password {
  protected String password;

  /**
   * Paramaterized Constructor
   * @param phrase A String representing the phrase that the password is based on.
   */
  public EasyPassword(String phrase) {
    Random rng = new Random();
    this.password = phrase.replaceAll("\\s", "")+rng.nextInt(101);
  }

  /**
   * Access the currently stored password.
   * @return A String representing the current password. 
   */
  public String getPassword() {
    return this.password;
  }
}
