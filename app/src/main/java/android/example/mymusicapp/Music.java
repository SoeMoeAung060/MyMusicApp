package android.example.mymusicapp;

public class Music {

    private String songName;
    private String artistName;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Music() {
    }

    public Music(String musicName, String artistName) {
        this.songName = musicName;
        this.artistName = artistName;
    }

    public Music(String songName, String artistName, int mImageResourceId) {
        this.songName = songName;
        this.artistName = artistName;
        this.mImageResourceId = mImageResourceId;
    }

    public String getSongName() {
        return songName;
    }


    public String getArtistName() {
        return artistName;
    }


    public int getmImageResourceId() {
        return mImageResourceId;
    }


    /**
     * Return whether or not there is an image for this word.
     * */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
