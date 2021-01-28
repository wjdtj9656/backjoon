package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		String nums = br.readLine();
		int num = 0;
		int sum = 0;
		StringTokenizer st = new StringTokenizer(nums," ");
		while(st.hasMoreTokens()) {
			 num = Integer.parseInt(st.nextToken());
			 sum = sum + num * num;
		}
		bw.write(String.valueOf(sum%10));
		bw.flush();
		bw.close();
		
		return ;
	}

}
