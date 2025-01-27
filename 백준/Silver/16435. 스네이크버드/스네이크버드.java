import java.lang.*;
import java.lang.reflect.Method;
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    // 스네이크버드는 뱀과 새의 모습을 닮은 귀여운 생물체입니다.

    // 스네이크버드의 주요 먹이는 과일이며 과일 하나를 먹으면 길이가 1만큼 늘어납니다.

    // 과일들은 지상으로부터 일정 높이를 두고 떨어져 있으며 i (1 ≤ i ≤ N) 번째 과일의 높이는 hi입니다.

    // 스네이크버드는 자신의 길이보다 작거나 같은 높이에 있는 과일들을 먹을 수 있습니다.

    // 스네이크버드의 처음 길이가 L일때 과일들을 먹어 늘릴 수 있는 최대 길이를 구하세요.

    // 입력
    // 첫 번째 줄에 과일의 개수 N (1 ≤ N ≤ 1,000) 과 스네이크버드의 초기 길이 정수 L (1 ≤ L ≤ 10,000) 이
    // 주어집니다.

    // 두 번째 줄에는 정수 h1, h2, ..., hN (1 ≤ hi ≤ 10,000) 이 주어집니다.

    // 출력
    // 첫 번째 줄에 스네이크버드의 최대 길이를 출력합니다.

    // 예제 입력 1
    // 3 10
    // 10 11 13
    // 예제 출력 1
    // 12
    // 스네이크버드의 처음 길이는 10이며 1번 과일을 먹은 후 길이가 11이 됩니다. 이후 2번 과일을 먹으면 길이가 12가 됩니다. 더 이상
    // 먹을 수 있는 과일이 없으므로 최대 길이는 12가 됩니다.

    // 예제 입력 2
    // 9 1
    // 9 5 8 1 3 2 7 6 4
    // 예제 출력 2
    // 10
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int arrN[] = new int[N];

        st = new StringTokenizer(br.readLine());
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrN.length; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrN);
        
        for (int i = 0; i < arrN.length; i++) {
            if (arrN[i] <= L) {
                L += 1;
            }
        }
        System.out.println(L);
    }
}
