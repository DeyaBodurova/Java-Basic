import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String figure = sc.nextLine();
        double area;
        switch (figure) {
            case "square":
                double length = Double.parseDouble(sc.nextLine());
                area = length * length;
                break;
            case "rectangle":
                double a = Double.parseDouble(sc.nextLine());
                double b = Double.parseDouble(sc.nextLine());
                area = a * b;
                break;
            case "circle":
                double radius = Double.parseDouble(sc.nextLine());
                area = Math.PI * (radius * radius);
                break;
            case "triangle":
                double c = Double.parseDouble(sc.nextLine());
                double d = Double.parseDouble(sc.nextLine());
                area = (c * d) / 2;
                break;
        }
        System.out.printf("%.3f",area);
    }
}
