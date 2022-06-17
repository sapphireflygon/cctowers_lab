import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom;

    @Before
    public void before(){
        ArrayList<Guest> guests = new ArrayList<>();
        bedroom = new Bedroom(1, RoomType.SINGLE, 20.50);
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void hasRoomType(){
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }

    @Test
    public void hasEmptyGuestList(){
        assertEquals(0, bedroom.getGuestCount());
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(20.50, bedroom.getNightlyRate(), 0.00);
    }

    @Test
    public void canCalculateRoomSize(){
        assertEquals(10, bedroom.getRoomSize(2, 5), 0.0);
    }
}
