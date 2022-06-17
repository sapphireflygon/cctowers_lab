import java.util.ArrayList;

public class Bedroom extends Room {

    private RoomType roomType;
    private int roomNumber;
    private double nightlyRate;


    public Bedroom(int roomNumber, RoomType roomType, double nightlyRate) {
        super();
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }
}

