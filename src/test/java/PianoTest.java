import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(300.50,600.00,InstrumentType.KEYBOARD);

    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(300.50,piano.getBuyPrice(),0.001);
    }

    @Test
    public void canSetBuyPrice(){
        piano.setBuyPrice(400.00);
        assertEquals(400.00,piano.getBuyPrice(),0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(600.00,piano.getSellPrice(),0.001);
    }

    @Test
    public void canSetSellPrice(){
        piano.setSellPrice(900.90);
        assertEquals(900.90,piano.getSellPrice(),0.001);
    }

    @Test
    public void canGetType(){
        assertEquals(InstrumentType.KEYBOARD,piano.getType());
    }

    @Test
    public void canPlay(){
        assertEquals("Piano is playing Woo",piano.play("Woo"));

    }
}
