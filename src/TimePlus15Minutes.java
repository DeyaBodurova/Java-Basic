import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());

        int sum = (hour*60) + minutes+15;
        if(sum>23){
            sum=0;
        }
        int newHour= sum/60;
        int newMin= sum%60;
        if(newMin<10){
            System.out.printf(newHour+":0"+newMin);
        } else {
            System.out.printf( newHour+":"+newMin);
        }
    }
}
