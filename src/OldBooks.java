import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String input = sc.nextLine();
        int countBooks = 0;
        boolean isFound = false;
        while (!input.equals("No More Books")) {
            if (input.equals(title)) {
                isFound = true;
                break;
            }
            countBooks++;
            input = sc.nextLine();
        }
        if (!isFound) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countBooks);
        } else {
            System.out.printf("You checked %d books and found it.", countBooks);
        }
    }
}