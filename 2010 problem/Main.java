package example;
/*2010 problem
 * �������� ������ �ܼ�Ʈ�� ���� �� �ִ� �÷��װ� �ϳ��ۿ� ����. �����̴� ���� ��ǻ�͸� ������ �ִµ�, 
 * ��ǻ���� ���� ������ ��� �ذ��ϴ� ���ϱ�?
 * �ϳ��� �÷��װ� �ְ�, N���� ��Ƽ���� �ִ�. �� ��Ƽ���� �� ���� �÷��׷� �̷���� �ִٰ� �Ѵ�. 
 * �ִ� �� ���� ��ǻ�͸� ������ ������ �� ������?
 *www.acmicpc.net/problem/2010
 */

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int numMulti=sc.nextInt();
		int pNum[]=new int[numMulti];
		int canPlug=0;
		
		for(int i=0;i<numMulti;i++) {
			pNum[i]=sc.nextInt();
		}
		for(int i=0;i<numMulti;i++) {
			
		canPlug+=pNum[numMulti-1-i]-1;
		
		}
		canPlug++;//pNum[numMulti-1]�� -1���ص� �Ǵµ� �������Ƿ�
		
		System.out.println(canPlug);
	}//main
}//class