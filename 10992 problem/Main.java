import java.util.*;
/* 10992 problem
 * 별찍기 규칙
 * https://www.acmicpc.net/problem/10992
 */

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int inputLine=sc.nextInt();
		int Line=1;
		int Star=1;
		int fb=0;
		int sb=1;
		for(Line=1;Line<inputLine+1;Line++) {
			for(fb=0;fb<inputLine-Line;fb++) {
				System.out.print(" ");
			}
			 
				if(Line==1) {
					System.out.print("*");
				}
				else if (Line==inputLine) {
					for(Star=1;Star<2*inputLine;Star++) {
						System.out.print("*");
					}
			}
				else {
					System.out.print("*");
					for(sb=0;sb<2*Line-3;sb++) {
						System.out.print(" ");
					}
					System.out.print("*");
				}
				
			System.out.println();
		}
		
		
}//main	
}//class

