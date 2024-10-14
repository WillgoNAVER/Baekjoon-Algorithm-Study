import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    // 예제 입력 1
    // Fizz
    // Buzz
    // 11
    // 예제 출력 1
    // Fizz
    // 예제 입력 2
    // 980803
    // 980804
    // FizzBuzz
    // 예제 출력 2
    // 980806
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();

        String temp[] = new String[] { s1, s2, s3 };
        int cnt = 0;
        int tempNo = 0;
        boolean check = true;
        for (int i = 0; i < temp.length; i++) {
            if (check) {
                if (temp[i].matches("\\d+")) { // 숫자일 시
                    tempNo = Integer.parseInt(temp[i]); // 숫자인 문자열을 정수형으로 바꿈
                    check = false;
                }
            } else {
                cnt++;
            }
        }
        tempNo = tempNo + cnt + 1;
        if (tempNo % 3 != 0 && tempNo % 5 != 0) {
            System.out.println(tempNo);
        } else if (tempNo % 3 == 0 && tempNo % 5 != 0) {
            System.out.println("Fizz");
        } else if (tempNo % 3 != 0 && tempNo % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("FizzBuzz");
        }
    }
}