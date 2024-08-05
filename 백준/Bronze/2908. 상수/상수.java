import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String str = sc.next();
    	String str2 = sc.next();
    	
    	char c[] = str.toCharArray();
    	char c2[] = str2.toCharArray();
    	
    	String s = ""+c[2]+c[1]+c[0];
    	String s2 = ""+c2[2]+c2[1]+c2[0];
    	
    	System.out.print(Integer.parseInt(s)>Integer.parseInt(s2)?Integer.parseInt(s):Integer.parseInt(s2));
    }
}