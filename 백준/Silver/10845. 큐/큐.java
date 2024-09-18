import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

    // 명령은 총 여섯 가지이다.

    // push X: 정수 X를 큐에 넣는 연산이다.
    // pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    // size: 큐에 들어있는 정수의 개수를 출력한다.
    // empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
    // front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    // back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    // 입력
    // 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는
    // 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

    // 출력
    // 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.

    // 예제 입력 1
    // 15
    // push 1
    // push 2
    // front
    // back
    // size
    // empty
    // pop
    // pop
    // pop
    // size
    // empty
    // pop
    // push 3
    // empty
    // front
    // 예제 출력 1
    // 1 front
    // 2 back
    // 2 size
    // 0 empty
    // 1 pop
    // 2 pop
    // -1 pop
    // 0 size
    // 1 empty
    // -1 pop
    // 0 empty
    // 3 front
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        Queue queue = new Queue(N);
        for (int i = 0; i < N; i++) {
            String prompt[] = reader.readLine().split(" ");
            switch (prompt[0]) {
                case "push":
                    queue.push(Integer.parseInt(prompt[1]));
                    break;
                case "pop":
                    sb.append(queue.pop()).append('\n');
                    break;
                case "size":
                    sb.append(queue.size()).append('\n');
                    break;
                case "empty":
                    sb.append(queue.empty()).append('\n');
                    break;
                case "front":
                    sb.append(queue.front()).append('\n');
                    break;
                case "back":
                    sb.append(queue.back()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}

// push X: 정수 X를 큐에 넣는 연산이다.
// pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
// size: 큐에 들어있는 정수의 개수를 출력한다.
// empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
// front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
// back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
class Queue {
    private int top = 0;
    private int front;
    private int back;
    private int queue[];

    Queue(int size) {
        queue = new int[size];
    }

    public void push(int value) {
        queue[back] = value;
        back++;
    }

    // pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public int pop() {
        if (this.back == 0) {
            return -1;
        }
        int value = queue[front];
        for (int i = 0; i < queue.length - 1; i++) {
            queue[i] = queue[i+1];
        }
        back--;
        queue[back] = 0;
        return value;
    }

    public int size() {
        return this.back;
    }

    // empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
    public int empty() {
        return (this.back == 0) ? 1 : 0;
    }

    // front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public int front() {
        return (this.back == 0) ? -1 : queue[front];
    }

    // back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public int back() {
        return (this.back == 0) ? -1 : queue[back - 1];
    }

}