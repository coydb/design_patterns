package state;

import java.util.ArrayList;

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

  public FrenchState(MusicBox box) {
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
    System.out.println("You are already in the French mode.");
  }

  public void pressSpanishButton() {
    musicBox.setState(musicBox.getSpanishState());
  }
}
