import java.io.*;
import java.util.*;

/*
 * backjoon 15596 problem
 * 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
 * https://www.acmicpc.net/problem/15596
 */

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int allNum[]=new int[num];
		int i=0;
		
		for(i=0;i<num;i++){
			allNum[i]=sc.nextInt();
		}
		System.out.println(sum(allNum));
	
		
	}
	static long sum(int[] a){
		int i=0;
		long sum=0;
		for(i=0;i<a.length;i++){
			sum+=a[i];
		}
		return sum;
	
		
}//main
}//class main
