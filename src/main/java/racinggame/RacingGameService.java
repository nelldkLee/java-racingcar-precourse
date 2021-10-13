package racinggame;

import java.util.ArrayList;
import java.util.List;

public class RacingGameService {

    private CarGroups carGroups;
    private RepeatCount repeatCount;

    public RacingGameService(CarGroups carGroups, RepeatCount repeatCount) {
        this.carGroups = carGroups;
        this.repeatCount = repeatCount;
    }

    public List<List<String>> play() {
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < repeatCount.getCount(); i++) {
            result.add(carGroups.move());
        }
        return result;
    }

    public List<String> playResult() {
        List<String> result = new ArrayList<>();
        List<Car> farthestCars = carGroups.getFarthestCars();
        StringBuilder builder = new StringBuilder();
        for (Car farthestCar : farthestCars) {
            if (builder.length() > 0) {
                builder.append(",");
            }
            builder.append(farthestCar.getName());
        }
        result.add(String.format("최종 우승자는 %s 입니다.", builder.toString()));
        return result;
    }
}
