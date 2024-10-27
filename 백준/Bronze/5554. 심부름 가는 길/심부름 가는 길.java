import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 이동 시간 입력 받기
        int time1 = scanner.nextInt(); // 집에서 학교까지
        int time2 = scanner.nextInt(); // 학교에서 PC방까지
        int time3 = scanner.nextInt(); // PC방에서 학원까지
        int time4 = scanner.nextInt(); // 학원에서 집까지

        // 총 이동 시간 계산
        int totalSeconds = time1 + time2 + time3 + time4;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        // 결과 출력
        System.out.println(minutes);
        System.out.println(seconds);

        scanner.close();
    }
}
