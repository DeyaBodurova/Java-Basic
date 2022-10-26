import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.toLowerCase().charAt(i) == 'a') {
                count += 1;
            } else if (text.toLowerCase().charAt(i) == 'e') {
                count += 2;
            } else if (text.toLowerCase().charAt(i) == 'i') {
                count += 3;
            } else if (text.toLowerCase().charAt(i) == 'o') {
                count += 4;
            } else if (text.toLowerCase().charAt(i) == 'u') {
                count += 5;
            }
        }
        System.out.println(count);
    }
}
