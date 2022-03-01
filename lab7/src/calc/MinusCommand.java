package calc;

public class MinusCommand extends CalculatorCommand {
    public MinusCommand(Calculator c) {
        super(c);
    }
    private String previousDisplay = "";
    private String previousAccumulator = "";


    public void execute() {
        previousAccumulator = calculator.getAccumulator();
        previousDisplay = calculator.getDisplay();
        calculator.minus();
    }

    public void unexecute() {
        calculator.setAccumulator(previousAccumulator);
        calculator.setDisplay(previousDisplay);
    }
}
