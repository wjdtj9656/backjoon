package example;
/*2953 problem
 * "나는 요리사다"는 다섯 참가자들이 서로의 요리 실력을 뽐내는 티비 프로이다. 
 * 각 참가자는 자신있는 음식을 하나씩 만들어오고, 서로 다른 사람의 음식을 점수로 평가해준다. 점수는 1점부터 5점까지 있다.
 * 각 참가자가 얻은 점수는 다른 사람이 평가해 준 점수의 합이다. 이 쇼의 우승자는 가장 많은 점수를 얻은 사람이 된다.
 * 각 참가자가 얻은 평가 점수가 주어졌을 때, 우승자와 그의 점수를 구하는 프로그램을 작성하시오. 
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