import java.util.ArrayList;

public class Ipod_simulator implements IIpod_simulator {
    private Boolean isOn;
    private ArrayList<Song> allsongs;
    private ArrayList<Song> topTenSongs;
    private Boolean isLocked;
    private float volume;


    public Ipod_simulator(){
        topTenSongs = new ArrayList<Song>();
        allsongs = new ArrayList<Song>();
    }
    @Override
    public boolean SwitchONOFF(boolean actual_state) {
        Boolean c = actual_state;
        return c;
    }

    @Override
    public boolean LockUnlockDevice(boolean actual_locked_state) {
        Boolean c = actual_locked_state;
        return c;
    }

    @Override
    public float getVolume() {
        return volume;
    }

    @Override
    public float setVolume(float volume) {
        this.volume = volume;
        return this.volume;
    }

    @Override
    public int Prev(int actual_index) {
        actual_index -= 1;
        return actual_index;
    }

    @Override
    public int Next(int actual_index) {
        actual_index+=1;
        return actual_index;
    }

    @Override
    public int getActualIndex() {

        int index =0;
        return index;
    }

    @Override
    public void setActualIndex(int actual_index) throws Exception {
        
    }

    @Override
    public void addToFavorite(ICancion _song) throws Exception {

        try{

        }catch(Exception e){

        }
        
    }

    @Override
    public ICancion selectSpecificSong(int index) throws Exception {

        return null;
    }

    @Override
    public ICancion selectSpecificFavoriteSong(int index) throws Exception {

        return null;
    }

    @Override
    public ICancion[] getAllSongs() {

        return null;
    }

    @Override
    public String getStatus(boolean _isON, boolean _isLocked, boolean _isPlaying, ICancion _actualSong) {

        return null;
    }

    @Override
    public boolean isValidIndex(int index) {
   
        return false;
    }

    @Override
    public void addSongToList(String _titulo, String _artista, String _album, String _duracion, int _id)
            throws Exception {

        
    }

    @Override
    public void deleteSongFromList(int index) throws Exception {

        
    }

    @Override
    public void deleteSongFromTop10(int index) throws Exception {

        
    }
    public Boolean getIsOn() {
        return isOn;
    }
    public void setIsOn(Boolean isOn) {
        this.isOn = isOn;
    }
   
    public Boolean getIsLocked() {
        return isLocked;
    }
    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }
    public ArrayList<Song> getAllsongs() {
        return allsongs;
    }
    public void setAllsongs(ArrayList<Song> allsongs) {
        this.allsongs = allsongs;
    }
    public ArrayList<Song> getTopTenSongs() {
        return topTenSongs;
    }
    public void setTopTenSongs(ArrayList<Song> topTenSongs) {
        this.topTenSongs = topTenSongs;
    }
    


    
    
}
