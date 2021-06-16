package observer;

/**
 * An interface for a Subject
 * @author Coy Burke
 */
public interface Subject {
  public void registerObserver(Observer observer);
  public void removeObserver(Observer observer);
  public void notifyObservers();
}