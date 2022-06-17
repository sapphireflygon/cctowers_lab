import java.util.ArrayList;

public class ConferenceRoom extends Room{

    private String name;
    private boolean catered;
    private RoomSize roomSize;

    public ConferenceRoom(String name, boolean catered, RoomSize roomSize) {
        super();
        this.name = name;
        this.catered = catered;
        this.roomSize = roomSize;
    }

    public String getName() {
        return this.name;
    }

    public boolean isCatered() {
        return this.catered;
    }

    public RoomSize getRoomSize() {
        return this.roomSize;
    }
}
