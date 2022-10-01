import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine());
        double washingMachinePrice = Double.parseDouble(sc.nextLine());
        int toyPrice = Integer.parseInt(sc.nextLine());
        int toysCounter = 0;
        int birthdayMoney = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                birthdayMoney += (i * 5)-1;
            } else {
                toysCounter++;
            }
        }
        double moneyForToys = toysCounter * toyPrice;
        double saveMoney = moneyForToys + birthdayMoney;
        if(washingMachinePrice <= saveMoney){
            System.out.printf("Yes! %.2f",Math.abs(saveMoney - washingMachinePrice));
        } else {
            System.out.printf("No! %.2f", Math.abs(washingMachinePrice-saveMoney));
        }
    }
}
