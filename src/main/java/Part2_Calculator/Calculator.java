package Part2_Calculator;

public class Calculator {
    private double a;
    private double b;
    private char operation;

    private char[] validOps = {'+', '-', '*', '/'};


    public Calculator(double a, double b, char operation) {
        boolean isValid=false;
        for (char op:validOps){
            if (op==operation){
                isValid=true;
                break;
            }
        }

        if (!isValid) {
            throw new IllegalArgumentException("Invalid operation");
        }
        if (operation == '/' && b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public double calculate(){
        return switch (operation){
            case '+'->a+b;
            case '-'->a-b;
            case '*'->a*b;
            case '/'->a/b;
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        };
    }
}
