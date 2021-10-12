package racinggame;

import nextstep.utils.Console;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private List<Car> cars = new ArrayList<>();
    private int count;

    private void init() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String inputData = Console.readLine();
        String[] carNames = inputData.split(",");
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
        System.out.println("시도할 회수는 몇회인가요?");
        String inputCount = Console.readLine();
        this.count = Integer.parseInt(inputCount);
    }

    public void start() {
        try {
            init();
        } catch (NumberFormatException e) {
            printError(e.getMessage());
        } catch (IllegalArgumentException e) {
            printError(e.getMessage());
        }
    }

    private void printError(String message) {
        System.out.println("[ERROR] " + message);
    }
}
