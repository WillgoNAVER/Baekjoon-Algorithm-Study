import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
// 상근이는 퀴즈쇼의 PD이다. 이 퀴즈쇼의 참가자는 총 8개 문제를 푼다. 참가자는 각 문제를 풀고, 그 문제를 풀었을 때 얻는 점수는 문제를 풀기 시작한 시간부터 경과한 시간과 난이도로 결정한다. 문제를 풀지 못한 경우에는 0점을 받는다. 참가자의 총 점수는 가장 높은 점수 5개의 합이다. 

// 상근이는 잠시 여자친구와 전화 통화를 하느라 참가자의 점수를 계산하지 않고 있었다. 참가자의 8개 문제 점수가 주어졌을 때, 총 점수를 구하는 프로그램을 작성하시오.

// 입력
// 8개 줄에 걸쳐서 각 문제에 대한 참가자의 점수가 주어진다. 점수는 0보다 크거나 같고, 150보다 작거나 같다. 모든 문제에 대한 점수는 서로 다르다. 입력으로 주어지는 순서대로 1번 문제, 2번 문제, ... 8번 문제이다.

// 출력
// 첫째 줄에 참가자의 총점을 출력한다. 둘째 줄에는 어떤 문제가 최종 점수에 포함되는지를 공백으로 구분하여 출력한다. 출력은 문제 번호가 증가하는 순서이어야 한다.

// 예제 입력 1 
// 20
// 30
// 50
// 48
// 33
// 66
// 0
// 64
// 예제 출력 1 
// 261
// 3 4 5 6 8
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[9];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            int temp = Integer.parseInt(br.readLine());
            arr[i] = temp;
            list.add(temp);
        }
        Arrays.sort(arr);
        int sum = 0;
        int tempArr[] = new int[5];
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for (int i = 8; i >= 4; i--) {
            sum += arr[i];
            for (int j = 0; j < list.size(); j++) {
                if (arr[i] == list.get(j)) {
                    tempArr[idx] = j + 1;
                }
            }
            idx++;
        }
        Arrays.sort(tempArr);
        for (int i : tempArr) {
            sb.append(i + " ");
        }
        System.out.println(sum);
        System.out.println(sb);
    }
}
