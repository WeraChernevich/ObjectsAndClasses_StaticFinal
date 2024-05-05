package src;

public class Keyboard {
    private final String type;
    private final BacklightType isBacklight;
    private final int weight;

    public Keyboard(String type, BacklightType isBacklight, int weight) {
        this.type = type;
        this.isBacklight = isBacklight;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public BacklightType getIsBacklight() {
        return isBacklight;
    }

    public int getWeight() {
        return weight;
    }
    public String toString() {
        return type + "-" + isBacklight + ":" + weight;
    }
}
