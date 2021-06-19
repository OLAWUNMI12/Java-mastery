import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }


    public boolean addSong(String songTitle, double duration ){
        return  this.songs.add(new Song(songTitle, duration));
    }

    public boolean addToPlayList(int trackNo, LinkedList<Song> playList){
        boolean success = false;
        Song song = songs.findSong(trackNo);
        if(song != null){
            if(!playList.contains(song)){
                playList.add(song);
                success = true;
            }
        }
        return success;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        boolean success = false;
        Song song = songs.findSong(title);
        if(song != null){
            if(!playList.contains(song)){
                playList.add(song);
                success = true;
            }
        }
        return  success;
    }

    private class SongList{
        private ArrayList<Song> songs;

        public SongList() {
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

        private boolean add(Song song ){
            boolean success = false;
            if(findSong(song.getTitle()) == null){
                this.songs.add(song);
                success = true;
            }
            return success;
        }

        private Song findSong(int trackNo){
            Song song = null;
            if(songs.size() > 0 && songs.size() > trackNo - 1){
               song = songs.get(trackNo -1);
            }
            return song;
        }
    }
}
