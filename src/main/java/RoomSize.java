public enum RoomSize {
    SMALL(50),
    MEDIUM(100),
    LARGE(200);

    private final int maxCapacity;

    RoomSize(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return this.maxCapacity;
    }
}
