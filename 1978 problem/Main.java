package example;
/*1978 problem
 *�־��� �� N�� �߿��� �Ҽ��� �� ������ ã�Ƽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *www.acmicpc.net/problem/1978
 */

import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			int allNum[]=new int[num];
			int count=0, scount=0;
			
		for(int i=0;i<num;i++) {
			allNum[i]=sc.nextInt();
		}
		for(int i=0;i<allNum.length;i++) {
			scount=0;
			for(int j=1;j<=allNum[i];j++) {
				if(allNum[i]%j==0) {
					scount++;
				}
			}
			if(scount==2)
				count++;
		}
		System.out.println(count);

	}//main
}//class
