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
}
