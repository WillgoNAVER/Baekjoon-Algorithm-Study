import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String str = sc.nextLine();
    	str = str.trim();
    	String s[] = str.split(" ");
    	
    	if(str.length()==0) {
    		System.out.println(0);
    	}
    	else {
    		System.out.println(s.length);
    	}
    }
}