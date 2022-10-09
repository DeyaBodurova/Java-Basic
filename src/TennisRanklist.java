import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tournaments = Integer.parseInt(sc.nextLine());
        int beginingPoints = Integer.parseInt(sc.nextLine());
        int points = beginingPoints;
        for (int i = 0; i < tournaments; i++) {
            String stage = sc.nextLine();
            switch (stage){
                case "W":
                    points+=2000;
                    break;
                case "F":
                    points+=1200;
                    break;
                case "SF":
                    points+=720;
                    break;
            }
        }
        int avg = (points- beginingPoints)/tournaments;
        System.out.printf("Final points: %d\n",points);
        System.out.printf("Average points: %d\n",avg);
        System.out.println();
    }
}
