package adapter;

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

  public String getArtistName() {
    return artistName;
  }

  public String getDisplayTitle() {
    return songTitle + " : " + recordTitle;
  }

  public String getCategory() {
    return category;
  }
}
