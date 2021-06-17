package adapter;

import java.util.HashMap;

public class JukeBox {
  private HashMap<String, Song> songs;
  private int currentSong;

  public JukeBox() {
    songs = new HashMap<String, Song>();
    currentSong = 0;
  }

  public void addSong(Song song) {
    songs.put(song.getTitle().toLowerCase(), song);
  }

  public void play(String songName) {
    Song songFromJukebox = songs.get(songName.toLowerCase());
    boolean songNotFound = songFromJukebox == null;
    if(songNotFound) {
      System.out.println("Sorry, that song is not available.");
    } else {
      System.out.println(songFromJukebox.toString());
    }
  }
}
