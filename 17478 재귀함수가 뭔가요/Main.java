import java.util.*;
import java.io.*;
public class Main {
	static int N;
	static StringBuilder sb = new StringBuilder();
	public static void what(int n) {
		if(n==N) {
			System.out.println();
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
		what(0);
	}

}
