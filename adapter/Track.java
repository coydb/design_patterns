package adapter;

public class Track extends Song {
  private String title;
  private String album;
  private String firstName;
  private String lastName;
  private Genre genre;

  public Track(String title, String album, String firstName, String lastName, Genre genre) {

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
    return genre.toString();
  }
}
