package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	/*
	 * 5554 problem
	승균이는 매일 학교, PC방, 학원에 다닌다. 반복되는 일상에 익숙해진 승균이는 이동시간을 단축해서 PC방에 더 오래 머물고 싶었다. 그래서 스톱워치를 들고 이동할 때마다 기록을 잰 후 집에 가서 분석해보기로 했다.
	집에 도착한 승균이는 측정한 결과를 보는 데, 전부 초 단위로 기록되어있다! 맨날 놀기만 해서 총 이동 시간이 몇 분 몇 초인지 계산을 못 하는 승균이를 도와주자.
	하루 동안 측정한 결과가 주어지면, 이날의 총 이동 시간이 몇 분 몇 초인지 출력하는 프로그램을 작성하시오.
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		String htos = br.readLine();
		String stop = br.readLine();
		String ptoa = br.readLine();
		String atoh = br.readLine();
		
		int sum = Integer.parseInt(htos) +Integer.parseInt(stop) + Integer.parseInt(ptoa) + Integer.parseInt(atoh);
		int minute = sum/60;
		int sec = sum%60;
		
		bw.write(String.valueOf(minute) + "\n" + String.valueOf(sec));
		
		
		bw.flush();
		bw.close();
		
		return ;
	}

}
