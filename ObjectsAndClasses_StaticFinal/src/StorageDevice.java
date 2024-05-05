package src;

public class StorageDevice {
    private final StorageDeviceType type;
    private final int memoryCapacity;
    private final int weight;

    public StorageDevice(StorageDeviceType type, int memoryCapacity, int weight) {
        this.type = type;
        this.memoryCapacity = memoryCapacity;
        this.weight = weight;
    }

    public StorageDeviceType getType() {
        return type;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return type + ", " + memoryCapacity + ", " + weight;
    }
}
