package state;

import java.util.ArrayList;

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

  public SpanishState(MusicBox box) {
    musicBox = box;
  }
  
  public void pressStarButton() {
    ArrayList<String> outLyrics = new ArrayList<String>();
    for (String line : starLyrics) {
      outLyrics.add(line);
    }
    musicBox.playSong(starTitle, outLyrics);
  }

  public void pressHappyButton() {
    ArrayList<String> outLyrics = new ArrayList<String>();
    for (String line : happyLyrics) {
      outLyrics.add(line);
    }
    musicBox.playSong(happyTitle, outLyrics);
  }

  public void pressEnglishButton() {
    musicBox.setState(musicBox.getEnglishState());
  }

  public void pressFrenchButton() {
    musicBox.setState(musicBox.getFrenchState());
  }

  public void pressSpanishButton() {
    System.out.println("You are already in the Spanish mode.");
  }
}
