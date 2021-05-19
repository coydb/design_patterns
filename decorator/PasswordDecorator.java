/**
 * An abstract class for decorating passwords.
 * @author Coy Burke
 */
public abstract class PasswordDecorator extends Password {
  protected Password passwordBeginning;

  public abstract String getPassword();
}
