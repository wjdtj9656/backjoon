import java.io.*;
import java.util.*;

public class Main {
	static ArrayList<Integer> tree[];
	static int parents[];
	static int depths[];
	static public void dfs(int current, int depth, int parent) {
		depths[current] = depth;
		parents[current] = parent;
		for(int nextNode : tree[current]) {
			if(nextNode != parent) {
				dfs(nextNode, depth+1, current);
			}
		}
	}
	static public int LCA(int a, int b) {
		int aDepth = depths[a];
		int bDepth = depths[b];
		while(aDepth > bDepth) {
			aDepth--;
			a = parents[a];
		}
		while(bDepth > aDepth) {
			bDepth--;
			b = parents[b];
		}
		while(a != b) {
			a = parents[a];
			b = parents[b];
		}
		return a;
	}
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    int N = Integer.parseInt(br.readLine());
	    parents = new int[N+1];
	    depths = new int[N+1];
	    tree = new ArrayList[N+1];
	    for(int i=1; i<=N; i++) {
	    	tree[i] = new ArrayList<>();
	    }
	    for(int i=0; i<N-1; i++) {
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	int a = Integer.parseInt(st.nextToken());
	    	int b = Integer.parseInt(st.nextToken());
	    	tree[a].add(b);
	    	tree[b].add(a);
	    }
	    dfs(1,1,0);
	    
	    int M = Integer.parseInt(br.readLine());
	    for(int i=0; i<M; i++) {
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	int a = Integer.parseInt(st.nextToken());
	    	int b = Integer.parseInt(st.nextToken());
	    	
	    	int result = LCA(a,b);
	    	
	    	bw.append(String.valueOf(result+"\n"));
	    }
	    bw.flush();
	    bw.close();
	    br.close();
	    }
	}
