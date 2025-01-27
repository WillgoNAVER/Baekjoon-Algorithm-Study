import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    // N*M크기의 행렬 A와 M*K크기의 행렬 B가 주어졌을 때, 두 행렬을 곱하는 프로그램을 작성하시오.

    // 입력
    // 첫째 줄에 행렬 A의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 순서대로 주어진다. 그 다음 줄에는 행렬
    // B의 크기 M과 K가 주어진다. 이어서 M개의 줄에 행렬 B의 원소 K개가 차례대로 주어진다. N과 M, 그리고 K는 100보다 작거나
    // 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

    // 출력
    // 첫째 줄부터 N개의 줄에 행렬 A와 B를 곱한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.

    // 예제 입력 1
    // 3 2
    // 1 2
    // 3 4
    // 5 6
    // 2 3
    // -1 -2 0
    // 0 0 3
    // 예제 출력 1
    // -1 -2 6
    // -3 -6 12
    // -5 -10 18
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(reader.readLine());
        int rowA = Integer.parseInt(st.nextToken());
        int colA = Integer.parseInt(st.nextToken());

        int arrA[][] = new int[rowA][colA];

        for (int i = 0; i < rowA; i++) {
            st = new StringTokenizer(reader.readLine());
            for (int j = 0; j < colA; j++) {
                arrA[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(reader.readLine());
        int rowB = Integer.parseInt(st.nextToken());
        int colB = Integer.parseInt(st.nextToken());
        int arrB[][] = new int[rowB][colB];

        for (int i = 0; i < rowB; i++) {
            st = new StringTokenizer(reader.readLine());
            for (int j = 0; j < colB; j++) {
                arrB[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                int sum = 0;
                for (int k = 0; k < colA; k++) {
                    sum += arrA[i][k] * arrB[k][j];
                }
                sb.append(sum).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}