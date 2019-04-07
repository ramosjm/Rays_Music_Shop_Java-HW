import Accessories.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before(){
        guitarString = new GuitarString("6 pack", 8.50, 10.50,"Nylon");
    }

    @Test
    public void canGetDescription(){
        assertEquals("6 pack", guitarString.getDescription());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(8.50,guitarString.getBuyPrice(),0.001);
    }

    @Test
    public void canSetBuyPrice(){
        guitarString.setBuyPrice(200.00);
        assertEquals(200,guitarString.getBuyPrice(),0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(10.50,guitarString.getSellPrice(),0.001);
    }

    @Test
    public void canSetSellPrice(){
        guitarString.setSellPrice(450.55);
        assertEquals(450.55,guitarString.getSellPrice(),0.001);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(2.00,guitarString.calculateMarkUp(),0.001);
    }

    @Test
    public void canGetStringType(){
        assertEquals("Nylon",guitarString.getType());
    }
}
