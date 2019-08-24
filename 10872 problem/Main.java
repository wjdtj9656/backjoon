
import java.io.*;
import java.util.*;
/*
 * backjoon 11872 problem
 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
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
