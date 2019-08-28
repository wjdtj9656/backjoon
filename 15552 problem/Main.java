import java.io.*;
import java.util.*;

/*
 * backjoon 15552 problem
 * fast A+B
 * https://www.acmicpc.net/problem/15552
 */
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	
	int num=Integer.parseInt(br.readLine());
	for(int i=0;i<num;i++){
		StringTokenizer st=new StringTokenizer(br.readLine());
		int num1=Integer.parseInt(st.nextToken());
		int num2=Integer.parseInt(st.nextToken());
		bw.write(num1+num2+"\n");
	}
	bw.flush();
	
}//main
}//class main
