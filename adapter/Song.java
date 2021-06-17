package adapter;

/**
 * An abstract Song class
 * @author Coy Burke
 */
public abstract class Song {
  public abstract String getTitle();
  public abstract String getAlbum();
  public abstract String getArtistFirstName();
  public abstract String getArtistLastName();
  public abstract String getGenre();
  /**
   * Returns the formatted Song information
   * @return A formatted string containing
   * all of the song's information
   */
  public String toString() {
    String outString = getTitle() + "\n" 
                      +"Album: " + getAlbum() + "\n"
                      +"By: " + getArtistFirstName() + " " + getArtistLastName() + "\n"
                      +"Genre: " + getGenre() + "\n";
    return outString;
  }
}
