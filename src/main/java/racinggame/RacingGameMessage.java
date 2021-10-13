package racinggame;

public enum RacingGameMessage {
    ENTER_CAR_NAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분"),
    ENTER_REPEAT_COUNT("시도할 회수는 몇회인가요?"),
    ENTER_POSITIVE_NUMBER("입력하신 회수는 %s입니다. 양수로 입력 바랍니다."),
    ENTER_LESS_THAN_5_LETTERS("자동차 이름은 5자 이하만 가능합니다."),
    RACING_WINNER_FORMAT("최종 우승자는 %s 입니다."),
    ERROR_PREFIX_FORMAT("[ERROR] %s"),
    EMPTY(""),
    COMMA(","),
    DASH("-"),
    COLON(" : ");

    private String message;

    RacingGameMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
