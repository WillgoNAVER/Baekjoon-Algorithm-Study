import java.lang.*;
import java.lang.reflect.Method;
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            if (i == N) {
                sb.append(i + ". ").append(br.readLine());
            } else {
                sb.append(i + ". ").append(br.readLine()).append('\n');
            }
        }
        System.out.println(sb);
    }
}