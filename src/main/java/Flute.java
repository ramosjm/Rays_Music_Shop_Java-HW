public class Flute extends Instrument {

    public Flute(double buyPrice, double sellPrice, InstrumentType instrumentType){
        super(buyPrice,sellPrice,instrumentType);
    }

    public String play(String title){
        return "Flute is playing " + title;
    }
}
