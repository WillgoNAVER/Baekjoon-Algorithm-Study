import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String str1[] = new String[n];

        for(int i = 0; i < str1.length; i++) {
            str1[i] = scanner.nextLine();
            if(str1[i].charAt(0) >= 'a' && str1[i].charAt(0) <= 'z') {
                char c = (char)(str1[i].charAt(0) - 32);
                str1[i] = c+str1[i].substring(1);
            }
        }
        for(String s : str1) {
            System.out.println(s);
        }
    }
}