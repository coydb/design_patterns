package adapter;

/**
 * An implementation of the Tune interface
 * @author Coy Burke
 */
public class Oldie implements Tune {
  private String artistName;
  private String songTitle;
  private String recordTitle;
  private String category;

  public Oldie(String artistName, String songTitle, String recordTitle, String category) {
    this.artistName = artistName;
    this.songTitle = songTitle;
    this.recordTitle = recordTitle;
    this.category = category;
  }

  /**
   * Returns the full name of the Artist
   * @return A String representing the
   * artist's full name
   */
  public String getArtistName() {
    return artistName;
  }

  /**
   * Returns the display title of the
   * tune
   * @return A String containing the title
   * and the name of the record the tune
   * is from
   */
  public String getDisplayTitle() {
    return songTitle + " : " + recordTitle;
  }

  /**
   * Returns the category of the tune
   * @return A String representing the 
   * tune's category
   */
  public String getCategory() {
    return category;
  }
}
