package racinggame;

import java.util.ArrayList;
import java.util.List;

public class CarGroups {

    private List<Car> cars = new ArrayList<>();

    public CarGroups(List<Car> cars) {
        this.cars = cars;
    }

    public CarGroups(String inputData) {
        String[] carNames = inputData.split(RacingGameMessage.COMMA.getMessage());
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
    }

    public List<String> move() {
        List<String> result = new ArrayList<>();
        for (Car car : cars) {
            car.move();
            result.add(car.toString());
        }
        return result;
    }

    public List<Car> getFarthestCars() {
        List<Car> farthestCars = new ArrayList<>();
        int farthestPosition = getFarthestPosition();

        for (Car car : cars) {
            addFarthestCars(farthestCars, farthestPosition, car);
        }
        return farthestCars;
    }

    private void addFarthestCars(List<Car> farthestCars, int farthestPosition, Car car) {
        if (car.getPosition() == farthestPosition) farthestCars.add(car);
    }

    private int getFarthestPosition() {
        int farthestPosigion = 0;
        for (Car car : cars) {
            farthestPosigion = Math.max(farthestPosigion, car.getPosition());
        }
        return farthestPosigion;
    }

    public int getCarsSize() {
        return cars.size();
    }
}
