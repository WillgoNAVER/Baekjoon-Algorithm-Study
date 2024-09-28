import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        LinkedList<Integer> list = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < 3; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        System.out.println(list.get(1));
    }
}