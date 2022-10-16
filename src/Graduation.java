import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int countClass = 0;
        double yearGrade = 0;
        int fails = 0;
        while (countClass < 12){
            double currentGrade = Double.parseDouble(sc.nextLine());
            if(currentGrade < 4) {
                fails++;
                if(fails>1){
                    System.out.printf("%s has been excluded at" +
                            " %d grade",name,countClass);
                    break;
                }
                continue;
            }
            countClass++;
            yearGrade +=currentGrade;
        }
        if(countClass==12){
            System.out.printf("%s graduated. Average grade: %.2f",
                    name, yearGrade/12);
        }
    }
}
