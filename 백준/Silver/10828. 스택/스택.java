import java.util.Scanner;
import java.util.LinkedList;

class Stack {
    private int top = 0;
    private int[] arr;

    Stack(int N) {
        this.arr = new int[N];
    }

    public void push(int value) {
        arr[top] = value;
        top++;
    }

    public int pop() {
        if (top == 0) {
            return -1;
        }
        int value = arr[--top];
        arr[top] = 0;
        return value;
    }

    public int size() {
        return this.top;
    }

    public int empty() {
        if (this.top == 0) {
            return 1;
        }
        return 0;
    }

    public int top() {
        if(top == 0) {
            return -1;
        }
        return arr[top-1];
    }
}

public class Main {
    // push X: 정수 X를 스택에 넣는 연산이다.
    // pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    // size: 스택에 들어있는 정수의 개수를 출력한다.
    // empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
    // top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    // 입력
    // 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는
    // 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

    // 출력
    // 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        Stack stack = new Stack(N);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String str = scanner.next();
            switch (str) {
                case "push":
                    stack.push(scanner.nextInt());
                    break;
                case "pop":
                    sb.append(stack.pop()).append('\n');
                    break;
                case "top":
                    sb.append(stack.top()).append('\n');
                    break;
                case "size":
                    sb.append(stack.size()).append('\n');
                    break;
                case "empty":
                    sb.append(stack.empty()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}

// 14
// push 1
// push 2
// top
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
// top

// 2
// 2
// 0
// 2
// 1
// -1
// 0
// 1
// -1
// 0
// 3
