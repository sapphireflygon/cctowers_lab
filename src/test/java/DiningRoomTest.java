import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    private DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom("John Memorial Dining Area", 100);
    }

    @Test
    public void hasName(){
        assertEquals("John Memorial Dining Area", diningRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(100, diningRoom.getCapacity());
    }
}
