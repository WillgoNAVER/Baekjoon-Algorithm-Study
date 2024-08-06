import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean check[][] = new boolean[101][101];
		
		int num = sc.nextInt();
		int cnt = 0;
		
		for(int i=0; i<num; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					if(!check[j][k]) {
						check[j][k] = true;
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}