import java.util.*;

/**
 * An implementation of Insertion Sort for an ArrayList
 * @author Coy Burke
 */
public class InsertionSort implements SortBehavior {
  
  /**
  * Sorts an ArrayList using insertion sort.
  * @param data The ArrayList to be sorted.
  * @return A sorted ArrayList
  */
  public ArrayList<String> sort(ArrayList<String> data) {
    // referenced https://www.geeksforgeeks.org/insertion-sort/
    for (int i = 0; i < data.size(); i++) {
      String target = data.get(i);
      int j = i-1;
      while(j >= 0 && data.get(j).compareTo(target) > 0) {
        data.set(j+1, data.get(j));
        j = j-1;
      }
      data.set(j+1, target);
    }
    return data;
  }
}