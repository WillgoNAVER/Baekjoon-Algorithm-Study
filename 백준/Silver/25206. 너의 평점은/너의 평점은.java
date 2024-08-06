import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double gradeSum = 0.0; //총받은학점
		double creditSum = 0.0; // 총학점
		for(int i=0; i<20; i++) {
			String str = sc.next();
			double credit = sc.nextDouble(); // 학점
			String Grade = sc.next(); // 받은학점
			
			if(Grade.equals("P")) {
				continue;
			}

			creditSum += credit;
			
			switch(Grade) {
				case "A+":
					gradeSum += credit*4.5; break;
				case "A0":
					gradeSum += credit*4.0; break;
				case "B+":
					gradeSum += credit*3.5; break;
				case "B0":
					gradeSum += credit*3.0; break;
				case "C+":
					gradeSum += credit*2.5; break;
				case "C0":
					gradeSum += credit*2.0; break;
				case "D+":
					gradeSum += credit*1.5; break;
				case "D0":
					gradeSum += credit*1.0; break;
				case "F":
					gradeSum += 0; break;
			}
		}
		System.out.printf("%.6f\n",gradeSum/creditSum);
	}
}