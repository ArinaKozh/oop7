import java.util.Scanner;

public class View {

    private ICalculableFactory calculableFactory;

    public View(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            Calculable calculator = calculableFactory.create(promptInt("Введите a:"), promptInt("Введите b:"));
            while (true) {
                String cmd = prompt("Введите команду (*, +, =) : ");
                if (cmd.equals("*")) {
                    calculator.multi(inputCN());
                    continue;
                }
                if (cmd.equals("+")) {
                    calculator.sum(inputCN());
                    continue;
                }
                if (cmd.equals("=")) {
                    System.out.println("Результат: "+calculator.getResult().toString());
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Yes/No)?");
            if (cmd.toLowerCase().equals("yes")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
    private ComplexNumber inputCN(){
        int a = promptInt("Введите a:");
        int b = promptInt("Введите b:");
        return new ComplexNumber(a,b);
    }
}
