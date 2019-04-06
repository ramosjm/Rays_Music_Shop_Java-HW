public class Piano extends Instrument {

    public Piano(double buyPrice, double sellPrice, InstrumentType instrumentType){
        super(buyPrice,sellPrice,instrumentType);
    }

    public String play(String title){
        return "Piano is playing " + title;
    }

}
