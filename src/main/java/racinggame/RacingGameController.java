package racinggame;

import nextstep.utils.Console;

public class RacingGameController {

    private RacingGameView racingGameView;
    private RacingGameService racingGameService;

    public RacingGameController() {
        this.racingGameView = new RacingGameView();
    }

    private void init() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        CarGroups carGroups = new CarGroups(Console.readLine());

        System.out.println("시도할 회수는 몇회인가요?");
        RepeatCount repeatCount = new RepeatCount(Integer.parseInt(Console.readLine()));
        this.racingGameService = new RacingGameService(carGroups, repeatCount);
    }

    public void start() {
        try {
            init();
            racingGameView.printListInList(racingGameService.play());
            racingGameView.printList(racingGameService.playResult());
        } catch (NumberFormatException e) {
            racingGameView.printError(e.getMessage());
            start();
        } catch (IllegalArgumentException e) {
            racingGameView.printError(e.getMessage());
            start();
        }
    }
}
