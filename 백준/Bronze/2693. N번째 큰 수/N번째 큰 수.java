import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    // 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 배열 A의 원소
    // 10개가 공백으로 구분되어 주어진다. 이 원소는 1보다 크거나 같고, 1,000보다 작거나 같은 자연수이다.

    // 출력
    // 각 테스트 케이스에 대해 한 줄에 하나씩 배열 A에서 3번째 큰 값을 출력한다.

    // 예제 입력 1
    // 4
    // 1 2 3 4 5 6 7 8 9 1000
    // 338 304 619 95 343 496 489 116 98 127
    // 931 240 986 894 826 640 965 833 136 138
    // 940 955 364 188 133 254 501 122 768 408
    // 예제 출력 1
    // 8
    // 489
    // 931
    // 768
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(reader.readLine());
        for (int i = 0; i < T; i++) {
            int A[] = new int[10];
            StringTokenizer st = new StringTokenizer(reader.readLine());
            for (int j = 0; j < 10; j++) {
                A[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(A);
            sb.append(A[7]).append('\n');
        }
        System.out.println(sb);
    }
}