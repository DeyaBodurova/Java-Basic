import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double recordSec = Double.parseDouble(sc.nextLine());
        double distanceMeter = Double.parseDouble(sc.nextLine());
        double swimmingTimeMeterPerSec = Double.parseDouble(sc.nextLine());

        double swimmingTimeInSec = distanceMeter * swimmingTimeMeterPerSec;
        double slowing = distanceMeter / 15;
        double totalTime = swimmingTimeInSec + slowing;

        if(totalTime < recordSec){
            System.out.printf("Yes, he succeeded!" +
                    " The new world record is %f seconds.",totalTime);
        }
    }
}
