import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean check = true;
        for (int i = 0; i < 7; i++) {
            int temp = Integer.parseInt(br.readLine());
            if (temp % 2 != 0) {
                sum += temp;
                check = false;
                if (temp < min) {
                    min = temp;
                }
            }
        }
        if (check) {
            System.out.println(-1);
            System.exit(0);
        }
        System.out.println(sum);
        System.out.println(min);
    }
}