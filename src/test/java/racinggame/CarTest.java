package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class CarTest {

    @Test
    @DisplayName("자동차 이름은 5자 이하가 아닐 경우 에러 발생 여부 확인")
    void isCarNameSize5Under() {
        assertThrows(IllegalArgumentException.class, () -> new Car("abcdef"));
    }

}
