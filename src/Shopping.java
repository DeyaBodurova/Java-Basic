import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        int videoCardsCount= Integer.parseInt(sc.nextLine());
        int CPUCount= Integer.parseInt(sc.nextLine());
        int RAMCount= Integer.parseInt(sc.nextLine());

        double videoPrice = videoCardsCount * 250.0;
        double cpuPrice = CPUCount * (videoPrice*0.35);
        double ramPrice = RAMCount * (videoPrice*0.1);

        if(){}
    }
}
