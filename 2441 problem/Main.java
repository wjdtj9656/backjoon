package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	/*
	 * 2441 problem �� ��� - 4 
	ù° �ٿ��� �� N��, ��° �ٿ��� �� N-1��, ..., N��° �ٿ��� �� 1���� ��� ����
	������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int num2 = num;
		for(int i=0; i<num; i++) {
			for(int k=num2; k<num; k++) {
				bw.write(" ");
			}
			for(int j=num2 ; j>0; j--) {
				bw.write("*");	
			}
			num2--;
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		return ;
	}
}
