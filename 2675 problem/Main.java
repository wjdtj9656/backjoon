package example;
/*2675 problem
 *���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ��, ù ��° ���ڸ� R�� �ݺ��ϰ�,
 * �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�. S���� QR Code "alphanumeric" ���ڸ� ����ִ�.
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
