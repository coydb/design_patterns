package state;

import java.util.ArrayList;

/**
 * A French state for a MusicBox
 * @author Coy Burke
 */
public class FrenchState implements State {
  private MusicBox musicBox;
  private String starTitle = "Brille, Brille, Petite Etoile";
  private String happyTitle = "Si Tu Aimes le Soleil";
  private String[] starLyrics =
  {
    "Brille, brille, petite etoile",
    "Je me demande vraiment ce que tue es",
    "Au-dessus du monde si haut",
    "Comme un diamant dans le ciel",
    "Brille, brille, petite etoile",
    "Je me demande vraiment ce que tu es"
  };
  private String[] happyLyrics = 
  {
    "Si tu aimes le soleil frappe des mains",
    "Si tu aimes le soleil frappe des mains",
    "Si tu aimes le soleil le printemps que se reveille",
    "Si tu aimes le soleil frappe des mains"
  };

  /**
   * Constructs the FrenchState
   * @param box A MusicBox
   */
  public FrenchState(MusicBox box) {
    musicBox = box;
  }

  /**
   * Plays the song Twinkle Twinkle Little Star in French
   */
  public void pressStarButton() {
    ArrayList<String> outLyrics = new ArrayList<String>();
    for (String line : starLyrics) {
      outLyrics.add(line);
    }
    musicBox.playSong(starTitle, outLyrics);
  }

  /**
   * Plays the song If You're Happy and You Know It
   * in French
   */
  public void pressHappyButton() {
    ArrayList<String> outLyrics = new ArrayList<String>();
    for (String line : happyLyrics) {
      outLyrics.add(line);
    }
    musicBox.playSong(happyTitle, outLyrics);
  }

  /**
   * Sets the MusicBox's state to English
   */
  public void pressEnglishButton() {
    musicBox.setState(musicBox.getEnglishState());
  }

  /**
   * Displays a message stating that the MusicBox is 
   * already set to French
   */
  public void pressFrenchButton() {
    System.out.println("You are already in the French mode.");
  }

  /**
   * Sets the MusicBox's state to Spanish
   */
  public void pressSpanishButton() {
    musicBox.setState(musicBox.getSpanishState());
  }
}
