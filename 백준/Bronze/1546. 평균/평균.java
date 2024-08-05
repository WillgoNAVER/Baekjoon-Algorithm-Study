//ㅑmport java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	int gwamokSu[] = new int[num];
    	for(int i=0; i<gwamokSu.length; i++) {
    		gwamokSu[i] = sc.nextInt();
    	}
    	int max = gwamokSu[0];
    	for(int i=0;i<gwamokSu.length; i++) {
    		if(gwamokSu[i]>max) {
    			max = gwamokSu[i];
    		}
    	}
    	double sum=0.0;
    	for(int i=0; i<gwamokSu.length; i++) {
    		sum+=(double)gwamokSu[i]/(double)max*100;
    	}
    	double avg = sum/num;
    	System.out.println(avg);
    }
}