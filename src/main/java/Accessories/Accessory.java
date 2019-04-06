package Accessories;
import Interfaces.ISell;


public abstract class Accessory implements ISell{

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

    public void setSellPrice(double newPrice){
        this.sellPrice = newPrice;
    }

    public double calculateMarkUp(){
        return this.getSellPrice() - this.getBuyPrice();
    }
}
