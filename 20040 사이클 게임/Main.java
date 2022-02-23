import java.io.*;
import java.util.*;
public class Main {

	static int N,M,parent[];
	public static void makeSet() {
		parent = new int[N];
		for(int i=0; i<N; i++) {
			parent[i] = i;
		}
	}
	public static int findParent(int a) {
		if(parent[a] == a) return a;
		return parent[a] = findParent(parent[a]);
	}
	
	public static boolean union(int a, int b) {
		int aRoot = findParent(a);
		int bRoot = findParent(b);
		
		if(aRoot == bRoot) {
			return false;
		}
		
		parent[bRoot] = aRoot;
		return true;
	}
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    N = Integer.parseInt(st.nextToken());
	    M = Integer.parseInt(st.nextToken());
	    makeSet();
	    boolean flag = true;
	    for(int i=0; i<M; i++) {
	    	st = new StringTokenizer(br.readLine());
	    	flag = union(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
	    	if(!flag) {
	    		bw.write(String.valueOf(i+1));
	    		break;
	    	}
	    }
	    if(flag) bw.write(String.valueOf(0));
	    
	    br.close();
	    bw.flush();
	    bw.close();
	    }
	}
