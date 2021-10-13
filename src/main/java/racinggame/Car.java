package racinggame;

import nextstep.utils.Randoms;

import static nextstep.utils.Randoms.pickNumberInRange;

public class Car {

    private String name;
    private int position;

    public Car(String name) {
        validateNameSize(name);
        this.name = name;
    }

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    private void validateNameSize(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(RacingGameMessage.ENTER_LESS_THAN_5_LETTERS.getMessage());
        }
    }

    public void move() {
        if (Randoms.pickNumberInRange(0, 9) >= 4) position++;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < position; i++) {
            builder.append(RacingGameMessage.DASH.getMessage());
        }
        return name + RacingGameMessage.COLON.getMessage() + builder.toString();
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
