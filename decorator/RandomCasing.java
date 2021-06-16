package decorator;

import java.util.Random;

/**
 *A password decorator that applies random casing to the password.
 * @author Coy Burke
 */
public class RandomCasing extends PasswordDecorator {
  protected Password passwordBeginning;

  /**
   * Paramaterized Constructor
   * @param passwordBeginning A Password representing the original, 
   * undecorated password.
   */
  public RandomCasing(Password passwordBeginning) {
    this.passwordBeginning = passwordBeginning;
  }

  /**
   * Access the decorated password (random casing applied).
   * @return A String representing the decorated password.
   */
  public String getPassword() {
    Random random = new Random();
    StringBuilder newPassword = new StringBuilder(passwordBeginning.getPassword());
    for (int i = 0;i<newPassword.length();i++) {
      if(random.nextBoolean()) {
        newPassword.setCharAt(i,Character.toUpperCase(newPassword.charAt(i)));
      }
      else {
        newPassword.setCharAt(i,Character.toLowerCase(newPassword.charAt(i)));
      }
    }
    return newPassword.toString();
  }
}
