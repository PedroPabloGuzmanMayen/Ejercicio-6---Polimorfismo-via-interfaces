import java.util.ArrayList;
import java.util.Scanner;

public class Ipod_simulator implements IIpod_simulator {
    private Boolean isOn;
    private ArrayList<Song> allsongs;
    private ArrayList<Song> topTenSongs;
    private Boolean isLocked;
    private float volume;
    private Boolean _isPlaying; 
    private Scanner scanner;


    public Ipod_simulator(){
        topTenSongs = new ArrayList<Song>();
        allsongs = new ArrayList<Song>();
        scanner = new Scanner(System.in);
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
        this.volume = volume+(float)(0.5);
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

        return 0;
    }

    @Override
    public void setActualIndex(int actual_index) throws Exception {
        
    }

    @Override
    public void addToFavorite(ICancion _song) throws Exception {

        try{
            _song = new Song();
            System.out.println("Nombre de la cancion: ");
            this.scanner.nextLine();
            System.out.println("Artista de la cancion: ");
            this.scanner.nextLine();
            System.out.println("Duracion de la cancion: ");
            this.scanner.nextLine();
            System.out.println("Album de la cancion: ");
            this.scanner.nextLine();
            System.out.println("ID de la cancion: ");
            this.scanner.nextInt();
            this.scanner.nextLine();


        }catch(Exception e){

        }
        
    }

    @Override
    public ICancion selectSpecificSong(int index) throws Exception {
        Song selectedsong = this.allsongs.get(index); 
        return selectedsong;
    }

    @Override
    public ICancion selectSpecificFavoriteSong(int index) throws Exception {
        Song selectedsong = this.topTenSongs.get(index); 
        return selectedsong;
    }

    @Override
    public ICancion[] getAllSongs() {

        Song[] listofSongs = new Song[50];

        for (int i =0; i<this.allsongs.size(); i++){
            listofSongs[i] = this.allsongs.get(i);
        }

        return listofSongs;
    }

    @Override
    public String getStatus(boolean _isON, boolean _isLocked, boolean _isPlaying, ICancion _actualSong) {
        String message = "";
        if (_isON && _isLocked && _isPlaying){
            message = "El Ipod está encendido pero bloqueado, se está reproduciendo la cancion:  " + _actualSong.getTitle();
        }
        if(_isON && !_isLocked && !_isPlaying){
            message = "El Ipod esta encendido, no esta bloqueado, ninguna cancion se esta reproduciendo";
        }
        if (!_isON){
            message = "El Ipod está apagado";
        }
        if(_isON && !_isLocked && _isPlaying){
            message = "El Ipod esta encendido, no esta bloqueado, se está reproduciendo la cancion:  " + _actualSong.getTitle();
        }

        return message;
    }

    @Override
    public boolean isValidIndex(int index) {
        boolean isValid = false;
        if (index > this.allsongs.size()){
            isValid = false;
        }
        else{
            isValid = true;
        }
        return isValid;
    }

    @Override
    public void addSongToList(String _titulo, String _artista, String _album, String _duracion, int _id) throws Exception {

        Song song = new Song();
        song.setAlbum(_album);
        song.setArtist(_artista);
        song.setTitle(_titulo);
        song.setDuration(_duracion);
        song.setID(_id);
        this.allsongs.add(song);
        
    }

    @Override
    public void deleteSongFromList(int index) throws Exception {

        try{
            this.allsongs.remove(index);

        }catch(Exception e){

        }
    }

    @Override
    public void deleteSongFromTop10(int index) throws Exception {
        try{
            this.topTenSongs.remove(index);

        }catch(Exception e){

        }

        
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
    public Boolean get_isPlaying() {
        return _isPlaying;
    }
    public void set_isPlaying(Boolean _isPlaying) {
        this._isPlaying = _isPlaying;
    }
    


    
    
}
