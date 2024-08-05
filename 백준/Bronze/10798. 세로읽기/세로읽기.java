import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char c[][] = new char[5][15];
		int max = 0;
		for(int i=0; i<c.length; i++) {
			String s = sc.nextLine();
			for(int j=0; j<s.length(); j++) {
				c[i][j] = s.charAt(j);
				if(j>max) {
					max = j;
				}
			}
		}
		StringBuilder s = new StringBuilder();
		for(int i=0; i<max+1; i++) {
			for(int j=0; j<5; j++) {
				if(c[j][i] != '\0') {
					s.append(c[j][i]);
				}
			}
		}
		System.out.println(s.toString().replace(" ", ""));
	}
}