package racinggame;

import java.util.List;

public class RacingGameView {

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printList(List<List<String>> results) {
        for (List<String> messages : results) {
            for (String message : messages) {
                printMessage(message);
            }
            printMessage("");
        }
    }

    public void printError(String message) {
        printMessage("[ERROR] " + message);
    }
}
