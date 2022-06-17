import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, Object> diningRooms;


    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = new HashMap<>();
    }

    public int getNumberOfDiningRooms() {
        return this.diningRooms.size();
    }

    public int getNumberOfBedrooms() {
        return this.bedrooms.size();
    }

    public int getNumberOfConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkIn(Guest guest, Room room) {
        if (room instanceof Bedroom) {
            RoomType roomType = ((Bedroom) room).getRoomType();
            if (room.getGuestCount() < roomType.getValue()) {
                room.addGuestToRoom(guest);
            }
        } else {
            if (room.getGuestCount() < 1) {
                room.addGuestToRoom(guest);
            }
        }
    }

    public void checkOut(Guest guest, Room room) {
        room.removeGuestFromRoom(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int nightsBooked) {
        Booking booking = new Booking(bedroom, nightsBooked);
        return booking;
    }

    public double calculateBill(Booking booking) {
        double rate = booking.getBedroom().getNightlyRate();
        int nights = booking.getNightsBooked();
        return rate * nights;
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        this.diningRooms.put(diningRoom.getName(), diningRoom);
    }
}
