package src;


public class Computer {
    private Processor processor;
    private SystemMemory systemMemory;
    private StorageDevice storageDevice;
    private Screen screen;
    private Keyboard keyboard;

    private final String vendor;
    private final String name;


    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public SystemMemory getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(SystemMemory systemMemory) {
        this.systemMemory = systemMemory;
    }

    public StorageDevice getStorageDevice() {
        return storageDevice;
    }

    public void setStorageDevice(StorageDevice storageDevice) {
        this.storageDevice = storageDevice;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public double calcTotalWeight() {
        int totalWeight = 0;
        totalWeight = totalWeight + processor.getWeight();
        totalWeight = totalWeight + systemMemory.getWeight();
        totalWeight = totalWeight + storageDevice.getWeight();
        totalWeight = totalWeight + screen.getWeight();
        totalWeight = totalWeight + keyboard.getWeight();
        return totalWeight;
    }

    public String toString() {
        return "Компьютер: " + "\n"
                + "Производитель: " + vendor + "\n"
                + "Название: " + name + "\n"
                + "Процессор: " + getProcessor() + "\n"
                + "Оперативная память: " + systemMemory + "\n"
                + "Накопитель информации: " + storageDevice + "\n"
                + "Экран: " + screen + "\n"
                + "Клавиатура: " + keyboard;
    }


}
