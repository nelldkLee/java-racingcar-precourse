package racinggame;

import java.util.ArrayList;
import java.util.List;

public class CarGroups {

    private List<Car> cars = new ArrayList<>();

    public CarGroups(String inputData) {
        String[] carNames = inputData.split(",");
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
}
