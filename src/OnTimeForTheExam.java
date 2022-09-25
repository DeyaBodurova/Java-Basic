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

        int difference=0;
        if(totalMinArrival < totalMinExam) {
            System.out.println("Early");
            difference = totalMinExam - totalMinArrival;
            if (difference <= 60) {
                System.out.printf("0:%d hours before the start", difference);
            } else {
                int min = 0;
                min = difference % 60;
                difference = difference / 60;
                System.out.printf("%d:%d hours before the start",
                        difference,min);
            }
        }
    }
}
