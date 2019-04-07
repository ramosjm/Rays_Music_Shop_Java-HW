import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int countStock(){
        return this.stock.size();
    }

    public void addToStock(ISell item){
        this.stock.add(item);
    }

    public ISell removeFromStock(){
        return this.stock.remove(0);
    }

    public double calculatePotentialProfit(){
        double total= 0;
        for (ISell item : this.stock ){
            total += item.calculateMarkUp();
        }
        return total;
    }
}
