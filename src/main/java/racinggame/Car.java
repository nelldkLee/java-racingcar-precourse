package racinggame;

import nextstep.utils.Randoms;

import static nextstep.utils.Randoms.pickNumberInRange;

public class Car {
    public static final String VALID_MSG_CAR_NAME_SIZE = "자동차 이름은 5자 이하만 가능합니다.";
    private String name;
    private int position;

    public Car(String name) {
        validateNameSize(name);
        this.name = name;
    }

    private void validateNameSize(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(VALID_MSG_CAR_NAME_SIZE);
        }
    }

    public void move() {
        if (Randoms.pickNumberInRange(0, 9) >= 4) position++;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < position; i++) {
            builder.append("-");
        }
        return name + " : " + builder.toString();
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
