import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static boolean visit[];
	static int arr[];
	static int N;
	public static void dfs(int count) {
		if(count == N) {
			for(int i=0; i<N; i++) {
				System.out.print(arr[i] +" ");
			}
			System.out.println();
			return;
		}
		for(int i=0; i<N; i++) {
			if(visit[i]) continue;
			arr[count] = i+1;
			visit[i] = true;
			dfs(count+1);
			visit[i] = false;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		visit = new boolean[N];
		arr = new int[N];
		dfs(0);
		bw.flush();
		bw.close();
	}
}
