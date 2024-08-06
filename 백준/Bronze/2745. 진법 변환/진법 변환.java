import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int notation = sc.nextInt();
		
		int sum = 0;
		
		
		for(int i=0; i<s.length(); i++) {
			int value = 0;
			
			if(s.charAt(s.length()-1-i)>='0' && s.charAt(s.length()-1-i)<='9') {
				value = s.charAt(s.length()-1-i) - '0';
			} else if(s.charAt(s.length()-1-i) >= 'A' && s.charAt(s.length()-1-i) <= 'Z') {
				value = s.charAt(s.length()-1-i) - 'A'+10;
			}
			sum += value*Math.pow(notation, i);
		}
		
		System.out.println(sum);
	}
}