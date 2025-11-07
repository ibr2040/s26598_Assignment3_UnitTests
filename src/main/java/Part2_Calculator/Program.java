package Part2_Calculator;

public class Program {
    public static void main(String[] args) {
        Calculator calc = new Calculator(10, 2, '/');
        System.out.println("Result: " + calc.calculate());
    }
}
