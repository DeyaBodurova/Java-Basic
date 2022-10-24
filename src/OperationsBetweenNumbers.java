import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        String operator = sc.nextLine();
        double result;
        switch (operator) {
            case "+":
                if ((a + b) % 2 == 0) {
                    System.out.printf("%d + %d = %d - even", a, b, a + b);
                } else {
                    System.out.printf("%d + %d = %d - odd", a, b, a + b);
                }
                break;
            case "-":
                if ((a - b) % 2 == 0) {
                    System.out.printf("%d - %d = %d - even", a, b, a - b);
                } else {
                    System.out.printf("%d - %d = %d - odd", a, b, a - b);
                }
                break;
            case "*":
                if ((a * b) % 2 == 0) {
                    System.out.printf("%d * %d = %d - even", a, b, a * b);
                } else {
                    System.out.printf("%d * %d = %d - odd", a, b, a * b);
                }
                break;
            case "/":
                if (b == 0) {
                    System.out.printf("Cannot divide %d by zero", a);
                    break;
                }
                result = (a * 1.0) / (b * 1.0);
                System.out.printf("%d / %d = %.2f", a, b, result);
                break;
            case "%":
                if (b == 0) {
                    System.out.printf("Cannot divide %d by zero", a);
                    break;
                }
                System.out.println(a + " % " + b + " = " + (a % b));
                break;
        }
    }
}