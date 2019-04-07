import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void before(){
        shop = new Shop("Ray's Music Shop");
    }

    @Test
    public void canGetName(){
        assertEquals("Ray's Music Shop",shop.getName());
    }

    @Test
    public void canCountStock(){
        assertEquals(0,shop.countStock());
    }

//    @Test
//    public void canGetStock(){
//
//    }
}
