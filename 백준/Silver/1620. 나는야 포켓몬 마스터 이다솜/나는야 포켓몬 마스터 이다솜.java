import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    // 예제 입력 1
    // 26 5
    // Bulbasaur
    // Ivysaur
    // Venusaur
    // Charmander
    // Charmeleon
    // Charizard
    // Squirtle
    // Wartortle
    // Blastoise
    // Caterpie
    // Metapod
    // Butterfree
    // Weedle
    // Kakuna
    // Beedrill
    // Pidgey
    // Pidgeotto
    // Pidgeot
    // Rattata
    // Raticate
    // Spearow
    // Fearow
    // Ekans
    // Arbok
    // Pikachu
    // Raichu
    // 25
    // Raichu
    // 3
    // Pidgey
    // Kakuna
    // 예제 출력 1
    // Pikachu
    // 26
    // Venusaur
    // 16
    // 14
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, String> bookName = new HashMap<>();
        HashMap<String, Integer> bookNo = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            String input = reader.readLine();
            bookName.put(i, input);
            bookNo.put(input, i);
        }

        for (int i = 0; i < M; i++) {
            String search = reader.readLine();
            char c = search.charAt(0);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) { // 이름이 입력으로 들어오면 숫자를 출력해야함.
                sb.append(bookNo.get(search)).append('\n');
            } else { // 숫자가 입력으로 들어오면 이름을 입력해야함.
                int No = Integer.parseInt(search);
                sb.append(bookName.get(No)).append('\n');
            }
        }
        System.out.println(sb);
    }
}