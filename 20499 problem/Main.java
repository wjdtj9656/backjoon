package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	/*
	 * 20499 problem
	무래도 우리 팀 다리우스가 고수인 것 같다. 그의k/d/a 를 보고 그가 「진짜」인지 판별해 보자.
	k+a<d 이거나,d=0 이면 그는 「가짜」이고, 그렇지 않으면 「진짜」이다.
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String kda = br.readLine();
		String[] kdaArr = kda.split("/");
		int kill = Integer.parseInt(kdaArr[0]);
		int death = Integer.parseInt(kdaArr[1]);
		int assist = Integer.parseInt(kdaArr[2]);
		if( kill+assist < death || death==0)
			bw.write("hasu");
		else
			bw.write("gosu");
		bw.flush();
		bw.close();
		return ;
	}
}
