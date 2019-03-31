public enum Model {

    BOEING737(215),
    BOEING747(605),
    BOEING767(375),
    BOEING777(550),
    BOEING787(330);

    public final int capacity;

    Model(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

}
