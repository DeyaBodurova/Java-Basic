import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = sc.nextLine();
        String passwordAttempt = sc.nextLine();
        while (!passwordAttempt.equals(password)) {
            passwordAttempt=sc.nextLine();
        }
        System.out.printf("Welcome %s!",username);

    }

}
