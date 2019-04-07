package Accessories;

public class GuitarString extends Accessory{

    private String type;

    public GuitarString(String description, double buyPrice, double sellPrice, String type){
        super(description,buyPrice,sellPrice);
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}
