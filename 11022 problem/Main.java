import java.io.*;
import java.util.*;

/*
 * backjoon 11022 problem
 * 정해진 만큼 수 만큼 A+B
 * https://www.acmicpc.net/problem/11022
 */
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int num[]=new int[Integer.parseInt(br.readLine())];
		
		for(int i=1;i<num.length+1;i++){
			StringTokenizer st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			bw.write("Case #"+i+": "+a+" + "+b+" = "+(a+b)+"\n");
			
		}
		bw.flush();
	
}//main
}//class main
