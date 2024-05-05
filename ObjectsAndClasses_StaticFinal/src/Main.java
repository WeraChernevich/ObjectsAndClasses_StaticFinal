package src;

import java.security.Key;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(2.6, 6, "Intel", 7000);
        SystemMemory systemMemory = new SystemMemory("DIMM", 64, 200);
        StorageDevice storageDevice = new StorageDevice(StorageDeviceType.SDD, 16, 500);
        Screen screen = new Screen(23.8, ScreenType.IPS, 3000);
        Keyboard keyboard = new Keyboard("Беспроводная", BacklightType.YES, 53);
        Computer computer = new Computer("iRU Game", "310H5GMA");
        computer.setProcessor(processor);
        computer.setSystemMemory(systemMemory);
        computer.setStorageDevice(storageDevice);
        computer.setScreen(screen);
        computer.setKeyboard(keyboard);

        System.out.println("Общий вес компьютера: " + computer.calcTotalWeight());

        System.out.println(computer.toString());

    }
}
