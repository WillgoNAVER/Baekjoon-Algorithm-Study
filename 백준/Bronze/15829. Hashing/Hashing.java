import java.util.Scanner;
public class Main {
    // 입력
    // 5
    // abcde
    // 출력
    // 4739715
    // 예제 1: abcde의 해시 값은 1 × 31^0 + 2 × 31^1 + 3 × 31^2 + 4 × 31^3 + 5 × 31^4 
    // = 1 + 62 + 2883 + 119164 + 4617605 = 4739715이다.
    // 예제 2: zzz의 해시 값은 26 × 310 + 26 × 311 + 26 × 312 = 26 + 806 + 24986 = 25818이다.
    public static int hashFunction(char c[]) {
        int sum = 0;
        for(int i = 0; i < c.length; i++) {
            int temp = (int)(c[i] - 96);
            if(i == 0) {
                sum += temp;
            } else {
                sum += temp * Math.pow(31, i);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        String str = scanner.next();
        char c[] = new char[str.length()];

        for(int i = 0; i < str.length(); i++) {
            c[i] = str.charAt(i);
        }
        System.out.println(hashFunction(c));
        
    }
}
