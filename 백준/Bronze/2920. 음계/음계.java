import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input[] = new String[8];
        String string = "";

        for (int i = 0; i < 8; i++) {
            input[i] = sc.next();
            switch (input[i]) {
                case "1":
                    string += "c";
                    break;
                case "2":
                    string += "d";
                    break;
                case "3":
                    string += "e";
                    break;
                case "4":
                    string += "f";
                    break;
                case "5":
                    string += "g";
                    break;
                case "6":
                    string += "a";
                    break;
                case "7":
                    string += "b";
                    break;
                case "8":
                    string += "C";
                    break;
            }
        }
        if (string.equals("cdefgabC")) {
            System.out.println("ascending");
        } else if (string.equals("Cbagfedc")) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
