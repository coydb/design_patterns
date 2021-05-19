
public class Symbols extends PasswordDecorator {
  protected Password passwordBeginning;

  public Symbols(Password passwordBeginning) {
    this.passwordBeginning = passwordBeginning;
  }
  public String getPassword() {
    String[] originalLetters = {"a", "b", "e", "g", "i", "o", "s", "t"};
    String[] replacementLetters = {"@", "8", "3", "9", "!", "0", "\\$", "7"};
    String newPassword = passwordBeginning.getPassword();
    for (int i = 0; i<originalLetters.length;i++) {
      newPassword = newPassword.replaceAll(originalLetters[i], replacementLetters[i]);
    }
    return newPassword;
  }
}
