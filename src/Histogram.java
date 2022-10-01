import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int under200 = 0;
        int under399 = 0;
        int under599 = 0;
        int under799 = 0;
        int above800 = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.nextLine());
            if (a < 200) {
                under200++;
            } else if (a < 399) {
                under399++;
            } else if (a < 599) {
                under599++;
            } else if (a < 799) {
                under799++;
            } else if (a >= 800) {
                above800++;
            }
        }
        if(under200==0){
            System.out.printf("0.00%\n");

        }else{
            System.out.printf("%.2f%\n",(under200/n*100));
        }
        if(){
            System.out.printf("0.00%\n");
        }else{
            System.out.printf("%.2f\n",under399/n*100);
        }
        if(){
            System.out.printf("0.00%\n");
        }else{
            System.out.printf("%.2f\n",under599/n*100);
        }
        if(under799==0){
            System.out.print("0.00%\n");
        }else{
            System.out.printf("%.2f\n",under799/n*100);
        }
        if(above800==0){
            System.out.print("0.00%\n");
        }else{
            System.out.printf("%.2f\n",above800/n*100);
        }
    }
}
