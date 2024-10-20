import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    // 접미사 배열은 문자열 S의 모든 접미사를 사전순으로 정렬해 놓은 배열이다.

    // baekjoon의 접미사는 baekjoon, aekjoon, ekjoon, kjoon, joon, oon, on, n 으로 총 8가지가
    // 있고, 이를 사전순으로 정렬하면, aekjoon, baekjoon, ekjoon, joon, kjoon, n, on, oon이 된다.

    // 문자열 S가 주어졌을 때, 모든 접미사를 사전순으로 정렬한 다음 출력하는 프로그램을 작성하시오.

    // 입력
    // 첫째 줄에 문자열 S가 주어진다. S는 알파벳 소문자로만 이루어져 있고, 길이는 1,000보다 작거나 같다.

    // 출력
    // 첫째 줄부터 S의 접미사를 사전순으로 한 줄에 하나씩 출력한다.

    // 예제 입력 1
    // baekjoon
    // 예제 출력 1
    // aekjoon
    // baekjoon
    // ekjoon
    // joon
    // kjoon
    // n
    // on
    // oon
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        String arr[] = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.substring(i);
        }
        Arrays.sort(arr);
        for (String s : arr) {
            sb.append(s).append('\n');
        }
        System.out.println(sb);
    }
}