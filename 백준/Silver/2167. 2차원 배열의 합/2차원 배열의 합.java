import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    // 2차원 배열이 주어졌을 때 (i, j) 위치부터 (x, y) 위치까지에 저장되어 있는 수들의 합을 구하는 프로그램을 작성하시오. 배열의
    // (i, j) 위치는 i행 j열을 나타낸다.

    // 입력
    // 첫째 줄에 배열의 크기 N, M(1 ≤ N, M ≤ 300)이 주어진다. 다음 N개의 줄에는 M개의 정수로 배열이 주어진다. 배열에
    // 포함되어 있는 수는 절댓값이 10,000보다 작거나 같은 정수이다. 그 다음 줄에는 합을 구할 부분의 개수 K(1 ≤ K ≤
    // 10,000)가 주어진다. 다음 K개의 줄에는 네 개의 정수로 i, j, x, y가 주어진다(1 ≤ i ≤ x ≤ N, 1 ≤ j ≤ y
    // ≤ M).

    // 출력
    // K개의 줄에 순서대로 배열의 합을 출력한다. 배열의 합은 231-1보다 작거나 같다.

    // 예제 입력 1
    // 2 3
    // 1 2 4
    // 8 16 32
    // 3
    // 1 1 2 3
    // 1 2 1 2
    // 1 3 2 3
    // 예제 출력 1
    // 63
    // 2
    // 36
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(reader.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int arr[][] = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int T = Integer.parseInt(reader.readLine());

        for (int k = 0; k < T; k++) {
            st = new StringTokenizer(reader.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            int sum = 0;
            for (int a = i; a <= x; a++) {
                for (int b = j; b <= y; b++) {
                    sum = sum + arr[a][b];
                }
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}