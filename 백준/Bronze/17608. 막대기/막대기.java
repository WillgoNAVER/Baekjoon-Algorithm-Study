import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        int last = list.get(N - 1);
        int cnt = 1;
        for (int i = N-1; i >= 0; i--) {
            if(list.get(i) > last) {
                last = list.get(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}