package ru.mirea.lab4.task4;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel i7", 4.2);
        Memory memory = new Memory(32, "DDR5");
        Monitor monitor = new Monitor("ASUS VG279Q", 27);

        Computer computer = new Computer(ComputerBrand.MSI, processor, memory, monitor);

        System.out.printf("Марка: %s%n", computer.getBrand());
        System.out.printf("Процессор: %s (%.1f ГГц)%n", computer.getProcessor().getModel(), computer.getProcessor().getSpeedInGHz());
        System.out.printf("Оперативная память: %dГБ %s%n", computer.getMemory().getSizeInGB(), computer.getMemory().getType());
        System.out.printf("Монитор: %s (диагональ %.1f)%n", computer.getMonitor().getModel(), computer.getMonitor().getSizeInInches());
    }
}