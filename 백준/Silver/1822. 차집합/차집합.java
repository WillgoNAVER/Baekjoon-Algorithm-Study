import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    // 첫째 줄에는 집합 A의 원소의 개수 n(A)와 집합 B의 원소의 개수 n(B)가 빈 칸을 사이에 두고 주어진다. (1 ≤ n(A),
    // n(B) ≤ 500,000)이 주어진다. 둘째 줄에는 집합 A의 원소가, 셋째 줄에는 집합 B의 원소가 빈 칸을 사이에 두고 주어진다.
    // 하나의 집합의 원소는 2,147,483,647 이하의 자연수이며, 하나의 집합에 속하는 모든 원소의 값은 다르다.

    // 출력
    // 첫째 줄에 집합 A에는 속하면서 집합 B에는 속하지 않는 원소의 개수를 출력한다. 다음 줄에는 구체적인 원소를 빈 칸을 사이에 두고
    // 증가하는 순서로 출력한다. 집합 A에는 속하면서 집합 B에는 속하지 않는 원소가 없다면 첫째 줄에 0만을 출력하면 된다.

    // 예제 입력 1
    // 4 3
    // 2 5 11 7
    // 9 7 4
    // 예제 출력 1
    // 3
    // 2 5 11
    // 예제 입력 2
    // 3 5
    // 2 5 4
    // 1 2 3 4 5
    // 예제 출력 2
    // 0
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            int temp = Integer.parseInt(st.nextToken());
            set.add(temp);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (set.contains(temp)) {//중복되는 게 있으면
                set.remove(temp);
            }
        }
        
        LinkedList<Integer> list = new LinkedList<>(set);

        Collections.sort(list);

        if (list.isEmpty()) {
            System.out.println(0);
            System.exit(0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append('\n');

        for (int key : list) {
            sb.append(key).append(" ");
        }
        System.out.println(sb);
    }
}