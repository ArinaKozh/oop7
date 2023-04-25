public class CalcLoggerFactory implements ICalculableFactory{
    private Loggable loggable;

    public CalcLoggerFactory(Loggable loggable) {
        this.loggable = loggable;
    }

    @Override
    public Calculable create(int a, int b) {
        return new CalcLogger(new Calculator(new ComplexNumber(a, b)), loggable);
    }
}
