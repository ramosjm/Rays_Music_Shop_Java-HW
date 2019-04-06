package Accessories;

public abstract class Accessory {

    private String description;
    private double buyPrice;
    private double sellPrice;


    public Accessory(String description, double buyPrice, double sellPrice){
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription(){
        return this.description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double newPrice){
        this.buyPrice = newPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
