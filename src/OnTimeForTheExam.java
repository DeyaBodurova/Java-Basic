import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hourExam = Integer.parseInt(sc.nextLine());
        int minutesExam = Integer.parseInt(sc.nextLine());
        int hourArrival = Integer.parseInt(sc.nextLine());
        int minutesArrival = Integer.parseInt(sc.nextLine());
        int totalMinExam = hourExam * 60 + minutesExam;
        int totalMinArrival = hourArrival * 60 + minutesArrival;
        int difference;
        if (totalMinArrival < (totalMinExam - 30)) {
            System.out.println("Early");
            difference = totalMinExam - totalMinArrival;
            if (difference < 60) {
                System.out.printf("%d minutes before the start", difference);
            } else {
                int min;
                min = difference % 60;
                difference = difference / 60;
                if (min > 9) {
                    System.out.printf("%d:%d hours before the start", difference, min);
                } else {
                    System.out.printf("%d:0%d hours before the start", difference, min);
                }
            }
        } else if (((totalMinExam - 30) <= totalMinArrival) && !(totalMinArrival > totalMinExam)) {
            System.out.println("On time");
            if (totalMinArrival != totalMinExam) {
                int min = totalMinExam - totalMinArrival;
                System.out.printf("%d minutes before the start", min);
            }
        } else if (totalMinArrival > totalMinExam) {
            System.out.println("Late");
            difference = totalMinArrival - totalMinExam;
            if (difference < 60) {
                System.out.printf("%d minutes after the start", difference);
            } else {
                int min;
                min = difference % 60;
                difference = difference / 60;
                if (min > 9) {
                    System.out.printf("%d:%d hours after the start", difference, min);
                } else {
                    System.out.printf("%d:0%d hours after the start", difference, min);
                }
            }
        }
    }
}