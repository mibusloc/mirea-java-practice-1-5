package ru.mirea.lab4_1.task2;

import ru.mirea.lab4_1.task1.Shape;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+71234567890", "iPhone 22", 0.3);
        Phone phone2 = new Phone("70987654321", "Nokia 3340");
        Phone phone3 = new Phone();

        Phone[] phones = {phone1, phone2, phone3};

        for (int i = 0; i < phones.length; i++) {
            System.out.printf("Phone %d: номер - %s, модель - %s, вес - %s%n", i + 1, phones[i].getNumber(), phones[i].getModel(), phones[i].getWeight());
        }

        phone1.receiveCall("Саша");
        phone2.receiveCall("Второй Саша");
        phone3.receiveCall("Не Саша");

        phone1.receiveCall("Саша с телефоном", "+78987652732");

        phone1.sendMessage("+77777777777", "+74445556688");
    }
}
