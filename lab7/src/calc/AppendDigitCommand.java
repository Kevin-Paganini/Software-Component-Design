package calc;

import java.math.BigInteger;

public class AppendDigitCommand extends CalculatorCommand {
    private boolean previousNewNumber = false;
    private String previousDisplay;
    private char previousChar;


    public AppendDigitCommand(Calculator c, char newChar) {
        super(c);
        previousChar = newChar;
    }

    public void execute() {
        previousDisplay = calculator.getDisplay();
        previousNewNumber = calculator.getNewNumber();
        calculator.appendDigit(previousChar);



    }

    public void unexecute() {

        calculator.setDisplay(previousDisplay);
        calculator.setReadyForNewNumber(previousNewNumber);
    }
}
