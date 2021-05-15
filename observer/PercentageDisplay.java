import java.text.DecimalFormat;
import java.util.HashMap;

public class PercentageDisplay implements Observer {

  private Subject poll;
  private HashMap<String, Integer> votes;
  private int numVotes;

  public PercentageDisplay(Subject poll) {
      this.poll = poll;
      this.votes = new HashMap<String, Integer>();
      this.numVotes = 0;
      poll.registerObserver(this);
  }

  public void update(HashMap<String, Integer> votes) {
    this.votes = votes;
    for (String president : votes.keySet()) {
      numVotes += votes.get(president);
    }
    display();
  }

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
       while(j >= 0 && votesArray[j] < target) {
         votesArray[j+1] = votesArray[j];
         presidentsArray[j+1] = presidentsArray[j];
         j = j-1;
       }
       votesArray[j+1] = target;
       presidentsArray[j+1] = copy;
     }
     // calculate percentage and print
     for (int i = 0; i<presidentsArray.length;i++) {
      double percentOfVote = 100*((double)votesArray[i]/numVotes);
      var rounder = new DecimalFormat("#.#");
      System.out.println(presidentsArray[i] + ": "+rounder.format(percentOfVote)+"%");
    }
  }
}
