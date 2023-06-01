import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Operações suportadas - Soma | Subtração | Multiplicação | Divisão");

        System.out.println("Escreva dois números inteiros que deseja operar separados por virgula:");
        String numberInput = scanner.nextLine();

        System.out.println("Escreva o símbolo matemático para realizar sua operação:");
        String operationInput = scanner.nextLine();

        String[] logicOperationArray = numberInput.split(",");

        int num1 = Integer.parseInt(logicOperationArray[0].trim());
        int num2 = Integer.parseInt(logicOperationArray[1].trim());

        switch(operationInput) {
            case "+":
                System.out.println("O resultado da sua operação é: " + calc.sum(num1, num2));
                break;
            case "-":
                System.out.println("O resultado da sua operação é: " + calc.sub(num1, num2));
                break;
            case "*":
                System.out.println("O resultado da sua operação é: " + calc.mult(num1, num2));
                break;
            case "/":
                System.out.println("O resultado da sua operação é: " + calc.div(num1, num2));
                break;
            default:
                System.out.println("Operação não suportada!");
                break;
        }

        scanner.close();
    }
}
