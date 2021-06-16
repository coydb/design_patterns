package strategy;

import java.util.*;

/**
 * An implementation of Bubble Sort for an ArrayList
 * @author Coy Burke
 */
public class BubbleSort implements SortBehavior {

  /**
  * Sorts an ArrayList using bubble sort.
  * @param data The ArrayList to be sorted.
  * @return A sorted ArrayList
  */
  public ArrayList<String> sort(ArrayList<String> data) {
    // referenced https://www.geeksforgeeks.org/bubble-sort/
    for (int i = 0; i < data.size(); i++){
      for (int j = 0; j < data.size()-1; j++){
        if (data.get(j).compareTo(data.get(j+1)) > 0){
          String temp = data.get(j);
          data.set(j, data.get(j+1)); 
          data.set(j+1, temp);
        }
      }
    }
    return data;
  }
}