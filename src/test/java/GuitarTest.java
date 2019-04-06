import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(300.50,600.00,InstrumentType.STRING);

    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(300.50,guitar.getBuyPrice(),0.001);
    }

    @Test
    public void canSetBuyPrice(){
        guitar.setBuyPrice(400.00);
        assertEquals(400.00,guitar.getBuyPrice(),0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(600.00,guitar.getSellPrice(),0.001);
    }

    @Test
    public void canSetSellPrice(){
        guitar.setSellPrice(900.90);
        assertEquals(900.90,guitar.getSellPrice(),0.001);
    }

    @Test
    public void canGetType(){
        assertEquals(InstrumentType.STRING,guitar.getType());
    }

    @Test
    public void canPlay(){
        assertEquals("Guitar is playing Yay",guitar.play("Yay"));

    }
}

