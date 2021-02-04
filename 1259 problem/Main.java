package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	/*
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String n = new String();
		String n2 = new String();
		while(true) {
			n = br.readLine();
			n2 = "";
			if(Integer.parseInt(n)==0) break;
			int len = n.length();
			for(int i=len; i>0; i--) {
				n2 += n.charAt(i-1);
			}
			if(n2.equals(n)) {
				bw.write("yes" + "\n");	
			}
			else {
				bw.write("no" + "\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
