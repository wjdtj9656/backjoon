import java.io.*;
import java.util.*;

/*
 * backjoon 4344 problem
 * ù° �ٿ� �׽�Ʈ ���̽� ������ �־�����
 * ��°���� �л��� + �л��������� �Է� ������
 * �� ���� �л��� �� ����� ���� �л��� ���ۼ�Ʈ���� �˷��ִ� ���α׷�.
 * https://www.acmicpc.net/problem/4344
 */

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=0;
		int j=0;
		int avg=0;
		float count=0;
		float per=0;
		for(i=0;i<num;i++){
			int num2=sc.nextInt();
			int allNum[]=new int[num2];
			
			for(j=0;j<num2;j++){
				allNum[j]=sc.nextInt();
				avg+=allNum[j];
			}
			avg/=num2;
			for(j=0;j<num2;j++){
				if(allNum[j]>avg)
					count++;
			}
			per=count/num2*100;
			System.out.printf("%.3f",per);
			System.out.println("%");
			avg=0;
			count=0;
		}//first for
		
	
		
}//main
}//class main
