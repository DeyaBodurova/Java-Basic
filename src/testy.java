import java.util.Scanner;

public class testy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String actorName= sc.nextLine();
        double academyPoints = Double.parseDouble(sc.nextLine());
        int jury = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < jury; i++) {
            String judgeName =sc.nextLine();
            double juryPoints = Double.parseDouble(sc.nextLine());

        }
    }
}
