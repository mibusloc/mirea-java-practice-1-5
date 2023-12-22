package ru.mirea.lab4.task4;

public class Memory {
    private final int sizeInGB;
    private final String type;

    public Memory(int sizeInGB, String type) {
        this.sizeInGB = sizeInGB;
        this.type = type;
    }

    public int getSizeInGB() {
        return sizeInGB;
    }

    public String getType() {
        return type;
    }
}
