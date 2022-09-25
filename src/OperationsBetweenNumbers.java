import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        String operator = sc.nextLine();
        double result = 0.0;
        boolean isPossible = true;
        switch (operator) {
            case "+":
                if ((a + b) % 2 == 0) {
                    System.out.println("%d + %d = %d - even");
                } else {
                    System.out.println("%d + %d = %d - odd");
                }
                break;
            case "-":
                break;
            case "*":
                break;
            case "/":
                if (b == 0) {
                    System.out.printf("Cannot divide %d by zero", a);
                    break;
                }

                break;
            case "%":
                break;
        }
    }
}
