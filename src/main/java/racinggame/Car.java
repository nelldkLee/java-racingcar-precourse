package racinggame;

import nextstep.utils.Randoms;

import static nextstep.utils.Randoms.pickNumberInRange;

public class Car {
    private String name;
    private int position;

    public Car(String name) {
        validNameSize(name);
        this.name = name;
    }

    private void validNameSize(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
        }
    }

    public void move() {
        if (Randoms.pickNumberInRange(0,9) >= 4) position++;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < position; i++) {
            builder.append("-");
        }
        return name + " : " + builder.toString();
    }
}
