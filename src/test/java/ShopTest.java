import Instruments.Guitar;
import Instruments.InstrumentType;
import Interfaces.ISell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ShopTest {

    Shop shop;
    Guitar guitar;

    @Before
    public void before(){
        shop = new Shop("Ray's Music Shop");
        guitar = new Guitar(500,800, InstrumentType.STRING);
    }

    @Test
    public void canGetName(){
        assertEquals("Ray's Music Shop",shop.getName());
    }

    @Test
    public void canCountStock(){
        assertEquals(0,shop.countStock());
    }

    @Test
    public void canAddToStock(){
        shop.addToStock(guitar);
        assertEquals(1,shop.countStock());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addToStock(guitar);
        shop.addToStock(guitar);
        ISell removedItem =shop.removeFromStock();
        assertNotNull(removedItem);
        assertEquals(1,shop.countStock());
    }


}
