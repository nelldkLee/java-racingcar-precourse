package racinggame;

import nextstep.utils.Console;

public class RacingGameController {

    private RacingGameView racingGameView;
    private RacingGameService racingGameService;

    public RacingGameController() {
        this.racingGameView = new RacingGameView();
    }

    private void init() {
        System.out.println(RacingGameMessage.ENTER_CAR_NAME.getMessage());
        CarGroups carGroups = new CarGroups(Console.readLine());

        System.out.println(RacingGameMessage.ENTER_REPEAT_COUNT.getMessage());
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
