package example;
/*1065 problem
 *� ���� ���� X�� �ڸ����� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. ���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�.
 *N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 *www.acmicpc.net/problem/1065
 */

import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int count=0;
		if(num<100) {
			count=num;
			System.out.println(count);
		}//if
		else if(num>=100) {
			if(num==1000) {}
			count=99;
			for(int i=100;i<=num;i++)
			count+=numCheck(i);
			System.out.println(count);
		}//else if

	}//main

	static int numCheck(int n) {
		int num1=n/100;
		int num2=n/10%10;
		int num3=n%10;
		if(num1-num2==num2-num3) {
			return 1;
		}//if
		else {
			return 0;
		}//else
	}//function numCheck
}//class
