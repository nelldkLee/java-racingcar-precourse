package racinggame;

public class Car {
    private String name;

    public Car(String name) {
        validNameSize(name);
    }

    private void validNameSize(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
        }
    }
}
