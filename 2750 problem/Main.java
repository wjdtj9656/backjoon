package example;
/*2750 problem
 *N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *www.acmicpc.net/problem/2750
 */

import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int input[]=new int[num];
		for(int i=0;i<num;i++) {
			input[i]=sc.nextInt();
		}
		
		asc(input);
		
		for(int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
		
	}//main
	static void asc(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
}//class
