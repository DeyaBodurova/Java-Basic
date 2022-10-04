import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int openTabs = Integer.parseInt(sc.nextLine());
        int salary = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < openTabs; i++) {
            String website = sc.nextLine();
            switch (website) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                return;
            }
        }
        if (salary > 0) {
            System.out.println(salary);
        }
    }
}
