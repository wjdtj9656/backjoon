package example;
/*1065 problem
 *어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
 *N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
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
