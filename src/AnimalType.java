import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String animal = sc.nextLine();
        switch (animal){
            case "dog":
                System.out.println("mammal");
                break;
            case "snake":
                System.out.println("reptile");
                break;
        }
    }
}
