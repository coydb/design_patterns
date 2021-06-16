package state;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class MusicBox {
  private State englishState;
  private State frenchState;
  private State spanishState;
  private State state;

  public MusicBox() {
    englishState = new EnglishState(this);
    frenchState = new FrenchState(this);
    spanishState = new SpanishState(this);
    state = englishState;

  }

  public void pressStarButton() {
    state.pressStarButton();
  }

  public void pressHappyButton() {
    state.pressHappyButton();
  }

  public void pressEnglishButton() {
    state.pressEnglishButton();
  }

  public void pressFrenchButton() {
    state.pressFrenchButton();
  }

  public void pressSpanishButton() {
    state.pressSpanishButton();
  }

  public void setState(State state) {
    this.state = state;
  }

  public State getEnglishState() {
    return englishState;
  }

  public State getFrenchState() {
    return frenchState;
  }

  public State getSpanishState() {
    return spanishState;
  }

  public void playSong(String songName, ArrayList<String> lyrics) {
    System.out.println("Playing: "+songName);
    for(String currentLine : lyrics) {
      try {
        TimeUnit.MILLISECONDS.sleep(1000);
      } catch (Exception e) {
        e.printStackTrace();
      }
      System.out.println(currentLine);
    }
  }
}