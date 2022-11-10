public class Song implements ICancion {

    private String title;
    private String artist;
    private String album;
    private String duration;
    private int ID;
    @Override
    public void setTitle(String _title) {
        this.title = _title;
        
    }

    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        return title;
    }

    @Override
    public void setArtist(String _artist) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getArtist() {
        return artist;
    }

    @Override
    public void setAlbum(String _album) {
        this.album = _album;
        
    }

    @Override
    public String getAlbum() {
        return album;
    }

    @Override
    public void setDuration(String _duration) {
        this.duration = _duration;
        
    }

    @Override
    public String getDuration() {
        return duration;
    }

    @Override
    public void setID(int _id) {
        this.ID = _id;
        
    }

    @Override
    public int getID() {
        return ID;
    }
    
}
