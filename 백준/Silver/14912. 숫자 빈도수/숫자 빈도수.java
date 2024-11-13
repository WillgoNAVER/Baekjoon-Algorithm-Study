import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            String tempStr = String.valueOf(i);
            for (int j = 0; j < tempStr.length(); j++) {
                int tempInt = tempStr.charAt(j) - '0';
                if (tempInt == d) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}