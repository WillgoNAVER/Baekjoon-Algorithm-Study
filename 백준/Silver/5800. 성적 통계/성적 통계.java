import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    // 문제
    // 한상덕은 이번에 중덕 고등학교에 새로 부임한 교장 선생님이다. 교장 선생님으로서 첫 번째 일은 각 반의 수학 시험 성적의 통계를 내는
    // 일이다.

    // 중덕 고등학교 각 반의 학생들의 수학 시험 성적이 주어졌을 때, 최대 점수, 최소 점수, 점수 차이를 구하는 프로그램을 작성하시오.

    // 입력
    // 첫째 줄에 중덕 고등학교에 있는 반의 수 K (1 ≤ K ≤ 100)가 주어진다. 다음 K개 줄에는 각 반의 학생수 N (2 ≤ N ≤
    // 50)과 각 학생의 수학 성적이 주어진다. 시험 성적은 0보다 크거나 같고, 100보다 작거나 같은 정수이고, 공백으로 나누어져 있다.

    // 출력
    // 각 반에 대한 출력은 다음과 같이 두 줄로 이루어져 있다.

    // 첫째 줄에는 "Class X"를 출력한다. X는 반의 번호이며 입력으로 주어진 순서대로 1부터 증가한다.
    // 둘째 줄에는 가장 높은 점수, 낮은 점수, 성적을 내림차순으로 정렬했을 때 가장 큰 인접한 점수 차이를 예제 출력과 같은 형식으로
    // 출력한다.
    // 예제 입력 1
    // 2
    // 5 30 25 76 23 78
    // 6 25 50 70 99 70 90
    // 예제 출력 1
    // Class 1
    // Max 78, Min 23, Largest gap 46
    // Class 2
    // Max 99, Min 25, Largest gap 25
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int K = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < K; i++) {
            List<Integer> list = new LinkedList<>();
            
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < N; j++) {
                int temp = Integer.parseInt(st.nextToken());
                if (temp > max) {
                    max = temp;
                }
                if (temp < min) {
                    min = temp;
                }
                list.add(temp);
            }
            Collections.sort(list, Collections.reverseOrder()); // 내림차순
            int maxDiff = Integer.MIN_VALUE;
            for (int j = 0; j < list.size() - 1; j++) {
                int tempInt = list.get(j) - list.get(j + 1);
                if (tempInt > maxDiff) {
                    maxDiff = tempInt;
                }
            }
            sb.append("Class ").append(i + 1).append('\n');
            sb.append("Max " + max).append(", Min " + min).append(", Largest gap " + maxDiff).append('\n');
        }
        sb.delete(sb.length() -1, sb.length());
        System.out.println(sb);
    }
}