import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String str2 = "";
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) <= 'z' && str.charAt(i) >= 'a') {
                char c = (char)(str.charAt(i) - 32);
                str2 += c;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                char c = (char)(str.charAt(i)+32);
                str2 += c;
            }
        }
        System.out.println(str2);
    }
}
