package adapter;

/**
 * An extension of the Song class
 * @author Coy Burke
 */
public class Track extends Song {
  private String title;
  private String album;
  private String firstName;
  private String lastName;
  private Genre genre;

  public Track(String title, String album, String firstName, String lastName, Genre genre) {
    this.title = title;
    this.album = album;
    this.firstName = firstName;
    this.lastName = lastName;
    this.genre = genre;
  }

  /**
   * Returns the title of the Track
   * @return A String representing
   * the track's title
   */
  public String getTitle() {
    return title;
  }

  /**
   * Returns the name of the album
   * the track is from
   * @return A String representing
   * the album's name
   */
  public String getAlbum() {
    return album;
  }

  /**
   * Returns the Track's artist's first name
   * @return A String representing the
   * artist's first name
   */
  public String getArtistFirstName() {
    return firstName;
  }

  /**
   * Returns the Track's artist's last name
   * @return A String representing the
   * artist's last name
   */
  public String getArtistLastName() {
    return lastName;
  }

  /**
   * Returns the Track's genre
   * @return A String representing the
   * genre of the Track
   */
  public String getGenre() {
    switch(genre) {
      case ROCK:
        return "Rock";
      case POP:
        return "Pop";
      case HIPHOP:
        return "HipHop";
      case JAZZ:
        return "Jazz";
      case COUNTRY:
        return "Country";
      case OTHER:
        return "Other";
      default:
        return "Other";
    }
  }
}
