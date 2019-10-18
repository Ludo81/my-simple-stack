package deqo.ltou.mysimplestack;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class ItemTest {



    @Test
    public void getNumTest() {
        Item item = new Item();
        int testInt = 5;
        item.setNum(testInt);
        assertEquals(5, item.getNum());
    }

    @Test
    public void setNumTest()
    {
        Item item = new Item();
        assertEquals(5, item.setNum(5));
    }
}
