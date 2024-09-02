 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;) {
            int linear1 = sc.nextInt();
            int linear2 = sc.nextInt();
            int linear3 = sc.nextInt();

            if(linear1 == 0 && linear2 == 0 && linear3 == 0){
                break;
            }
            int noMax1 = 0;
            int noMax2 = 0;
            int max = 0;

            if (linear1 > linear2 && linear1 > linear3) {
                max = linear1;
                noMax1 = linear2;
                noMax2 = linear3;
            } else if (linear2 > linear1 && linear2 > linear3) {
                max = linear2;
                noMax1 = linear1;
                noMax2 = linear3;
            } else if (linear3 > linear1 && linear3 > linear1) {
                max = linear3;
                noMax1 = linear1;
                noMax2 = linear2;
            }

            if ((noMax1 * noMax1) + (noMax2 * noMax2) == max * max) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
