public class MethodExamples {
    
}

class Calculator {
    public enum Operator {
        PLUS,
        MINUS,
        MULTIPLY,
        DIVIDE,
        ABS_VAL
    }
    private double operand1;
    private double operand2;
    private double result;
    public Calculator() {
        operand1 = 0;
    }
    public Calculator(double a, Operator action) {
        operand1 = a;
        result = 0.0;
        if(action == Operator.ABS_VAL)
            result = abs(operand1);
    }
    public Calculator(double a, double b, Operator action) {
        operand1 = a;
        operand2 = b;
        result = 0.0;
        if(action == Operator.PLUS)
            result = add(operand1, operand2);
        else if(action == Operator.MINUS)
            result = subtract(operand1, operand2);
        else if(action == Operator.MULTIPLY)
            result = multiply(operand1, operand2);
        else if(action == Operator.DIVIDE && operand2 != 0.0)
            result = divide(operand1, operand2);
    }
    public double getResult() {
        return result;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        return a / b;
    }
    public static double abs(double a) {
        if(a >= 0.0)
            return a;
        return -a;
    }
}