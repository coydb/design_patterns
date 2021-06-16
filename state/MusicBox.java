package state;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * A Music Box that displays various songs in multiple languages
 * @author Coy Burke
 */
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

  /**
   * Plays the song Twinkle, Twinkle Little Star
   * in the currently selected langauge.
   */
  public void pressStarButton() {
    state.pressStarButton();
  }

  /**
   * Plays the song If You're Happy and You Know It
   * in the currently selected language.
   */
  public void pressHappyButton() {
    state.pressHappyButton();
  }

  /**
   * Sets the current state to English
   */
  public void pressEnglishButton() {
    state.pressEnglishButton();
  }

  /**
   * Sets the current state to French
   */
  public void pressFrenchButton() {
    state.pressFrenchButton();
  }

  /**
   * Sets the current state to Spanish
   */
  public void pressSpanishButton() {
    state.pressSpanishButton();
  }

  /**
   * Sets the state of the music box.
   * @param state The state that the music box
   * should be set to.
   */
  public void setState(State state) {
    this.state = state;
  }

  /**
   * Returns the MusicBox's english state
   * @return A State representing the music
   * box's english state.
   */
  public State getEnglishState() {
    return englishState;
  }

  /**
   * Returns the MusicBox's french state
   * @return A State representing the music
   * box's french state.
   */
  public State getFrenchState() {
    return frenchState;
  }

  /**
   * Returns the MusicBox's spanish state
   * @return A State representing the music
   * box's spanish state.
   */
  public State getSpanishState() {
    return spanishState;
  }

  /**
   * Displays a song's title, followed by its lyrics.
   * @param songName The title of the song.
   * @param lyrics An ArrayList containing the song's lyrics as
   * Strings
   */
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