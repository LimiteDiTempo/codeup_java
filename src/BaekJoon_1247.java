import java.math.BigInteger;
import java.util.Scanner;

public class BaekJoon_1247 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int n = scanner.nextInt();
            BigInteger cnt = new BigInteger("0");
            for (int j = 0; j < n; j++) {
                cnt = cnt.add(scanner.nextBigInteger());
            }
            if (cnt.compareTo(BigInteger.ZERO) == 0) {
                System.out.println(0);
            } else {
                if (cnt.compareTo(BigInteger.ZERO) == 1) {
                    System.out.println("+");
                } else {
                    System.out.println("-");
                }
            }
        }
    }
}