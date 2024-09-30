import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    // 예제 입력 1
    // 5
    // 2 4 -10 4 -9
    // 예제 출력 1
    // 2 3 0 3 1
    // 예제 입력 2
    // 6
    // 1000 999 1000 999 1000 999
    // 예제 출력 2
    // 1 0 1 0 1 0
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(reader.readLine());
        int arrN[] = new int[N];
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }
        int arrTemp[] = arrN.clone();
        Arrays.sort(arrTemp);
        
        int rank = 0;
        for (int i = 0; i < N; i++) {
            if (map.containsKey(arrTemp[i])) {
                continue;
            }
            map.put(arrTemp[i], rank);
            rank++;
        }
        for (int i = 0; i < N; i++) {
            if (i == N-1) {
                sb.append(map.get(arrN[i]));
            } else {
                sb.append(map.get(arrN[i])).append(" ");
            }
        }
        System.out.println(sb);
    }
}