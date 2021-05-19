import java.util.Random;

public class RandomCasing extends PasswordDecorator {
  protected Password passwordBeginning;

  public RandomCasing(Password passwordBeginning) {
    this.passwordBeginning = passwordBeginning;
  }
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
