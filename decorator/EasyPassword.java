import java.util.Random;

public class EasyPassword extends Password {
  protected String password;

  public EasyPassword(String phrase) {
    Random rng = new Random();
    this.password = phrase.replaceAll("\\s", "")+rng.nextInt(101);
  }

  public String getPassword() {
    return this.password;
  }
}
