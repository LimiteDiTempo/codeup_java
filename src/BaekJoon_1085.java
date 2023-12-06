import java.util.Scanner;

public class BaekJoon_1085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        System.out.println(Math.min(Math.min(Math.abs(x - w), Math.abs(y - h)), Math.min(x, y)));

    }
}
