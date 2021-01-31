package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	/*
	 * 5554 problem
	�±��̴� ���� �б�, PC��, �п��� �ٴѴ�. �ݺ��Ǵ� �ϻ� �ͼ����� �±��̴� �̵��ð��� �����ؼ� PC�濡 �� ���� �ӹ��� �;���. �׷��� �����ġ�� ��� �̵��� ������ ����� �� �� ���� ���� �м��غ���� �ߴ�.
	���� ������ �±��̴� ������ ����� ���� ��, ���� �� ������ ��ϵǾ��ִ�! �ǳ� ��⸸ �ؼ� �� �̵� �ð��� �� �� �� ������ ����� �� �ϴ� �±��̸� ��������.
	�Ϸ� ���� ������ ����� �־�����, �̳��� �� �̵� �ð��� �� �� �� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
