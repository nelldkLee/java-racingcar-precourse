package racinggame;

import nextstep.utils.Console;

import java.util.List;

public class RacingGame {

    private CarGroups carGroups;
    private int count;

    private void init() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        this.carGroups = new CarGroups(Console.readLine());

        System.out.println("시도할 회수는 몇회인가요?");
        this.count = Integer.parseInt(Console.readLine());
    }

    public void start() {
        try {
            init();
            play();
            destroy();
        } catch (NumberFormatException e) {
            printError(e.getMessage());
        } catch (IllegalArgumentException e) {
            printError(e.getMessage());
        }
    }

    private void destroy() {

    }

    private void play() {
        for (int i = 0; i < count; i++) {
            printList(carGroups.move());
        }
    }

    private void printMessage(String message) {
        System.out.println(message);
    }

    private void printList(List<String> messages) {
        for (String message : messages) {
            printMessage(message);
        }
        printMessage("");
    }

    private void printError(String message) {
        printMessage("[ERROR] " + message);
    }


}
