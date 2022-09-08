import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());

        int sum = (hour*60) + minutes+15;
        int newHour= sum/60;
        if(newHour>23){
            sum=0;
        }
        int newMin= sum%60;
        if(newMin<10){
            System.out.println(newHour+":0"+newMin);
        } else {
            System.out.println( newHour+":"+newMin);
        }
    }
}
