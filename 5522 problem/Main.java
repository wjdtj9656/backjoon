package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	/*
	 * 5522 problem
	JOI���� ī�� ������ �ϰ� �ִ�. �� ī�� ������ 5ȸ�� �������� ����Ǹ�, �� �������� �ºθ� �ϴ� �����̴�.
	JOI���� �� ������ ������ ��Ÿ���� ������ �־����� ��, JOI���� ������ ���ϴ� ���α׷��� �ۼ��϶�.
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum = 0;
		for(int i=0; i<5; i++) {
			String a = br.readLine();
			sum += Integer.parseInt(a);
		}
		bw.write(String.valueOf(sum));
		
		bw.flush();
		bw.close();
		
		return ;
	}

}
