import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            String string = reader.readLine();
            if (string.equals(".")) {
                break;
            }
            Stack<Character> stack = new Stack<Character>();
            boolean flag = true;
            for (int i = 0; i < string.length(); i++) {
                char c = string.charAt(i);
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.empty() || stack.peek() != '(') {
                        sb.append("no").append('\n');
                        flag = false;
                        break;
                    } else {
                        stack.pop();
                    }
                } else if (c == ']') {
                    if (stack.empty() || stack.peek() != '[') {
                        sb.append("no").append('\n');
                        flag = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (flag) {
                sb.append((stack.empty()) ? "yes" : "no").append('\n');
            }
        }
        System.out.println(sb);
    }
}