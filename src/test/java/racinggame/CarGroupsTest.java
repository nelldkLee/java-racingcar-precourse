package racinggame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class CarGroupsTest {

    private CarGroups carGroups;

    @BeforeEach
    void setUp() {
        carGroups = new CarGroups("test,nell,dk");
    }

    @Test
    @DisplayName("콤마가 포함된 문자열을 통한 자동차 객체 생성 개수 유효성 확인")
    void isCreateCarGroupsByComma() {
        assertThat(carGroups.getCarsSize()).isEqualTo(3);
    }

    @Test
    @DisplayName("자동차그룹의 일급콜렉션에서 가장 멀리 이동한 자동차가 2개 일 경우 확인")
    void isFarthestCarsExist() {
        carGroups = new CarGroups(
                Arrays.asList(new Car("test", 3),
                        new Car("nell", 5),
                        new Car("test", 5)));
        assertThat(carGroups.getFarthestCars().size()).isEqualTo(2);
    }


}
