package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	/*
	 * 20499 problem
	������ �츮 �� �ٸ��콺�� ����� �� ����. ����k/d/a �� ���� �װ� ����¥������ �Ǻ��� ����.
	k+a<d �̰ų�,d=0 �̸� �״� ����¥���̰�, �׷��� ������ ����¥���̴�.
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
