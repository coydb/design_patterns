package decorator;

import java.util.Random;

/**
 *A password decorator that randomly adds special characters to the password.
 * @author Coy Burke
 */
public class SpecialChars extends PasswordDecorator {
  protected Password passwordBeginning;

    /**
   * Paramaterized Constructor
   * @param passwordBeginning A Password representing the original, 
   * undecorated password.
   */
  public SpecialChars(Password passwordBeginning) {
    this.passwordBeginning = passwordBeginning;
  }

    /**
   * Access the decorated password (special characters added).
   * @return A String representing the decorated password.
   */
  public String getPassword() {
    char[] specialCharacters = {'*', '!', '%', '+', '.', '{', '}'};
    Random rng = new Random();
    StringBuilder newPassword = new StringBuilder(passwordBeginning.getPassword());
    for (int i = 0; i<newPassword.length();i++) {
      if(rng.nextInt(100) < 33) {
        newPassword.insert(i+1, specialCharacters[rng.nextInt(specialCharacters.length)]);
      }
    }
    return newPassword.toString();
  }
}