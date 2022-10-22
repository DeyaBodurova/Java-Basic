import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double under200 = 0;
        double under399 = 0;
        double under599 = 0;
        double under799 = 0;
        double above800 = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.nextLine());
            if (a < 200) {
                under200++;
            } else if (a <= 399) {
                under399++;
            } else if (a <= 599) {
                under599++;
            } else if (a <= 799) {
                under799++;
            } else {
                above800++;
            }
        }
        double b = (under200 / n) * 100;
        System.out.println(String.format("%.2f", b) + "%");
        double c = (under399 / n) * 100;
        System.out.println(String.format("%.2f", c) + "%");
        double d = (under599 / n) * 100;
        System.out.println(String.format("%.2f", d) + "%");
        double f = (under799 / n) * 100;
        System.out.println(String.format("%.2f", f) + "%");
        double g = (above800 / n) * 100;
        System.out.println(String.format("%.2f", g) + "%");
    }
}