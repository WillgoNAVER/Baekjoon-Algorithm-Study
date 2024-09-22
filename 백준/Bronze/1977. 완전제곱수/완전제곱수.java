import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.Arrays;

public class Main {
    // 예제 입력 1
    // 60
    // 100
    // 예제 출력 1
    // 245
    // 64
    // 예제 입력 2
    // 75
    // 80
    // 예제 출력 2
    // -1
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(reader.readLine());
        int N = Integer.parseInt(reader.readLine());

        int i = 1;
        int min = N;
        int sum = 0;
        while ((i * i) <= N) {
            int temp = i * i;
            if (temp >= M && temp <= N) {
                sum += temp;
                if (temp < min) {
                    min = temp;
                }
            }
            i++;
        }
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}