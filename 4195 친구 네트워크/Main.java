import java.util.*;
import java.io.*;
public class Main {
	static int N;
	static int parent[];
	static int cnt[];
	static HashMap<String, Integer> hm;
	public static int findSet(int a) {
		if(parent[a] == a)return a;
		return parent[a] = findSet(parent[a]);
	}
	public static boolean union(int a, int b) {
		int aRoot = findSet(a);
		int bRoot = findSet(b);
		if(aRoot == bRoot) return false;
		parent[bRoot] = aRoot;
		cnt[aRoot] += cnt[bRoot];
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=testcase; tc++ ) {
			N = Integer.parseInt(br.readLine());
			hm = new HashMap();
			cnt = new int[N*2];
			parent = new int[N*2];
			Arrays.fill(cnt, 1);
			for(int i=0,index=0; i<N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String s1 = st.nextToken();
				String s2 = st.nextToken();
				if(!hm.containsKey(s1)) {
					parent[index] = index;
					hm.put(s1, index++);
				}
				if(!hm.containsKey(s2)) {
					parent[index] = index;
					hm.put(s2, index++);
				}
				union(hm.get(s1),hm.get(s2));
				System.out.println(cnt[findSet(hm.get(s1))]);
			}
		}
		
		br.close();
	}
}