import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {
    Flute flute;

    @Before
    public void before(){
        flute = new Flute(300.50,600.00,InstrumentType.WIND);

    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(300.50,flute.getBuyPrice(),0.001);
    }

    @Test
    public void canSetBuyPrice(){
        flute.setBuyPrice(400.00);
        assertEquals(400.00,flute.getBuyPrice(),0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(600.00,flute.getSellPrice(),0.001);
    }

    @Test
    public void canSetSellPrice(){
        flute.setSellPrice(900.90);
        assertEquals(900.90,flute.getSellPrice(),0.001);
    }

    @Test
    public void canGetType(){
        assertEquals(InstrumentType.WIND,flute.getType());
    }

    @Test
    public void canPlay(){
        assertEquals("Flute is playing Tune",flute.play("Tune"));

    }
}
