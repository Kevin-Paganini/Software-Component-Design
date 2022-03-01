package calc;

import java.util.Locale;

public class TimesCommand extends CalculatorCommand {

    private String previousDisplay = "";
    private String previousAccumulator = "";



    public TimesCommand(Calculator c) {
        super(c);
    }


    public void execute() {
        previousDisplay = calculator.getDisplay();
        previousAccumulator = calculator.getAccumulator();
        calculator.times();
    }

    public void unexecute() {
        calculator.setDisplay(previousDisplay);
        calculator.setAccumulator(previousAccumulator);

    }
}
