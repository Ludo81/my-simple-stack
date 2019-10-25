package deqo.ltou.mysimplestack;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class ItemTest {

    private SimpleStackImp s1 = new SimpleStackImp();
    private Item i1 = new Item();
    private Item i2 = new Item();

    @Before
    public void setUp() throws Exception{
        i1.setNum(5);
        i2.setNum(6);
    }

    @Test
    public void getNumTest() {
        Item item = new Item();
        int testInt = 5;
        item.setNum(testInt);
        assertEquals(5, item.getNum());
    }

    @Test
    public void isEmptyTest(){
        assertEquals(s1.isEmpty(), true);
    }

    @Test
    public void getSizeTest(){
        assertEquals(s1.getSize(),0);
        s1.push(i1);
        assertEquals(s1.getSize(), 1);
    }

    @Test
    public void popTest(){
        s1.push(i1);
        s1.push(i2);
        assertEquals(s1.pop(), i2);
    }

    @Test
    public void isEmptyTestFalse(){
        s1.push(i1);
        assertEquals(s1.isEmpty(),false);
    }

    @Test
    public void popNullTest(){
        s1.push(null);
        assertEquals(s1.pop(),null);
    }
}
