import java.io.*;
import java.util.*;

/*
 * backjoon 1546 problem
 * �����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. 
 * �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
 * ���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
 * �������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * https://www.acmicpc.net/problem/1546
 */

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		float allNum[]=new float[num];
		int i=0;
		float avg=0;
		for(i=0;i<num;i++){
			allNum[i]=sc.nextInt();
		}
		float max=max(allNum);
		for(i=0;i<num;i++){
			allNum[i]=(allNum[i]/max)*100;
			avg+=allNum[i];
		}
		avg/=num;
		System.out.println(avg);
	
		
}//main
	
	static float max(float a[]){
		int i=0;
		float max=a[0];
		for(i=0;i<a.length;i++){
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}
}//class main
