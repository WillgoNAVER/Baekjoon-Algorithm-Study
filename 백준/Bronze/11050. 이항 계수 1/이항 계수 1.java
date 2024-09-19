import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    // 자연수
    // \(N\)과 정수
    // \(K\)가 주어졌을 때 이항 계수
    // \(\binom{N}{K}\)를 구하는 프로그램을 작성하시오.

    // 입력
    // 첫째 줄에
    // \(N\)과
    // \(K\)가 주어진다. (1 ≤
    // \(N\) ≤ 10, 0 ≤
    // \(K\) ≤
    // \(N\))

    // 출력

    // \(\binom{N}{K}\)를 출력한다.

    // 예제 입력 1
    // 5 2
    // 예제 출력 1
    // 10
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int result = 1;
        int result2 = 1;
        for (int i = 0; i < K; i++) {
            result = result * (N-i);
            result2 = result2 * (K-i);
        }
        sb.append(result/result2);
        System.out.println(sb);
    }
}