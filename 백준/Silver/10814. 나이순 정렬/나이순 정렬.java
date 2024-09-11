import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Member implements Comparable<Member> {
    private int age;
    private String name;

    Member(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.age + " " + this.name;
    }

    @Override
    public int compareTo(Member o) {
        return this.age - o.age;
    }
}

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        Member[] member = new Member[N];
        for (int i = 0; i < N; i++) {
            String str = reader.readLine();
            String[] tokens = str.split(" ");
            member[i] = new Member(Integer.parseInt(tokens[0]), tokens[1]);
        }

        Arrays.sort(member);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append(member[i].getAge()).append(" ").append(member[i].getName()).append('\n');
        }
        System.out.println(sb);
    }
}
