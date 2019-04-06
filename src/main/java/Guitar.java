public class Guitar extends Instrument {

    public Guitar(double buyPrice, double sellPrice, InstrumentType instrumentType){
        super(buyPrice,sellPrice,instrumentType);
    }


    public String play(String title){
        return "Guitar is playing" + title;

    }


}
