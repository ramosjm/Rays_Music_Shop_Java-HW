import Accessories.Accessory;
import Accessories.Strap;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory accessory;
    Strap strap;

    @Before
    public void before(){
        accessory = new Strap("Short Strap", 150.50, 300.00,"Leather");
    }

    //Strap as accessory

    @Test
    public void canGetDescription(){
        assertEquals("Short Strap", accessory.getDescription());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(150.50,accessory.getBuyPrice(),0.001);
    }

    @Test
    public void canSetBuyPrice(){
        accessory.setBuyPrice(200.00);
        assertEquals(200,accessory.getBuyPrice(),0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(300.00,accessory.getSellPrice(),0.001);
    }

    @Test
    public void canSetSellPrice(){
        accessory.setSellPrice(450.55);
        assertEquals(450.55,accessory.getSellPrice(),0.001);
    }


}
