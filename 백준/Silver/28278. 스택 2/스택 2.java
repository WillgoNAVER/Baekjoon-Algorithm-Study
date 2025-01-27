import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

// 명령은 총 다섯 가지이다.

// 1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
// 2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
// 3: 스택에 들어있는 정수의 개수를 출력한다.
// 4: 스택이 비어있으면 1, 아니면 0을 출력한다.
// 5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
// 입력
// 첫째 줄에 명령의 수 N이 주어진다. (1 ≤ N ≤ 1,000,000)

// 둘째 줄부터 N개 줄에 명령이 하나씩 주어진다.

// 출력을 요구하는 명령은 하나 이상 주어진다.

// 출력
// 출력을 요구하는 명령이 주어질 때마다 명령의 결과를 한 줄에 하나씩 출력한다.
class Stack {
    private int top = 0;
    private int[] stack;

    Stack(int N) {
        stack = new int[N];
    }
    public void push(int value) {
        stack[top] = value;
        top++;
    }
    // 2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
    public int pop() {
        if (this.top == 0) {
            return -1;
        }
        this.top--;
        int value = stack[this.top];
        stack[top] = 0;
        return value;
    }
    // 3: 스택에 들어있는 정수의 개수를 출력한다.
    public int size() {
        return this.top;
    }
    // 4: 스택이 비어있으면 1, 아니면 0을 출력한다.
    public int isEmpty() {
        if (this.top == 0) {
            return 1;
        }
        return 0;
    }
    // 5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
    public int top() {
        if (this.top == 0) {
            return -1;
        }
        return stack[top-1];
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        Stack stack = new Stack(N);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            String str = reader.readLine();
            String tokens[] = str.split(" ");
            switch(tokens[0]) {
                case "1":
                    stack.push(Integer.parseInt(tokens[1]));
                    break;
                    // 2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
                case "2":
                    sb.append(stack.pop()).append('\n');
                    break;
                    // 3: 스택에 들어있는 정수의 개수를 출력한다.
                case "3":
                    sb.append(stack.size()).append('\n');
                    break;
                    // 4: 스택이 비어있으면 1, 아니면 0을 출력한다.
                case "4":
                    sb.append(stack.isEmpty()).append('\n');
                    break;
                    // 5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
                case "5":
                    sb.append(stack.top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}