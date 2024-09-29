import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    // 화은이는 이번 영어 시험에서 틀린 문제를 바탕으로 영어 단어 암기를 하려고 한다. 그 과정에서 효율적으로 영어 단어를 외우기 위해 영어
    // 단어장을 만들려 하고 있다. 화은이가 만들고자 하는 단어장의 단어 순서는 다음과 같은 우선순위를 차례로 적용하여 만들어진다.

    // 자주 나오는 단어일수록 앞에 배치한다.
    // 해당 단어의 길이가 길수록 앞에 배치한다.
    // 알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치한다
    //
    // $M$보다 짧은 길이의 단어의 경우 읽는 것만으로도 외울 수 있기 때문에 길이가
    // $M$이상인 단어들만 외운다고 한다. 화은이가 괴로운 영단어 암기를 효율적으로 할 수 있도록 단어장을 만들어 주자.

    // 입력
    // 첫째 줄에는 영어 지문에 나오는 단어의 개수
    // $N$과 외울 단어의 길이 기준이 되는
    // $M$이 공백으로 구분되어 주어진다. (
    // $1 \leq N \leq 100\,000$,
    // $1 \leq M \leq 10$)

    // 둘째 줄부터
    // $N+1$번째 줄까지 외울 단어를 입력받는다. 이때의 입력은 알파벳 소문자로만 주어지며 단어의 길이는
    // $10$을 넘지 않는다.

    // 단어장에 단어가 반드시 1개 이상 존재하는 입력만 주어진다.

    // 출력
    // 화은이의 단어장에 들어 있는 단어를 단어장의 앞에 위치한 단어부터 한 줄에 한 단어씩 순서대로 출력한다.

    // 예제 입력 1
    // 7 4
    // apple
    // ant
    // sand
    // apple
    // append
    // sand
    // sand
    // 예제 출력 1
    // sand
    // apple
    // append
    // 12 5
    // appearance
    // append
    // attendance
    // swim
    // swift
    // swift
    // swift
    // mouse
    // wallet
    // mouse
    // ice
    // age
    // 예제 출력 2 
    // swift
    // mouse
    // appearance
    // attendance
    // append
    // wallet
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> vocaMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            String word = reader.readLine();
            if (word.length() >= M) {
                vocaMap.put(word, vocaMap.getOrDefault(word, 0) + 1);
            }
        }
        
        LinkedList<String> vocaList = new LinkedList<>(vocaMap.keySet());
        Collections.sort(vocaList, new Comparator<String>() {
// 자주 나오는 단어일수록 앞에 배치한다.
    // 해당 단어의 길이가 길수록 앞에 배치한다.
    // 알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치한다
            @Override
            public int compare(String o1, String o2) {
                if (vocaMap.get(o1) == vocaMap.get(o2)) {
                    if (o1.length() == o2. length()) {
                        return o1.compareTo(o2);
                    } else {
                        return Integer.compare(o2.length(), o1.length());
                    }
                }
                return Integer.compare(vocaMap.get(o2), vocaMap.get(o1));
            }
            
        });
        StringBuilder sb = new StringBuilder();
        for (String w : vocaList) {
            sb.append(w).append('\n');
        }
        System.out.println(sb);
    }
}