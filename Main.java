public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalcLoggerFactory(new Logger());
        View view = new View(calculableFactory);
        view.run();
    }
}
