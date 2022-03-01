package calc;

public class ClearCommand extends CalculatorCommand {
    public ClearCommand(Calculator c) {
        super(c);
    }

    private String previousDisplay = "";
    private String previousAccumulator = "";
    private String previousMemory = "";


    public void execute() {
        previousAccumulator = calculator.getAccumulator();
        previousDisplay = calculator.getDisplay();
        previousMemory = calculator.getMemory();
        calculator.clear();
    }

    public void unexecute() {
        calculator.setDisplay(previousDisplay);
        calculator.setAccumulator(previousAccumulator);
        calculator.setMemory(previousMemory);
    }
}
