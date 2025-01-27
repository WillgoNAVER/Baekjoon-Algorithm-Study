import java.util.Scanner;
public class Main {
//     입력
// 첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다. 
// 둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다.

// 합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.

// 출력
// 첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력한다.

// 입력
// 5 21
// 5 6 7 8 9
// 출력
// 21
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int cards[] = new int[N];

        for(int i = 0; i < cards.length; i++) {
            cards[i] = sc.nextInt();
        }
        int result = 0;
        for(int i = 0; i < N - 2; i++) {
            for(int j = i+1; j < N - 1; j++) {
                for(int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if(sum == M) {
                        result = sum;
                    } else if(sum < M && sum > result) {
                        result = sum;
                    }
                }
            }
        }
        System.out.println(result);

    }
}
