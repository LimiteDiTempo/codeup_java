import java.util.Scanner;

public class BaekJoon_1003 {
    public static int cnt1 = 0;
    public static int cnt0 = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i < t; i++){
            cnt1 = 0;
            cnt0 = 0;
            int n = scanner.nextInt();
            fibonacci(n);
            System.out.println(cnt0 + " " + cnt1);
        }
    }
    public static void fibonacci(int n){

        if(n == 1){
            cnt1 += 1;
        }
        else if (n == 0){
            cnt0 += 1;
        }
        else{
            fibonacci(n - 1); fibonacci(n-2);
        }
    }
}
