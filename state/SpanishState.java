package state;

import java.util.ArrayList;

/**
 * A Spanish state for a MusicBox
 * @author Coy Burke
 */
public class SpanishState implements State {
  private MusicBox musicBox;
  private String starTitle = "Parpadea, Parpadea, Estrellita";
  private String happyTitle = "Si Usted Esta Feliz";
  private String[] starLyrics = 
  {
    "Parpadea, parpadea, estrellita",
    "Como me pregunto que eres",
    "Encima del mundo tan alta",
    "Como un diamante en el cielo",
    "Parpadea, parpadea, estrellita",
    "Como me pregunto que eres"
  }; 
  private String[] happyLyrics =
  {
    "Si usted esta feliz apaluda las fuerte",
    "Si usted esta feliz apaluda las fuerte",
    "Si usted esta feliz en su cara se vera",
    "Si usted esta feliz apaluda las fuerte"
  };

  /**
   * Constructs the SpanishState
   * @param box A MusicBox
   */
  public SpanishState(MusicBox box) {
    musicBox = box;
  }
  
  /**
   * Plays the song Twinkle Twinkle Little Star in Spanish
   */
  public void pressStarButton() {
    ArrayList<String> outLyrics = new ArrayList<String>();
    for (String line : starLyrics) {
      outLyrics.add(line);
    }
    musicBox.playSong(starTitle, outLyrics);
  }

  /**
   * Plays the song If You're Happy and You Know It in 
   * Spanish
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
   * Sets the MusicBox's state to French
   */
  public void pressFrenchButton() {
    musicBox.setState(musicBox.getFrenchState());
  }

  /**
   * Displays a message stating that the MusicBox
   * is already set to Spanish
   */
  public void pressSpanishButton() {
    System.out.println("You are already in the Spanish mode.");
  }
}
