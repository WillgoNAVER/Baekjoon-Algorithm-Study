import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfWords = scanner.nextInt();
        String[] words = new String[numOfWords];
        scanner.nextLine();
        for(int i = 0; i < numOfWords; i++) {
            words[i] = scanner.nextLine();
        }

        Arrays.sort(words, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            } 
        });
        System.out.println(words[0]);
        for(int i = 1; i < words.length; i++) {
            if(!words[i].equals(words[i-1])) {
                System.out.println(words[i]);
            }
        }

    }
}
