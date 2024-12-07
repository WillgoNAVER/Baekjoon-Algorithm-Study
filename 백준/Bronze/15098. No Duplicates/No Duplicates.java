import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String splits[] = str.split(" ");
        
        Set<String> set = new HashSet<>();
        boolean check = false;
        for (int i = 0; i < splits.length; i++) {
            boolean temp = set.add(splits[i]);
            if (!temp) {
                check = true;
            }
        }
        if (!check) { // 중복된 게 있으면
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}