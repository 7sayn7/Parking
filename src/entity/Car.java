package entity;

import managers.ParkingLotManager;

import java.util.Random;

public class Car {
    int number;
    int countOfSteps;
    static Random random = new Random();

    public Car(int countOfSteps) {
        this.number = generateNumber();
        this.countOfSteps = countOfSteps;
    }

    public int generateNumber() {
        boolean isUniq = false;
        int a = 0;
        while (!isUniq) {
            a = random.nextInt(9000) + 1000;
            for (int i = 0; i < ParkingLotManager.parking.cars.length; i++) {
                if (a == ParkingLotManager.parking.cars[i].getNumber()) {
                    break;
                }
                if (i == ParkingLotManager.parking.cars.length - 1) {
                    isUniq = true;
                }
            }
        }
        return a;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCountOfSteps() {
        return countOfSteps;
    }

    public void setCountOfSteps(int countOfSteps) {
        this.countOfSteps = countOfSteps;
    }
}