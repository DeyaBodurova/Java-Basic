import java.util.Scanner;

public class testy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String actorName= sc.nextLine();
        double academyPoints = Double.parseDouble(sc.nextLine());
        int jury = Integer.parseInt(sc.nextLine());
        boolean isSucceeded = false;

        for (int i = 0; i < jury; i++) {
            String judgeName =sc.nextLine();
            double juryPoints = Double.parseDouble(sc.nextLine());
            academyPoints += (judgeName.length() * juryPoints)/2;
            if(academyPoints > 1250.5){
                isSucceeded = true;
                return;
            }
        }
        if(isSucceeded){
            System.out.printf("Congratulations, %s got a nominee" +
                    " for leading role with %.0f!", actorName,
                   academyPoints);
        } else {
            System.out.printf("Sorry, %s you need %.0f more!",
                    actorName, 1250.5 - academyPoints);
        }
    }
}
