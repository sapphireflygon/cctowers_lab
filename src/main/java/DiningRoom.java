import java.util.ArrayList;

public class DiningRoom extends Room {

    private String name;
    private int capacity;

    public DiningRoom(String name, int capacity) {
        super();
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
