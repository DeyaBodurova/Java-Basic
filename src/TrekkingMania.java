import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int groups = Integer.parseInt(sc.nextLine());
        double musalaPercent;
        double monblanPercent;
        double kilimangaroPercent;
        double k2Percent;
        double everestPercent;
        for (int i = 0; i < groups; i++) {
            int peopleInGroup = Integer.parseInt(sc.nextLine());
            if(peopleInGroup <= 5){
                monblanPercent
            } else if(peopleInGroup <= 12) {
                monblanPercent
            } else if(peopleInGroup <=25) {
                kilimangaroPercent
            } else if(peopleInGroup <=40){
                k2Percent
            } else if(peopleInGroup > 40){
                everestPercent
            }
        }
    }
}
