import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double actorsPoints = Double.parseDouble(sc.nextLine());
        int count = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < count; i++) {
            String nameFromCommission =sc.nextLine();
            double points = Double.parseDouble(sc.nextLine());
            double sumPoints = (nameFromCommission.length()
                    * points) /2;
            actorsPoints+=sumPoints;
            if(actorsPoints >= 1250.5){
                System.out.printf("Congratulations, %s got" +
                        " a nominee for leading role " +
                        "with %.2f!",name,actorsPoints);
                break;
            }

        }
        if(actorsPoints < 1250.5){
            System.out.printf("Sorry, %s you need %.2f more!",
                    name, Math.abs(1250.5-actorsPoints));
        }
    }
}
