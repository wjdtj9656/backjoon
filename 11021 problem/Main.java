
import java.io.*;
import java.util.*;
/*
 * backjoon 11021 problem
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
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
