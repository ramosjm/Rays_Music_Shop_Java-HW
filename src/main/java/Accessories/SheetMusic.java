package Accessories;

public class SheetMusic extends Accessory {

    private String song;

    public SheetMusic(String description,double buyPrice, double sellPrice, String song){
        super(description,buyPrice,sellPrice);
        this.song = song;
    }
}
