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
    for ( String president : votes.keySet()) {
      double percentOfVote = 100*(double)votes.get(president)/numVotes;
      var rounder = new DecimalFormat("#.#");
      System.out.println(president + ": "+rounder.format(percentOfVote)+"%");
    }
  }
}
