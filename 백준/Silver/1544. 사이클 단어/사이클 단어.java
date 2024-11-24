import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    // 사이클 단어는 어떤 단어를 원형 모양으로 차례대로 쓴 것이다. 따라서, 어떤 단어를 이렇게 쓴 후에 임의의 단어를 고른다. 그 후에
    // 시계방향으로 차례대로 읽으면 그 것이 단어가 된다. 만약에 단어 A와 단어 B가 있을 때, 단어 B를 원형으로 써서, 단어 A와 같이 읽을
    // 수 있으면, 두 단어는 같은 단어이다. 따라서, picture와 turepic은 같은 단어다.

    // N개의 단어가 주어졌을 때, 서로 다른 단어가 총 몇 개인지 구하는 프로그램을 작성하시오.

    // 입력
    // 첫째 줄에 단어의 개수 N이 주어진다. 둘째 줄부터 단어가 한 줄에 하나씩 주어진다. 단어는 영어 소문자로만 이루어져 있다. N은 50보다
    // 작거나 같은 자연수이며, 단어의 길이는 최대 50이다.

    // 출력
    // 첫째 줄에 서로 다른 단어가 몇 개인지 출력한다.

    // 예제 입력 1
    // 5
    // picture
    // turepic
    // icturep
    // word
    // ordw
    // 예제 출력 1
    // 2
    // 예제 입력 2
    // 7
    // ast
    // ats
    // tas
    // tsa
    // sat
    // sta
    // ttt
    // 예제 출력 2
    // 3
    // 예제 입력 3
    // 5
    // aaaa
    // aaa
    // aa
    // aaaa
    // aaaaa
    // 예제 출력 3
    // 4
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            boolean duplicated = false;
            for (int j = 0; j < str.length(); j++) {
                String temp = str.substring(j) + str.substring(0, j);
                if (set.contains(temp)) {
                    duplicated = true; // 이미 있는 단어이면 추가 x
                    break;
                }
            }
            if (!duplicated) {
                set.add(str);
            }
        }
        System.out.println(set.size());
    }
}