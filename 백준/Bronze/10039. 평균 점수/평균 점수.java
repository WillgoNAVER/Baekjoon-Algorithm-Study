import java.lang.*;
import java.lang.reflect.Method;
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int N = Integer.parseInt(br.readLine());
            if (N < 40) {
                sum += 40;
            } else {
                sum += N;
            }
        }
        System.out.println(sum / 5);
    }
}