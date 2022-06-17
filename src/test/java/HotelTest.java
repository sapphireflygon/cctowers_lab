import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Hotel hotel;
    private Bedroom bedroom1;
    private ConferenceRoom conferenceRoom1;
    private Guest guest1;
    private ArrayList<Guest> guests;
    private Booking booking;
    private DiningRoom diningRoom;

    @Before
    public void before(){
        ArrayList<Bedroom> bedrooms = new ArrayList<>();
        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<>();
        ArrayList<Guest> guests = new ArrayList<>();
        hotel = new Hotel(bedrooms, conferenceRooms);
    }

    @Test
    public void hasNoBedrooms(){
        assertEquals(0, hotel.getNumberOfBedrooms());
    }

    @Test
    public void hasNoConferenceRooms(){
        assertEquals(0, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canAddBedrooms(){
        bedroom1 = new Bedroom(1, RoomType.SINGLE, 20.50);
        hotel.addBedroom(bedroom1);
        assertEquals(1, hotel.getNumberOfBedrooms());
    }

    @Test
    public void canAddConferenceRooms(){
        conferenceRoom1 = new ConferenceRoom("John Memorial Hall", true, RoomSize.SMALL);
        hotel.addConferenceRoom(conferenceRoom1);
        assertEquals(1, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canCheckGuestIntoBedroom(){
        bedroom1 = new Bedroom(1, RoomType.SINGLE, 20.50);
        hotel.addBedroom(bedroom1);
        guest1 = new Guest("Mark");
        hotel.checkIn(guest1, bedroom1);
        assertEquals(1, bedroom1.getGuestCount());
    }

    @Test
    public void canCheckGuestIntoConferenceRoom(){
        conferenceRoom1 = new ConferenceRoom("John Memorial Hall", true, RoomSize.SMALL);
        hotel.addConferenceRoom(conferenceRoom1);
        guest1 = new Guest("Mark");
        hotel.checkIn(guest1, conferenceRoom1);
        assertEquals(1, conferenceRoom1.getGuestCount());
    }

    @Test
    public void canCheckGuestOutOfBedroom(){
        bedroom1 = new Bedroom(1, RoomType.SINGLE, 20.50);
        hotel.addBedroom(bedroom1);
        guest1 = new Guest("Mark");
        hotel.checkIn(guest1, bedroom1);
        hotel.checkOut(guest1, bedroom1);
        assertEquals(0, bedroom1.getGuestCount());
    }

    @Test
    public void canCheckGuestOutOfConferenceRoom(){
        conferenceRoom1 = new ConferenceRoom("John Memorial Hall", true, RoomSize.SMALL);
        hotel.addConferenceRoom(conferenceRoom1);
        guest1 = new Guest("Mark");
        hotel.checkIn(guest1, conferenceRoom1);
        hotel.checkOut(guest1, conferenceRoom1);
        assertEquals(0, conferenceRoom1.getGuestCount());
    }

    @Test
    public void canBookBedroom(){
        bedroom1 = new Bedroom(1, RoomType.SINGLE, 20.50);
        hotel.addBedroom(bedroom1);
        booking = hotel.bookRoom(bedroom1, 3);
        assertEquals(bedroom1, booking.getBedroom());
        assertEquals(3, booking.getNightsBooked());
        assertEquals(true, booking != null);
    }

    @Test
    public void canGetTotalBill(){
        bedroom1 = new Bedroom(1, RoomType.SINGLE, 20.50);
        hotel.addBedroom(bedroom1);
        booking = hotel.bookRoom(bedroom1, 3);
        double bill = hotel.calculateBill(booking);
        assertEquals(61.50, bill, 0.00);
    }

    @Test
    public void hasNoDiningRooms(){
        assertEquals(0, hotel.getNumberOfDiningRooms());
    }

    @Test
    public void canAddDiningRooms(){
        diningRoom = new DiningRoom("John Memorial Dining Area", 100);
        hotel.addDiningRoom(diningRoom);
        assertEquals(1, hotel.getNumberOfDiningRooms());
    }
}
