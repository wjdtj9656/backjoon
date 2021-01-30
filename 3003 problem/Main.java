package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	/*
	 * 2845 problem
	 * 파티가 끝나고 나면, 사람들은 누가 파티에 왔는지와 얼마나 많은 사람들이 왔는지를 궁금해한다. 보통 파티는 매우 크게 열리기 때문에, 정확하게 몇 명이 참가했는지 알 수가 없다.
	 * 지난주 토요일에 상근이는 자신의 3학년 진학을 기념하면서 매우 성대한 파티를 열었다. 그리고, 상근이는 1m2당 몇 명의 사람이 있었는지 알고있다.	
	 * 상근이의 파티는 정말 엄청난 규모였기 때문에, 대부분의 신문에도 기사가 실렸다. 상근이는 서로 다른 5개의 신문을 보면서 그 기사에 적혀져있는 참가자의 수를 적었다.
	 * 상근이는 자신이 알고있는 참가자의 수가 정확하다고 생각한다. 각 신문 기사에 실려있는 참가자의 수가 몇 명 만큼 잘못되어있는지 구하는 프로그램을 작성하시오.
	 * 
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		String nums = br.readLine();
		String num[] = nums.split(" ");
		
		int accNum [] = new int[6];
		accNum[0] = 1; //킹
		accNum[1] = 1; //퀸
		accNum[2] = 2; //룩
		accNum[3] = 2; //비숍
		accNum[4] = 2; //나이트
		accNum[5] = 8; //폰
		
		for(int i=0; i<6; i++) {
			accNum[i] = accNum[i] - Integer.parseInt(num[i]);
			bw.write(accNum[i]+ " ");
		}
		
		
		bw.flush();
		bw.close();
		
		return ;
	}

}
