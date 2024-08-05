import java.util.*;
public class Main{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int testCase = sc.nextInt();

    	for(int i=0; i<testCase; i++) {
    		int numOfStu = sc.nextInt();
    		int arr[] = new int[numOfStu];
    		int sum = 0;
    		float avg = 0;
    		int sum2 = 0;
    		double avg2 = 0.0;
    		for(int j=0; j<numOfStu; j++) {
    			arr[j] = sc.nextInt();
    		}
    		for(int j=0; j<numOfStu; j++) {
    			sum += arr[j];
    		}
    		avg = sum/(float)numOfStu;
    		for(int j=0; j<numOfStu; j++) {
    			if(arr[j]>avg) {
    				sum2++;
    			}
    		}
    		System.out.printf("%.3f",(sum2/(float)numOfStu)*100);
    		System.out.println("%");
    	}
    }
}