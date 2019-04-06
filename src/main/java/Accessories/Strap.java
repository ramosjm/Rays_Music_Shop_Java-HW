package Accessories;

public class Strap extends Accessory{

    private String material;

    public Strap(String description, double buyPrice, double sellPrice, String material){
        super(description,buyPrice,sellPrice);
        this.material = material;
    }
}
