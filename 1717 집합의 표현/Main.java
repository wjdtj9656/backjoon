import java.io.*;
import java.util.*;

public class Main {
	static int n,m,parent[];
	
	static public void makeSet() {
		parent = new int[n+1];
		for(int i=0; i<=n; i++) {
			parent[i] = i;
		}
	}
	static public int findParent(int a) {
		if(parent[a] == a) return a;
		return parent[a] = findParent(parent[a]);
	}
	static public boolean union(int a, int b) {
		int aRoot = findParent(a);
		int bRoot = findParent(b);
		if(aRoot == bRoot) return false;
		parent[bRoot] = aRoot;
		return true;
	}
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    n = Integer.parseInt(st.nextToken());    
	    m = Integer.parseInt(st.nextToken());
	    StringBuilder sb = new StringBuilder();
	    makeSet();
	    for(int i=0; i<m; i++) {
	    	st = new StringTokenizer(br.readLine());
	    	int instruction = Integer.parseInt(st.nextToken());
	    	int num1 = Integer.parseInt(st.nextToken());
	    	int num2 = Integer.parseInt(st.nextToken());
	    	if(instruction == 0) {
	    		union(num1,num2);
	    	}
	    	else {
	    		if(findParent(num1) == findParent(num2)) sb.append("YES"+"\n");
	    		else sb.append("NO"+"\n");
	    	}
	    }
	    bw.write(sb.toString());
	    br.close();
	    bw.flush();
	    bw.close();
	    }
	}
