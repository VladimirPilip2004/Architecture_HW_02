package Decorator;

public class TuningBike extends Bike{

    private Bike BikeOriginal;

    public TuningBike(Bike bike) {

        super(bike.getName());
        this.BikeOriginal = bike;
    }

    @Override
    public String getName() {
        return BikeOriginal.getName() + " Настройка ";
    }

    @Override
    public void setName(String name) {
        BikeOriginal.setName(name);
    }

    @Override
    public int getPower() {
        return BikeOriginal.getPower() + 100;
    }

    @Override
    public void setPower(int power) {
        BikeOriginal.setPower(power);
    }

    @Override
    public int getSpeed() {
        return BikeOriginal.getSpeed() + 20;
    }

    @Override
    public void setSpeed(int speed) {
        BikeOriginal.setSpeed(speed);
    }
}