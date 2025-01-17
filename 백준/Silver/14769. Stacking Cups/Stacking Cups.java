import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        Map<Integer, String> map = new TreeMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            String s[] = bufferedReader.readLine().split(" ");
            try {
                Integer integer = Integer.parseInt(s[0]) / 2; // 1번째가 숫자일 경우
                arr[i] = integer;
                map.put(integer, s[1]);
            } catch (NumberFormatException e) { // 1번째가 문자열일 경우
                Integer integer = Integer.parseInt(s[1]);
                arr[i] = integer;
                map.put(integer, s[0]);
            }
        }
        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            stringBuilder.append(map.get(arr[i])).append("\n");
        }
        bufferedReader.close();
        System.out.println(stringBuilder.toString());
    }
}