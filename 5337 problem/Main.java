package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	/*
	 * 5337 problem
	Welcome�� ���� ���ó�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		String first = ".  .   .";
		String second = "|  | _ | _. _ ._ _  _";
		String third = "|/\\|(/.|(_.(_)[ | )(/.";
		
		bw.write(first +"\n");
		bw.write(second +"\n");
		bw.write(third +"\n");
		
		
		bw.flush();
		bw.close();
		
		return ;
	}

}
