import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double age = Double.parseDouble(sc.nextLine());
        String gender = sc.nextLine();
        if (age < 16) {
            switch (gender) {
                case "m" -> System.out.println("Master");
                case "f" -> System.out.println("Miss");
            }
        } else {
            switch (gender) {
                case "m" -> System.out.println("Mr.");
                case "f" -> System.out.println("Ms.");
            }
        }
    }
}
