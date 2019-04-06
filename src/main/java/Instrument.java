public abstract class Instrument {

    private double buyPrice;
    private double sellPrice;
    private InstrumentType instrumentType;

    public Instrument(double buyPrice, double sellPrice, InstrumentType instrumentType){
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.instrumentType = instrumentType;
    }

    public double getBuyPrice(){
        return this.buyPrice;
    }

    public double getSellPrice(){
        return this.sellPrice;
    }

    public InstrumentType getType(){
        return this.instrumentType;
    }

}
