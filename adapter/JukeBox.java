package adapter;

import java.util.HashMap;
/**
 * A JukeBox class that stores and plays Songs
 * @author Coy Burke
 */
public class JukeBox {
  private HashMap<String, Song> songs;

  public JukeBox() {
    songs = new HashMap<String, Song>();
  }

  /**
   * Adds a Song to the JukeBox
   * @param song The Song to add
   */
  public void addSong(Song song) {
    songs.put(song.getTitle().toLowerCase(), song);
  }

  /**
   * Plays a song from the JukeBox
   * @param songName The title of the desired song
   */
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
