import java.util.HashMap;

public class TallyDisplay implements Observer {

  private Subject poll;
  private HashMap<String, Integer> votes;

  public TallyDisplay(Subject poll) {
    this.poll = poll;
    this.votes = new HashMap<String, Integer>();
    poll.registerObserver(this);
  }

  public void update(HashMap<String, Integer> votes) {
    this.votes = votes;
    display();
  }

  private void display() {
    System.out.println("\nCurrent Tallies:");
    for (String president : votes.keySet()) {
      System.out.println(president + ": "+votes.get(president));
    }
  }
}
