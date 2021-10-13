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
            addComma(builder);
            builder.append(farthestCar.getName());
        }
        result.add(String.format(RacingGameMessage.RACING_WINNER_FORMAT.getMessage(), builder.toString()));
        return result;
    }

    private void addComma(StringBuilder builder) {
        if (builder.length() > 0) {
            builder.append(RacingGameMessage.COMMA.getMessage());
        }
    }
}
