import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());

        int sum = hour + minutes;
        int newHour= sum/60;
        int newMin= sum%60;
        System.out.println(newHour+":"+newMin);
    }
}
