package example;
/*2675 problem
 *문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
 * 즉, 첫 번째 문자를 R번 반복하고,
 * 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
 *www.acmicpc.net/problem/2675
 */

import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCaseNum=sc.nextInt();
		String s="";
		int num=0;
		for(int i=0;i<testCaseNum;i++) {
			num=sc.nextInt();
			s=sc.next();
			
			for(int j=0;j<s.length();j++) {
				for(int k=0;k<num;k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}//1for
		

	}//main
}//class
