import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    // 예제 입력 1
    // 2 1 5
    // 예제 출력 1
    // 4
    // 예제 입력 2
    // 5 1 6
    // 예제 출력 2
    // 2
    // 예제 입력 3
    // 100 99 1000000000
    // 예제 출력 3
    // 999999901
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int day = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0)
			day++;
 
		System.out.println(day);
    }
}