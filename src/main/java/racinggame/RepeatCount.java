package racinggame;

public class RepeatCount {
    private final int count;

    public RepeatCount(int count) {
        validatePositive(count);
        this.count = count;
    }

    private void validatePositive(int count) {
        if (count <= 0) {
            throw new IllegalArgumentException(String.format(RacingGameMessage.ENTER_POSITIVE_NUMBER.getMessage(), count));
        }
    }

    public int getCount() {
        return count;
    }
}
