package Instruments;

public class Guitar extends Instrument {

    public Guitar(double buyPrice, double sellPrice, InstrumentType instrumentType){
        super(buyPrice,sellPrice,instrumentType);
    }

    public String play(String title){
        return "Instruments.Guitar is playing " + title;
    }

}
