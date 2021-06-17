import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    private Song findSong(String songName){
        Song song = null;
        for(int i = 0 ;i < this.songs.size(); i++){
            if(songName.equals(this.songs.get(i).getTitle())){
                song = this.songs.get(i);
                break;
            }
        }
        return song;
    }

    public boolean addSong(String songTitle, double duration ){
        boolean success = false;
        if(findSong(songTitle) == null){
            this.songs.add(new Song(songTitle, duration));
            success = true;
        }
        return success;
    }

    public boolean addToPlayList(int trackNo, LinkedList<Song> playList){
        boolean success = false;
        if(songs.size() <= trackNo){
            Song song = songs.get(trackNo - 1);
            if(!playList.contains(song)){
                playList.add(song);
                success = true;
            }
        }
        return success;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        boolean success = false;
        Song song = findSong(title);
        if(song != null){
            if(!playList.contains(song)){
                playList.add(song);
                success = true;
            }
        }
        return  success;
    }

}
