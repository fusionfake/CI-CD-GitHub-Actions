public class Calculator {

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int mult(int num1, int num2) {
        return num1 * num2;
    }

    public int div(int num1, int num2) {
        if(num2 != 0) {
            return num1 / num2;
        }
        else {
            throw new ArithmeticException("Não é possível dividir por zero");
        }
    }
}
