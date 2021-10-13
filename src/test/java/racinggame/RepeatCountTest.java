package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class RepeatCountTest {

    @Test
    @DisplayName("주어진 회수가 0이하 일 경우 에러 발생 여부 확인")
    void isRepeatCount0Under() {
        assertThrows(IllegalArgumentException.class, () -> new RepeatCount(-1));
    }
}
