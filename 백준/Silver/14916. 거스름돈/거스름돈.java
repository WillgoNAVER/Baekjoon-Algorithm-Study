import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    // 입력
    // 첫째 줄에 거스름돈 액수 n(1 ≤ n ≤ 100,000)이 주어진다.

    // 출력
    // 거스름돈 동전의 최소 개수를 출력한다. 만약 거슬러 줄 수 없으면 -1을 출력한다.

    // 예제 입력 1
    // 13
    // 예제 출력 1
    // 5
    // 예제 입력 2
    // 14
    // 예제 출력 2
    // 4
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        boolean flag = true;
        while (N != 0) {
            if (N % 5 == 0) {
                int temp = N / 5;
                N = N - (temp * 5);
                cnt = cnt + temp;
            } else {
                N = N - 2;
                cnt++;
            }// 11 1 9 2 7 3 5 4 0 5
            if (N < 0) {
                flag = false;
                sb.append(-1);
                break;
            }
        }
        if(flag) {
            sb.append(cnt);
        }
        System.out.println(sb);
    }
}