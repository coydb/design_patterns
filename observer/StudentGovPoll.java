package observer;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A Student Government Poll with functionality for managing
 * candidates and vote count, and providing updates to 
 * observers.
 * @author Coy Burke
 */
public class StudentGovPoll implements Subject {

  private ArrayList<Observer> observers;
  private HashMap<String, Integer> votes;
  private String school;
  private int numUpdates;

  /**
   * Paramaterized Constructor
   * @param school A String representing the name of the poll.
   */
  public StudentGovPoll(String school) {
    this.observers = new ArrayList<Observer>();
    this.votes = new HashMap<String, Integer>();
    this.school = school;
    this.numUpdates = 0;
  }

  /**
   * Adds a new observer to the internal list of observers.
   * @param observer The Observer to be added.
   */
  public void registerObserver(Observer observer) {
    if (!observers.contains(observer)) {
      observers.add(observer);
    }
  }

  /**
   * Removes an observer form the internal list of observers.
   * @param observer The Observer to be removed.
   */
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  /**
   * Sends the latest poll information to all registered observers.
   */
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(votes);
    }
  }

  /**
   * Adds a name to the internal list of candidates.
   * @param president A String representing the name of the candidate to add.
   */
  public void addCandidate(String president) {
    if (!votes.containsKey(president)) {
      votes.put(president, 0);
    }
  }

  /**
   * Adds votes to the total number of votes for a given candidate,
   * and notifies observers after 4 updates.
   * @param president A String representing the candidate to update.
   * @param num an int representing the number of votes to add to the candidate's total.
   */
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

  /**
   * Returns the name of the school.
   * @return A String representing the name of the school.
   */
  public String getSchool() {
    return this.school;
  }
}