import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class ConferenceRoomTest {
    private ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        ArrayList<Guest> guests = new ArrayList<>();
        conferenceRoom = new ConferenceRoom("John Memorial Room", true, RoomSize.SMALL);
    }

    @Test
    public void hasName(){
        assertEquals("John Memorial Room", conferenceRoom.getName());
    }

    @Test
    public void isCatered(){
        assertEquals(true, conferenceRoom.isCatered());
    }

    @Test
    public void getRoomSize(){
        assertEquals(RoomSize.SMALL, conferenceRoom.getRoomSize());
    }

    @Test
    public void hasNoGuestsInRoom(){
        assertEquals(0, conferenceRoom.getGuestCount());
    }

}
