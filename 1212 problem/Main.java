package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	/*
	 * 1212 problem
	8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		String num = br.readLine();
		int len = num.length();
		String binary[] = {"000", "001", "010", "011", "100", "101", "110", "111"}; 
		String binary2[] = {"0", "1", "10", "11", "100", "101", "110", "111"};
		char a = num.charAt(0);
		String result ="";
		if(a == '0') 
			bw.write(binary2[0]);
		else if(a == '1')
			bw.write(binary2[1]);
		else if(a == '2')
			bw.write(binary2[2]);
		else if(a == '3')
			bw.write(binary2[3]);
		else if(a == '4')
			bw.write(binary2[4]);
		else if(a == '5')
			bw.write(binary2[5]);
		else if(a == '6')
			bw.write(binary2[6]);
		else if(a == '7')
			bw.write(binary2[7]);
		
		for(int i=1; i<len; i++) {
			a = num.charAt(i);
			if(a == '0') 
				bw.write(binary[0]);
			else if(a == '1')
				bw.write(binary[1]);
			else if(a == '2')
				bw.write(binary[2]);
			else if(a == '3')
				bw.write(binary[3]);
			else if(a == '4')
				bw.write(binary[4]);
			else if(a == '5')
				bw.write(binary[5]);
			else if(a == '6')
				bw.write(binary[6]);
			else if(a == '7')
				bw.write(binary[7]);
		}
		bw.write(result);
		bw.flush();
		bw.close();
		return ;
	}

}
