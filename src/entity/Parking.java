package entity;

public class Parking {
    int countOfSlots;
    Car[] cars;

    public Parking(int countOfSlots) {
        this.countOfSlots = countOfSlots;
        this.cars = new Car[countOfSlots];
    }

    public int getCountOfSlots() {
        return countOfSlots;
    }
}
