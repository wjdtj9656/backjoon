package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	/*
	 * 2446 problem º° Âï±â - 9 
	*********
	 *******
	  *****
	   ***
	    *
	   ***
	  *****
	 *******
	*********
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int num2 = num;
		int num3 = -num;
		for(int i=0; i<num-1; i++) {
			for(int k=num2; k<num; k++) {
				bw.write(" ");
			}
			for(int j=num3+1; j<num; j++) {
				bw.write("*");	
			}
			num2--;
			num3 +=2;
			bw.write("\n");
		}
		num2 = num;
		num3 = num;
		
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
