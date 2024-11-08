package Bupasha;

public class CD extends Product {
    private String artist;
    private String numSong;
    private String label;

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getNumSong() {
        return this.numSong;
    }

    public void setNumSong(String numSong) {
        this.numSong = numSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CD() {
        super(); //mengakses constructor superclass
        artist = "";
        numSong = "0";
        label = "";
    }

    public CD(int number, String name, int quantity, double price, String artist, String numSong, String label) {
        super(number, name, quantity, price);
        this.artist = artist;
        this.numSong = numSong;
        this.label = label;
    }
    public void print(){
        super.print();
        System.out.println("Artist :" +artist);
        System.out.println("Total song :" +numSong);
        System.out.println("Label :" +label);
    


    }
}