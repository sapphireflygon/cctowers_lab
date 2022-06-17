import java.util.ArrayList;
import java.util.Objects;

public abstract class Room {

    private ArrayList<Guest> guests;

    public Room() {
        this.guests = new ArrayList<>();
    }

    public int getGuestCount() {
        return this.guests.size();
    }

    public void addGuestToRoom(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuestFromRoom(Guest selectedGuest){
        ArrayList<Guest> copyList = this.guests;
        if (this.getGuestCount() != 0) {
            for (Guest guest : copyList) {
                if (Objects.equals(guest.getName(), selectedGuest.getName())) {
                    int index = guests.indexOf(guest);
                    copyList.remove(index);
                    break;
                }
            }
        }
        this.guests = copyList;
    }

    public static double getRoomSize(double length, double width) {
        return length * width;
    }
}
