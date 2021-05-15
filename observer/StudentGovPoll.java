import java.util.ArrayList;
import java.util.HashMap;

public class StudentGovPoll implements Subject {

  private ArrayList<Observer> observers;
  private HashMap<String, Integer> votes;
  private String school;
  private int numUpdates;

  public StudentGovPoll(String school) {
    this.observers = new ArrayList<Observer>();
    this.votes = new HashMap<String, Integer>();
    this.school = school;
    this.numUpdates = 0;
  }

  public void registerObserver(Observer observer) {
    if (!observers.contains(observer)) {
    observers.add(observer);
    }
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(votes);
    }
  }

  public void addCandidate(String president) {
    if (!votes.containsKey(president)){
      votes.put(president, 0);
    }
  }

  public void enterVotes(String president, int num) {
    int updatedVoteCount = votes.get(president)+num;
    votes.put(president, updatedVoteCount);
    if (numUpdates < 3) {
      numUpdates += 1;
    }
    else {
      numUpdates = 0;
      this.notifyObservers();
    }
  }

  public String getSchool() {
    return this.school;
  }
}
