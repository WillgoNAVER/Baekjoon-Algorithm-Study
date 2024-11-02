import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[3];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int temp = Integer.parseInt(br.readLine());
            arr[i] = temp;
            if (min > temp) {
                min = temp;
            }
        }
        int arr2[] = new int[2];
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr2.length; i++) {
            int temp = Integer.parseInt(br.readLine());
            arr2[i] = temp;
            if (min2 > temp) {
                min2 = temp;
            }
        }
        System.out.println(min + min2 - 50);
    }
}
