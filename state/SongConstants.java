package state;

import java.util.ArrayList;

public abstract class SongConstants {
  static enum Language {ENGLISH, SPANISH, FRENCH};
  static enum Song {STAR, HAPPY};
  static final String starTitleEnglish = "Twinkle, Twinkle, Little Star";
  static final String starTitleFrench = "Brille, Brille, Petite Etoile";
  static final String starTitleSpanish = "Parpadea, Parpadea, Estrellita";
  static final String happyTitleEnglish = "If You're Happy and You Know It";
  static final String happyTitleFrench = "Si Tu Aimes le Soleil";
  static final String happyTitleSpanish = "Si Usted Esta Feliz";
  static final String[] starLyricsEnglish = 
  {
    "Twinkle, twinkle, little star", 
    "How I wonder what you are",
    "Up above the world so high",
    "Like a diamond in the sky",
    "Twinkle, twinkle, little star",
    "How I wonder what you are"
  };
  static final String[] starLyricsFrench =
  {
    "Brille, brille, petite etoile",
    "Je me demande vraiment ce que tue es",
    "Au-dessus du monde si haut",
    "Comme un diamant dans le ciel",
    "Brille, brille, petite etoile",
    "Je me demande vraiment ce que tu es"
  };
  static final String[] starLyricsSpanish = 
  {
    "Parpadea, parpadea, estrellita",
    "Como me pregunto que eres",
    "Encima del mundo tan alta",
    "Como un diamante en el cielo",
    "Parpadea, parpadea, estrellita",
    "Como me pregunto que eres"
  };                                        
  static final String[] happyLyricsEnglish =
  {
    "If you're happy and you know it clap your hands", 
    "If you're happy and you know it clap your hands",
    "If you're happy and you know it and you really want to show it",
    "If you're happy and you know it clap your hands"
  };
  static final String[] happyLyricsFrench = 
  {
    "Si tu aimes le soleil frappe des mains",
    "Si tu aimes le soleil frappe des mains",
    "Si tu aimes le soleil le printemps que se reveille",
    "Si tu aimes le soleil frappe des mains"
  };
  static final String[] happyLyricsSpanish =
  {
    "Si usted esta feliz apaluda las fuerte",
    "Si usted esta feliz apaluda las fuerte",
    "Si usted esta feliz en su cara se vera",
    "Si usted esta feliz apaluda las fuerte"
  };

  static final ArrayList<String> getLyrics(Language language, Song song) {
    String[] selectedLyrics;
    switch (language) {
      case ENGLISH:
        switch (song) {
          case STAR:
            selectedLyrics = starLyricsEnglish;
            break;
          case HAPPY:
            selectedLyrics = happyLyricsEnglish;
            break;
          default:
            selectedLyrics = starLyricsEnglish;
            break;
        }
        break;
      case SPANISH:
        switch (song) {
          case STAR:
            selectedLyrics = starLyricsSpanish;
            break;
          case HAPPY:
            selectedLyrics = happyLyricsSpanish;
            break;
          default:
            selectedLyrics = starLyricsSpanish;
            break;
        }
        break;
      case FRENCH:
        switch (song) {
          case STAR:
            selectedLyrics = starLyricsFrench;
            break;
          case HAPPY:
            selectedLyrics = happyLyricsFrench;
            break;
          default:
            selectedLyrics = starLyricsFrench;
            break;
        }
        break;
      default:
        selectedLyrics = starLyricsEnglish;
        break;
    }
    ArrayList<String> lyricsOut = new ArrayList<String>();
    for (String line : selectedLyrics) {
      lyricsOut.add(line);
    }
    return lyricsOut;
  }
}
