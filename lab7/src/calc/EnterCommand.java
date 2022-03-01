package calc;

public class EnterCommand extends CalculatorCommand {
    public EnterCommand(Calculator c) {
        super(c);
    }

    private String previousAccumulator = "";

    public void execute() {
        previousAccumulator = calculator.getAccumulator();
        calculator.enter();
    }

    public void unexecute() {
        calculator.setAccumulator(previousAccumulator);
    }
}
