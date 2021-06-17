package adapter;

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

  public String getTitle() {
    return title;
  }

  public String getAlbum() {
    return album;
  }

  public String getArtistFirstName() {
    return firstName;
  }

  public String getArtistLastName() {
    return lastName;
  }

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
