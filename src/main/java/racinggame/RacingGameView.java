package racinggame;

import java.util.List;

public class RacingGameView {

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printListInList(List<List<String>> results) {
        for (List<String> messages : results) {
            printList(messages);
            printMessage(RacingGameMessage.EMPTY.getMessage());
        }
    }

    public void printList(List<String> messages) {
        for (String message : messages) {
            printMessage(message);
        }
    }

    public void printError(String message) {
        printMessage(String.format(RacingGameMessage.ERROR_PREFIX_FORMAT.getMessage(), message));
    }
}
