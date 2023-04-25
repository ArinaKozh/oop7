public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int a, int b) {
        ComplexNumber CN = new ComplexNumber(a, b);
        return new Calculator(CN);
    }
}
