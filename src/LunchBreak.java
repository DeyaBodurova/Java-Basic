import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movie = sc.nextLine();
        int timeEpisode = Integer.parseInt(sc.nextLine());
        int timeBreak = Integer.parseInt(sc.nextLine());

        double lunchTime = timeBreak / 8.0;
        double relaxTime = timeBreak / 4.0;

        double totalTime = timeBreak-(lunchTime + relaxTime);

        if(timeEpisode <= totalTime){
            System.out.printf("You have enough time to watch " +
                    "%s and left with %f" +
                    " minutes free time.", movie,
                    Math.abs(totalTime-timeEpisode));
        } else {
            System.out.printf("You don't have enough time to " +
                    "watch %s, you need " +
                    "%f more minutes.",movie,
                    Math.abs(timeEpisode-totalTime));
        }
    }
}
