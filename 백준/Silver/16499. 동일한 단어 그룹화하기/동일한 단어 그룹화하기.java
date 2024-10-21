import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < N; i++) {
            String str = br.readLine();
            char[] tempChar = str.toCharArray();
            Arrays.sort(tempChar);
            String temp = new String(tempChar);
            set.add(temp);
        }  
        System.out.println(set.size());
    }
}
