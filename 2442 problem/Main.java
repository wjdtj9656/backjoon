package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	/*
	 * 2442 problem �� ��� - 5 
	ù° �ٿ��� �� 1��, ��° �ٿ��� �� 3��, ..., N��° �ٿ��� �� 2��N-1���� ��� ���� ���� ����� �������� ��Ī�̾�� �Ѵ�.
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int num2 = num;
		int num3 = num;
		for(int i=0; i<num; i++) {
			for(int k=1; k<num2; k++) {
				bw.write(" ");
			}
			for(int j=num3-1; j<num; j++) {
				bw.write("*");	
			}
			num2--;
			num3 -=2;
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		return ;
	}
}
