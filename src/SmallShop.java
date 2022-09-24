import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        String city = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());
        double sum = 0;
        switch (city) {
            case "Sofia":
                switch (product){
                    case "coffee":
                        sum = quantity * 0.5;
                        break;
                    case "water":
                        sum = quantity * 0.8;
                        break;
                    case "beer":
                        sum = quantity * 1.2;
                        break;
                    case "sweets":
                        sum = quantity * 1.45;
                        break;
                    case "peanuts":
                        sum = quantity * 1.6;
                        break;
                }
                break;
            case "Plovdiv":
                switch (product){
                    case "coffee":
                        sum = quantity * 0.4;
                        break;
                    case "water":
                        sum = quantity * 0.7;
                        break;
                    case "beer":
                        sum = quantity * 1.15;
                        break;
                    case "sweets":
                        sum = quantity * 1.30;
                        break;
                    case "peanuts":
                        sum = quantity * 1.5;
                        break;
                }
                break;
            case "Varna":
                switch (product){
                    case "coffee":
                        sum = quantity * 0.45;
                        break;
                    case "water":
                        sum = quantity * 0.7;
                        break;
                    case "beer":
                        sum = quantity * 1.1;
                        break;
                    case "sweets":
                        sum = quantity * 1.35;
                        break;
                    case "peanuts":
                        sum = quantity * 1.55;
                        break;
                }
                break;
        }
        System.out.printf("%.2f",sum);
    }
}
