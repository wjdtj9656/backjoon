package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	/*
	 * 5338 problem
	����ũ�μ���Ʈ �ΰ� ���� ���ó�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		String first = "       _.-;;-._";
		String second = "'-..-'|   ||   |";
		String third = "'-..-'|_.-;;-._|";
		String fourth = "'-..-'|   ||   |";
		String fifth = "'-..-'|_.-''-._|";
		
		bw.write(first + "\n" + second + "\n" + third + "\n" + fourth + "\n" + fifth);
		bw.flush();
		bw.close();
		
		return ;
	}

}
