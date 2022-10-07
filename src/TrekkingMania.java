import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int groups = Integer.parseInt(sc.nextLine());
        int musalaCount =0;
        int monblanCount=0;
        int kilimangaroCount=0;
        int k2Count=0;
        int everestCount=0;
        for (int i = 0; i < groups; i++) {
            int peopleInGroup = Integer.parseInt(sc.nextLine());
            if(peopleInGroup <= 5){
                musalaCount++;
            } else if(peopleInGroup <= 12) {
                monblanCount++;
            } else if(peopleInGroup <=25) {
                kilimangaroCount++;
            } else if(peopleInGroup <=40){
                k2Count++;
            } else if(peopleInGroup > 40){
                everestCount++;
            }
        }
    }
}
