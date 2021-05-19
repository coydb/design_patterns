import java.util.Random;

public class SpecialChars extends PasswordDecorator {
  protected Password passwordBeginning;

  public SpecialChars(Password passwordBeginning) {
    this.passwordBeginning = passwordBeginning;
  }
  public String getPassword() {
    char[] specialCharacters = {'*', '!', '%', '+', '.', '{', '}'};
    Random rng = new Random();
    StringBuilder newPassword = new StringBuilder(passwordBeginning.getPassword());
    for (int i = 0; i<newPassword.length();i++) {
      if(rng.nextInt(100) < 33) {
        newPassword.insert(i, specialCharacters[rng.nextInt(specialCharacters.length)]);
      }
    }
    return newPassword.toString();
  }
}
