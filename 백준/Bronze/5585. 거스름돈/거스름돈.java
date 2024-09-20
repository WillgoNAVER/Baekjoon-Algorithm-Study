import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int result = 1000 - N;
        int cnt = 0;
        while (result > 0) {
            if (result >= 500) {
                result -= 500;
                cnt++;
            } else if (result >= 100) {
                result -= 100;
                cnt++;
            } else if (result >= 50) {
                result -= 50;
                cnt++;
            } else if (result >= 10) {
                result -= 10;
                cnt++;
            } else if (result >= 5) {
                result -= 5;
                cnt++;
            } else {
                result -= 1;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}