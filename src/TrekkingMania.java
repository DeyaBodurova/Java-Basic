import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int groups = Integer.parseInt(sc.nextLine());
        double musalaCount = 0;
        double monblanCount = 0;
        double kilimangaroCount = 0;
        double k2Count = 0;
        double everestCount = 0;
        int totalPeople = 0;
        for (int i = 0; i < groups; i++) {
            int peopleInGroup = Integer.parseInt(sc.nextLine());
            totalPeople += peopleInGroup;
            if (peopleInGroup <= 5) {
                musalaCount += peopleInGroup;
            } else if (peopleInGroup <= 12) {
                monblanCount += peopleInGroup;
            } else if (peopleInGroup <= 25) {
                kilimangaroCount += peopleInGroup;
            } else if (peopleInGroup <= 40) {
                k2Count += peopleInGroup;
            } else {
                everestCount += peopleInGroup;
            }
        }
        double sum1 = (musalaCount / totalPeople) * 100;
        double sum2 = (monblanCount / totalPeople) * 100;
        double sum3 = (kilimangaroCount / totalPeople) * 100;
        double sum4 = (k2Count / totalPeople) * 100;
        double sum5 = (everestCount / totalPeople) * 100;
        System.out.printf("%.2f%%\n", (musalaCount / totalPeople) * 100);
        System.out.printf("%.2f%%\n", sum2);
        System.out.printf("%.2f%%\n", sum3);
        System.out.printf("%.2f%%\n", sum4);
        System.out.printf("%.2f%%\n", sum5);
    }
}
