package src;

public class Processor {
    private final double frequency;
    private final int numberCores;
    private final String manufacturer;
    private final int weight;

    public Processor(double frequency, int numberCores, String manufacturer, int weight) {
        this.frequency = frequency;
        this.numberCores = numberCores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getNumberCores() {
        return numberCores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return frequency + ", " + numberCores + ", " + manufacturer + ", " + weight;
    }
}
