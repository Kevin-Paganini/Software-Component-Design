package calc;

public class SaveCommand extends CalculatorCommand {
    public SaveCommand(Calculator c) {
        super(c);
    }
    private String previousAccumulator;
    private String previousMemory;
    private boolean readyForNew = false;

    public void execute() {
        previousAccumulator = calculator.getAccumulator();
        previousMemory = calculator.getMemory();
        readyForNew = true;
        calculator.saveToMemory();
    }

    public void unexecute() {
        calculator.setAccumulator(previousAccumulator);
        calculator.setMemory(previousMemory);
        calculator.setReadyForNewNumber(readyForNew);
    }
}
