package adapter;

public class SongAdapter extends Song {
  private final int titleIndex = 0;
  private final int albumIndex = 1;
  private final int firstNameIndex = 0;
  private final int lastnameIndex = 1;
  private Tune tune;

  public SongAdapter(Tune tune) {
    this.tune = tune;
  }

  public String getTitle() {
    String stringFromTune = tune.getDisplayTitle();
    String[] arrayFromTune = stringFromTune.split(":");
    String title = arrayFromTune[titleIndex];
    // removes extra space at the end of the 
    // extracted title
    return title.substring(0,title.length()-1);
  }

  public String getAlbum() {
    String stringFromTune = tune.getDisplayTitle();
    String[] arrayFromTune = stringFromTune.split(":");
    String album = arrayFromTune[albumIndex];
    // removes extra space at the beginning of
    // the extracted album name
    return album.substring(1);
  }

  public String getArtistFirstName() {
    String stringFromTune = tune.getArtistName();
    String[] arrayFromTune = stringFromTune.split(" ");
    return arrayFromTune[firstNameIndex];
  }

  public String getArtistLastName() {
    String stringFromTune = tune.getArtistName();
    String[] arrayFromTune = stringFromTune.split(" ");
    return arrayFromTune[lastnameIndex];
  }

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
