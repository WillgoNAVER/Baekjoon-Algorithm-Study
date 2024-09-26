import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        char alphabet[] = new char[26];
        int cnt[] = new int[26];
        int idx = 97;
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char)idx++;
        }
        
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (str.charAt(i) == alphabet[j]) {
                    cnt[j]++;
                }
            }
        }
        for (int key : cnt) {
            System.out.print(key+" ");
        }
        
    }
}