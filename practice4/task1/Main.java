package ru.mirea.lab4.task1;

public class Main {
    private enum Season {
        SPRING(15),
        SUMMER(30),
        AUTUMN(20),
        WINTER(0);

        private final int averageTemperature;

        Season(int averageTemperature) {
            this.averageTemperature = averageTemperature;
        }

        public int getTemperature() {
            return averageTemperature;
        }

        public String getDescription() {
            if (this == SUMMER) {
                return "Теплое время года";
            }
            return "Холодное время года";
        }
    }

    public static void main(String[] args) {
        Season seasonFav = Season.WINTER;
        System.out.println("Время года: " + seasonFav + ", со средней температурой " + seasonFav.getTemperature() +
                ", и описанием: " + seasonFav.getDescription());
        printSeasonInfo(seasonFav);

        for (Season season : Season.values()) {
            System.out.println(season + ":");
            System.out.println("Средняя температура: " + season.getTemperature());
            System.out.println("Описание: " + season.getDescription());
            System.out.println();
        }
    }

    private static void printSeasonInfo(Season season) {
        switch (season) {
            case SPRING:
                System.out.println("Я люблю весну.");
                break;
            case SUMMER:
                System.out.println("Я люблю лето.");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень.");
                break;
            case WINTER:
                System.out.println("Я люблю зиму.");
                break;
            default:
                System.out.println("Я что-то люблю.");
        }
    }
}
