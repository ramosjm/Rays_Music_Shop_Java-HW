import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Guitar guitar;
    Instrument instrument;

    @Before
    public void before(){
        guitar = new Guitar(300.50,600.00,InstrumentType.STRING);
        instrument = new Guitar(350.50,630.90,InstrumentType.STRING);
    }
    // Instrument as Guitar
    @Test
    public void instrumentCanGetBuyPrice(){
        assertEquals(350.50,instrument.getBuyPrice(),0.001);
    }

    @Test
    public void instrumentCanGetSellPrice(){
        assertEquals(630.90,instrument.getSellPrice(),0.001);
    }
}
