
import java.io.*;
import java.util.*;
/*
 * backjoon 11021 problem
 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * https://www.acmicpc.net/problem/11021
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num2[]=new int[num];
		
	for(int i=1;i<num2.length+1;i++){
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Case #"+i+": "+(a+b));
	}
}//main
}//class main
