package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	/*
	 * 6749 problem
	You know a family with three children. Their ages form an arithmetic sequence: 
	the difference in ages between the middle child and youngest child is the same as the difference in ages between the oldest child and the middle child. For example, their ages could be 5, 10 and 15, since both adjacent pairs have a difference of 5 years.
	Given the ages of the youngest and middle children, what is the age of the oldest child? 
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		String first = br.readLine();
		String second = br.readLine();
		
		int sub = Integer.parseInt(second) - Integer.parseInt(first);
		int result = Integer.parseInt(second) +sub;
		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
		
		return ;
	}

}
