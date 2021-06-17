package adapter;

/**
 * An adapter for creating a Song from a Tune
 * @author Coy Burke
 */
public class SongAdapter extends Song {
  private final int titleIndex = 0;
  private final int albumIndex = 1;
  private final int firstNameIndex = 0;
  private final int lastnameIndex = 1;
  private Tune tune;

  /**
   * Accepts a Tune, and converts it into a Song
   * @param tune The Tune to be converted
   */
  public SongAdapter(Tune tune) {
    this.tune = tune;
  }

  /**
   * Returns the Tune's title in 
   * the format of a Song title
   * @return A String representing the 
   * title of the tune
   */
  public String getTitle() {
    String stringFromTune = tune.getDisplayTitle();
    String[] arrayFromTune = stringFromTune.split(":");
    String title = arrayFromTune[titleIndex];
    // removes extra space at the end of the 
    // extracted title
    return title.substring(0,title.length()-1);
  }

  /**
   * Returns the Tune's album name in
   * the format of a Song album name
   * @return A String representing the 
   * name of the album
   */
  public String getAlbum() {
    String stringFromTune = tune.getDisplayTitle();
    String[] arrayFromTune = stringFromTune.split(":");
    String album = arrayFromTune[albumIndex];
    // removes extra space at the beginning of
    // the extracted album name
    return album.substring(1);
  }

  /**
   * Returns the Tune's artist's first name
   * @return A String representing the artist's first
   * name
   */
  public String getArtistFirstName() {
    String stringFromTune = tune.getArtistName();
    String[] arrayFromTune = stringFromTune.split(" ");
    return arrayFromTune[firstNameIndex];
  }

  /**
   * Returns the Tune's artist's last name
   * @return A String representing the artist's
   * last name
   */
  public String getArtistLastName() {
    String stringFromTune = tune.getArtistName();
    String[] arrayFromTune = stringFromTune.split(" ");
    return arrayFromTune[lastnameIndex];
  }

  /**
   * Returns the Tune's genre in 
   * the proper format for a Song genre
   * @return A String representing the 
   * tune's genre
   */
  public String getGenre() {
    String category = tune.getCategory().toLowerCase();
    switch (category) {
      case "country and western":
        return "Country";
      case "r&b and soul":
        return "Other";
      case "easy listening":
        return "Other";
      case "rock":
        return "Rock";
      case "classic rock":
        return "Rock";
      default:
        return "Other";
    }
  }
}
