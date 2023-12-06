import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeakJoon_1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String n = reader.readLine();
            if (n.equals("0")) {
                break;
            } else {
                int cnt = 0;
                for (char x : n.toCharArray()) {
                    if (x == '1') {
                        cnt += 2;
                    } else if (x == '0') {
                        cnt += 4;
                    } else {
                        cnt += 3;
                    }
                }
                cnt += n.length() + 1;
                System.out.println(cnt);
            }
        }
    }
}
