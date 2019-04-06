import Accessories.Strap;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrapTest {

    Strap strap;

    @Before
    public void before(){
        strap = new Strap("Short Strap", 150.50, 300.00,"Leather");
    }

    @Test
    public void canGetDescription(){
        assertEquals("Short Strap", strap.getDescription());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(150.50,strap.getBuyPrice(),0.001);
    }

    @Test
    public void canSetBuyPrice(){
        strap.setBuyPrice(200.00);
        assertEquals(200,strap.getBuyPrice(),0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(300.00,strap.getSellPrice(),0.001);
    }

    @Test
    public void canSetSellPrice(){
        strap.setSellPrice(450.55);
        assertEquals(450.55,strap.getSellPrice(),0.001);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(149.50,strap.calculateMarkUp(),0.001);
    }

    @Test
    public void canGetStrapMaterial(){
        assertEquals("Leather",strap.getMaterial());
    }
}
