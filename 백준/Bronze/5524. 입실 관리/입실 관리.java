import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());  
        StringBuilder sb = new StringBuilder();
        String arrN[] = new String[N];
        for (int i = 0; i < N; i++) {
            String temp = br.readLine().toLowerCase();
            arrN[i] = temp;
            if (i == N - 1) {
                sb.append(arrN[i]);
            } else {
                sb.append(arrN[i]).append('\n');
            }
        }
        System.out.println(sb);
    }
}
