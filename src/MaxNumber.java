import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     String input = sc.nextLine();
        int maxNum = Integer.MIN_VALUE;
     while (!input.equals("Stop")){
            int currentNum = Integer.parseInt(input);
            if(currentNum>maxNum){
                maxNum =currentNum;
            }
         input=sc.nextLine();
     }
        System.out.println(maxNum);
    }
}
