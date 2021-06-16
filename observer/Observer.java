package observer;

import java.util.HashMap;

/**
 * An interface for an Observer
 * @author Coy Burke
 */
public interface Observer {
  public void update(HashMap<String, Integer> votes);
}