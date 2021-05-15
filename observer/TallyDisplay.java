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
    // print sorted values
    for (int i = 0; i<presidentsArray.length;i++) {
      System.out.println(presidentsArray[i]+": "+votesArray[i]);
    }
  }
}
