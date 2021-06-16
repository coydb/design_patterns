package observer;

import java.util.HashMap;

/**
 * An observer for the School's poll which prints
 * the votes in a tally format.
 * @author Coy Burke
 */
public class TallyDisplay implements Observer {

  private Subject poll;
  private HashMap<String, Integer> votes;

  /**
   * Paramaterized Constructor
   * @param poll A Subject representing the poll to be observed
   */
  public TallyDisplay(Subject poll) {
    this.poll = poll;
    this.votes = new HashMap<String, Integer>();
    this.poll.registerObserver(this);
  }

  /**
   * Updates the current vote count to match the vote count of the poll.
   * @param votes A HashMap representing the new vote count.
   */
  public void update(HashMap<String, Integer> votes) {
    this.votes = votes;
    display();
  }

  /**
   * Displays an ordered list of candidates and their corresponding vote count.
   */
  private void display() {
    System.out.println("\nCurrent Tallies:");
    // copy HashMap into name and votes arrays for sorting
    String[] presidentsArray = new String[votes.size()];
    int[] votesArray = new int[votes.size()];
    int index = 0;
    for (String president : votes.keySet()) {
      presidentsArray[index] = president;
      votesArray[index] = votes.get(president);
      index++;
    }
    // sort vote array, and make corresponding swaps in 
    // name array
    for (int i = 0; i<presidentsArray.length;i++) {
      int target = votesArray[i];
      String copy = presidentsArray[i];
      int j = i-1;
      while (j >= 0 && votesArray[j] < target) {
        votesArray[j+1] = votesArray[j];
        presidentsArray[j+1] = presidentsArray[j];
        j = j-1;
      }
      votesArray[j+1] = target;
      presidentsArray[j+1] = copy;
    }
    // print sorted values
    for (int i = 0; i<presidentsArray.length;i++) {
      System.out.println(presidentsArray[i]+": "+votesArray[i]);
    }
  }
}