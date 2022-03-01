package calc;

public class PlusCommand extends CalculatorCommand {
    public PlusCommand(Calculator c) {
        super(c);
    }
    private String previousDisplay = "";
    private String previousAccumulator = "";

    public void execute() {
        previousAccumulator = calculator.getAccumulator();
        previousDisplay = calculator.getDisplay();
        calculator.plus();
    }

    public void unexecute() {
        calculator.setDisplay(previousDisplay);
        calculator.setAccumulator(previousAccumulator);
    }
}
