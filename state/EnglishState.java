package state;

import java.util.ArrayList;

/**
 * An English state for a MusicBox
 * @author Coy Burke
 */
public class EnglishState implements State {
  private MusicBox musicBox;
  private String starTitle = "Twinkle, Twinkle, Little Star";
  private String happyTitle = "If You're Happy and You Know It";
  private String[] starLyrics = 
  {
    "Twinkle, twinkle, little star", 
    "How I wonder what you are",
    "Up above the world so high",
    "Like a diamond in the sky",
    "Twinkle, twinkle, little star",
    "How I wonder what you are"
  };
  private String[] happyLyrics =
  {
    "If you're happy and you know it clap your hands", 
    "If you're happy and you know it clap your hands",
    "If you're happy and you know it and you really want to show it",
    "If you're happy and you know it clap your hands"
  };

  /**
   * Constructs the EnglishState
   * @param box A MusicBox
   */
  public EnglishState(MusicBox box) {
    musicBox = box;
  }

  /**
   * Plays the song Twinkle Twinkle Little Star in English
   */
  public void pressStarButton() {
    ArrayList<String> outLyrics = new ArrayList<String>();
    for(String line : starLyrics) {
      outLyrics.add(line);
    }
    musicBox.playSong(starTitle, outLyrics);
  }

  /**
   * Plays the song If You're Happy and You Know It in 
   * English
   */
  public void pressHappyButton() {
    ArrayList<String> outLyrics = new ArrayList<String>();
    for(String line : happyLyrics) {
      outLyrics.add(line);
    }
    musicBox.playSong(happyTitle, outLyrics);
  }

  /**
   * Displays a message stating that MusicBox is
   * already set to English
   */
  public void pressEnglishButton() {
    System.out.println("You are already in the English mode.");
  }

  /**
   * Sets the MusicBox's state to French
   */
  public void pressFrenchButton() {
    musicBox.setState(musicBox.getFrenchState());
  }

  /**
   * Sets the MusicBox's state to Spanish
   */
  public void pressSpanishButton() {
    musicBox.setState(musicBox.getSpanishState());
  }
}
