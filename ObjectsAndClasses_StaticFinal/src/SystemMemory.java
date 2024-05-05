package src;

public class SystemMemory {
    private final String type;
    private final int volume;
    private final int weight;

    public SystemMemory(String type, int volume, int weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public int getWeight() {
        return weight;
    }
    public String toString() {
        return type + ", " + volume + ", " + weight;
    }
}
