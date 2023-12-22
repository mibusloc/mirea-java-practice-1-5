package ru.mirea.lab4_1.task2;

public class Phone {
    private final String number;
    private final String model;
    private final double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0.0);
    }

    public Phone() {
        this("None", "None", 0.0);
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + " (" + callerNumber + ")");
    }

    public void sendMessage(String... numbers) {
        System.out.print("Сообщения отправлены на номера ");
        for (String num : numbers) {
            System.out.print(num + " ");
        }
    }

    public double getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }
}