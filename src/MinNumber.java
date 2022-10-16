import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int minNum = Integer.MAX_VALUE;
        while (!input.equals("Stop")){
            int current=Integer.parseInt(input);
            if(current<minNum){
                minNum=current;
            }
            input=sc.nextLine();
        }
        System.out.println(minNum);
    }
}
