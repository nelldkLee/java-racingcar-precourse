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
}
