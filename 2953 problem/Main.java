package example;
/*2953 problem
 * "���� �丮���"�� �ټ� �����ڵ��� ������ �丮 �Ƿ��� �˳��� Ƽ�� �����̴�. 
 * �� �����ڴ� �ڽ��ִ� ������ �ϳ��� ��������, ���� �ٸ� ����� ������ ������ �����ش�. ������ 1������ 5������ �ִ�.
 * �� �����ڰ� ���� ������ �ٸ� ����� ���� �� ������ ���̴�. �� ���� ����ڴ� ���� ���� ������ ���� ����� �ȴ�.
 * �� �����ڰ� ���� �� ������ �־����� ��, ����ڿ� ���� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 *www.acmicpc.net/problem/2953
 */

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int sum[]=new int[5];
		int max=0;
		int maxi=0;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				sum[i]+=sc.nextInt();
			}
		}
		for(int i=0;i<5;i++) {
			if(sum[i]>max) {
				max=sum[i];
				maxi=i;
				}
		}
		System.out.println(maxi+1+" "+max);
	}//main
}//class