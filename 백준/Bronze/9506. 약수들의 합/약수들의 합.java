import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    // 어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다.

    // 예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.

    // n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.

    // 입력
    // 입력은 테스트 케이스마다 한 줄 간격으로 n이 주어진다. (2 < n < 100,000)

    // 입력의 마지막엔 -1이 주어진다.

    // 출력
    // 테스트케이스 마다 한줄에 하나씩 출력해야 한다.

    // n이 완전수라면, n을 n이 아닌 약수들의 합으로 나타내어 출력한다(예제 출력 참고).

    // 이때, 약수들은 오름차순으로 나열해야 한다.

    // n이 완전수가 아니라면 n is NOT perfect. 를 출력한다.

    // 예제 입력 1
    // 6
    // 12
    // 28
    // -1
    // 예제 출력 1
    // 6 = 1 + 2 + 3
    // 12 is NOT perfect.
    // 28 = 1 + 2 + 4 + 7 + 14
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            int num = Integer.parseInt(reader.readLine());
            if (num == -1) {
                break;
            }
            LinkedList<Integer> list = new LinkedList<>();
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }
            StringBuilder sb = new StringBuilder();
            if (sum == num) {
                sb.append(num).append(" = ");
                int i = 0;
                while (!list.isEmpty()) {
                    if (list.size() == 1) {
                        sb.append(list.poll());
                    } else {
                        sb.append(list.poll()).append(" + ");
                    }
                    i++;
                }
            } else {
                sb.append(num).append(" is NOT perfect.");
            }
            System.out.println(sb);
        }
        
    }
}