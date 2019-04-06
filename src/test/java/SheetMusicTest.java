import Accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Classical", 20.50, 25.50,"Moonlight");
    }

    @Test
    public void canGetDescription(){
        assertEquals("Classical", sheetMusic.getDescription());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(20.50,sheetMusic.getBuyPrice(),0.001);
    }

    @Test
    public void canSetBuyPrice(){
        sheetMusic.setBuyPrice(200.00);
        assertEquals(200,sheetMusic.getBuyPrice(),0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(25.50,sheetMusic.getSellPrice(),0.001);
    }

    @Test
    public void canSetSellPrice(){
        sheetMusic.setSellPrice(450.55);
        assertEquals(450.55,sheetMusic.getSellPrice(),0.001);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(5.00,sheetMusic.calculateMarkUp(),0.001);
    }

    @Test
    public void canGetSongTitle(){
        assertEquals("Moonlight",sheetMusic.getSong());
    }
}
