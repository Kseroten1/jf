package pl.gdynia.amw.oop.lab6.calendar.filters;

import pl.gdynia.amw.oop.lab6.calendar.events.Event;

import java.util.Scanner;

public class KeyWordFilter implements Filter {
    private String keyWord;

    @Override
    public KeyWordFilter getUserInput(Scanner scanner) {
        System.out.println("Provide keyWord: ");
        keyWord = scanner.useDelimiter("\n").next();
        return this;
    }

    @Override
    public boolean meetsRequirements(Event event) {
        return event.toString().toLowerCase().contains(keyWord.trim().toLowerCase());
    }
}
