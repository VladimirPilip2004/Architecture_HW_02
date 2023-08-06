package Decorator;

public class Main {

    public static void main(String[] args) {

        Bike bike = new Bike("Honda CBR600");
        TuningBike BikeWrap = new TuningBike(bike);

        System.out.println("Выводим настройки мотоцикла");
        printAutoSpecifications(bike);

        System.out.println();

        System.out.println("Выводим настройки мотоцикла с изменениями");
        printAutoSpecifications(BikeWrap);
    }

    public static void printAutoSpecifications(Bike Bike) {
        System.out.println(Bike.getName());
        System.out.println("Мощность " + Bike.getPower());
        System.out.println("Скорость " + Bike.getSpeed());
    }
}