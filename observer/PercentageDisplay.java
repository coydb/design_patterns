package observer;

import java.text.DecimalFormat;
import java.util.HashMap;

/**
 * An observer for the School's poll which prints
 * the votes in a percentage format.
 * @author Coy Burke
 */
public class PercentageDisplay implements Observer {

  private Subject poll;
  private HashMap<String, Integer> votes;
  private int numVotes;

  /**
   * Paramaterized Constructor
   * @param poll A Subject representing the poll to be observed
   */
  public PercentageDisplay(Subject poll) {
    this.poll = poll;
    this.votes = new HashMap<String, Integer>();
    this.numVotes = 0;
    this.poll.registerObserver(this);
  }

  /**
   * Updates the current vote count to match the vote count of the poll,
   * and updates the current number of total votes.
   * @param votes A HashMap representing the new vote count.
   */
  public void update(HashMap<String, Integer> votes) {
    this.votes = votes;
    for (String president : votes.keySet()) {
      numVotes += votes.get(president);
    }
    display();
  }

  /**
   * Displays an ordered list of candidates and their corresponding percentage
   * of the vote count.
   */
  private void display() {
    System.out.println("\nCurrent Percent of Votes:");
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
    // calculate percentage and print
    // referenced: https://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places
    for (int i = 0; i<presidentsArray.length;i++) {
      double percentOfVote = 100*((double)votesArray[i]/(double)numVotes);
      var rounder = new DecimalFormat("#.#");
      System.out.println(presidentsArray[i] + ": "+rounder.format(percentOfVote)+"%");
    }
  }
}