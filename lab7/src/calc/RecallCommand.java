package calc;

public class RecallCommand extends CalculatorCommand {
    public RecallCommand(Calculator c) {
        super(c);
    }

    private String previousDisplay = "";

    public void execute() {
        previousDisplay = calculator.getDisplay();
        calculator.recallFromMemory();
    }

    public void unexecute() {
        calculator.setDisplay(previousDisplay);
    }
}
