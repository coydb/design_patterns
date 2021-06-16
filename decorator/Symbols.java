package decorator;

/**
 * A password decorator that replaces certain letters with symbols.
 * @author Coy Burke
 */
public class Symbols extends PasswordDecorator {
  protected Password passwordBeginning;

  /**
   * Paramaterized Constructor
   * @param passwordBeginning A Password representing the original, 
   * undecorated password.
   */
  public Symbols(Password passwordBeginning) {
    this.passwordBeginning = passwordBeginning;
  }

  /**
   * Access the decorated password (letters replaced with symbols).
   * @return A String representing the decorated password.
   */
  public String getPassword() {
    String[] letters = {"a", "b", "e", "g", "i", "o", "s", "t"};
    String[] symbols = {"@", "8", "3", "9", "!", "0", "\\$", "7"};
    String newPassword = passwordBeginning.getPassword();
    for (int i = 0; i<letters.length;i++) {
      newPassword = newPassword.replaceAll(letters[i], symbols[i]);
    }
    return newPassword;
  }
}