import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double moneyNeeded = Double.parseDouble(sc.nextLine());
        double money = Double.parseDouble(sc.nextLine());
        int countSpendOnARoad = 0;
        int days=0;
        boolean isEnoughMoney =false;
        while (money<=moneyNeeded) {
            String action = sc.nextLine();
            double saveSpend = Double.parseDouble(sc.nextLine());
            days++;
            if (action.equals("spend")) {
                countSpendOnARoad++;
                money-=saveSpend;
                if(countSpendOnARoad>=5){
                    break;
                }
            } else {
                money+=saveSpend;
                if(money>=moneyNeeded){
                    isEnoughMoney = true;
                }
                countSpendOnARoad=0;
            }
        }
        if(isEnoughMoney){
            System.out.printf("You saved the money for " +
                    "%d days.",days);
        } else {
            System.out.println("You can't save the money.");
            System.out.println(days);
        }
    }
}
