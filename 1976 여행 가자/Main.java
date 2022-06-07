import java.util.*;
import java.io.*;
public class Main {
	static int N,M,parent[];
	public static void makeSet() {
		for(int i=1; i<=N; i++) {
			parent[i] = i;
		}
	}
	public static int findSet(int a) {
		if(parent[a] == a) return a;
		return parent[a] = findSet(parent[a]);
	}
	public static boolean union(int a, int b) {
		int aRoot = findSet(a);
		int bRoot = findSet(b);
		if(aRoot == bRoot) return false;
		
		parent[bRoot] = aRoot;
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		parent = new int[N+1];
		makeSet();
		int map[][] = new int[N+1][N+1];
		for(int i=1; i<=N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1; j<=N; j++) {
				int num = Integer.parseInt(st.nextToken());
				if(num == 1) {
					union(i,j);
				}
			}
		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		int stand = findSet(Integer.parseInt(st.nextToken()));
		boolean successFlag = true;
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			if(stand != findSet(num)) {
				successFlag = false;
			}
		}
		if(successFlag) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		br.close();
	}
}