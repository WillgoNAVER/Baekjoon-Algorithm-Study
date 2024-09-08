import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        int nums[] = new int[num];
        
        for(int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        
        for(int i = 0; i < nums.length-1; i++) {
            for(int j = 0; j < nums.length-i-1; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}