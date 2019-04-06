public abstract class Instrument implements IPlay {

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

    public void setBuyPrice(double newBuyPrice){
        this.buyPrice = newBuyPrice;
    }

    public double getSellPrice(){
        return this.sellPrice;
    }

    public InstrumentType getType(){
        return this.instrumentType;
    }


}
