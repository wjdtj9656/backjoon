
import java.io.*;
import java.util.*;
/*
 * backjoon 11872 problem
 * 0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * https://www.acmicpc.net/problem/10872
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fac=1;
		
		for(int i=1;i<num+1;i++){
			fac*=i;
	}
		System.out.println(fac);
}//main
}//class main
