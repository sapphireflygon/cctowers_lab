import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(1, RoomType.SINGLE, 20.50);
        booking = new Booking(bedroom, 5);
    }

    @Test
    public void hasBedroom() {
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void hasNightsBooked(){
        assertEquals(5, booking.getNightsBooked());
    }
}
