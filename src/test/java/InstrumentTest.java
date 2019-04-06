import Instruments.Guitar;
import Instruments.Instrument;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Guitar guitar;
    Instrument instrument;

    @Before
    public void before(){
        guitar = new Guitar(300.50,600.00,InstrumentType.STRING);
        instrument = new Guitar(350.50,630.90, InstrumentType.STRING);
    }
    // Instruments.Instrument as Instruments.Guitar
    @Test
    public void instrumentCanGetBuyPrice(){
        assertEquals(350.50,instrument.getBuyPrice(),0.001);
    }

    @Test
    public void instrumentCanSetBuyPrice(){
        instrument.setBuyPrice(400.00);
        assertEquals(400.00,instrument.getBuyPrice(),0.001);
    }

    @Test
    public void instrumentCanGetSellPrice(){
        assertEquals(630.90,instrument.getSellPrice(),0.001);
    }

    @Test
    public void instrumentCanSetSellPrice(){
        instrument.setSellPrice(900.90);
        assertEquals(900.90,instrument.getSellPrice(),0.001);
    }

    @Test
    public void instrumentCanGetInstrumentType(){
        assertEquals(InstrumentType.STRING,guitar.getType());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(280.40,instrument.calculateMarkUp(),0.001);
    }
}
