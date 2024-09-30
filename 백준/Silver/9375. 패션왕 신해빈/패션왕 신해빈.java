import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    // 첫째 줄에 테스트 케이스가 주어진다. 테스트 케이스는 최대 100이다.

    // 각 테스트 케이스의 첫째 줄에는 해빈이가 가진 의상의 수 n(0 ≤ n ≤ 30)이 주어진다.
    // 다음 n개에는 해빈이가 가진 의상의 이름과 의상의 종류가 공백으로 구분되어 주어진다. 같은 종류의 의상은 하나만 입을 수 있다.
    // 모든 문자열은 1이상 20이하의 알파벳 소문자로 이루어져있으며 같은 이름을 가진 의상은 존재하지 않는다.

    // 출력
    // 각 테스트 케이스에 대해 해빈이가 알몸이 아닌 상태로 의상을 입을 수 있는 경우를 출력하시오.

    // 예제 입력 1
    // 2
    // 3
    // hat headgear
    // sunglasses eyewear
    // turban headgear
    // 3
    // mask face
    // sunglasses face
    // makeup face
    // 예제 출력 1
    // 5
    // 3
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(reader.readLine());
            HashMap<String, Integer> apparelMap = new HashMap<>();
            for (int j = 0; j < M; j++) {
                StringTokenizer st = new StringTokenizer(reader.readLine());
                st.nextToken();
                String type = st.nextToken();
                apparelMap.put(type, apparelMap.getOrDefault(type, 0) + 1);
            }
            int result = 1;
            for (Map.Entry<String, Integer> entry : apparelMap.entrySet()) {
                result *= (entry.getValue() + 1);
            }
            if (i == N-1) {
                sb.append(result - 1);
            } else {
                sb.append(result - 1).append('\n');
            }
        }
        System.out.println(sb);
    }
}