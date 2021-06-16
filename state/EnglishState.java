package state;

import java.util.ArrayList;

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

  public EnglishState(MusicBox box) {
    musicBox = box;
  }

  public void pressStarButton() {
    ArrayList<String> outLyrics = new ArrayList<String>();
    for(String line : starLyrics) {
      outLyrics.add(line);
    }
    musicBox.playSong(starTitle, outLyrics);
  }

  public void pressHappyButton() {
    ArrayList<String> outLyrics = new ArrayList<String>();
    for(String line : happyLyrics) {
      outLyrics.add(line);
    }
    musicBox.playSong(happyTitle, outLyrics);
  }

  public void pressEnglishButton() {
    System.out.println("You are already in English mode.");
  }

  public void pressFrenchButton() {
    musicBox.setState(musicBox.getFrenchState());
  }

  public void pressSpanishButton() {
    musicBox.setState(musicBox.getSpanishState());
  }
}
