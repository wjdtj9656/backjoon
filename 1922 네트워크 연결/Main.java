import java.io.*;
import java.util.*;
class ComputerLine implements Comparable<ComputerLine>{
	int from;
	int to;
	int weight;
	
	public ComputerLine(int from, int to, int weight) {
		this.from = from;
		this.to = to;
		this.weight = weight;
	}
	@Override
	public int compareTo(ComputerLine o) {
		// TODO Auto-generated method stub
		return this.weight - o.weight;
	}
	
}
public class Main {

	static int N,M,parent[];
	static ComputerLine[] computer;
	public static void makeSet() {
		parent = new int[N];
		for(int i=1; i<=N; i++) {
			parent[i-1] = i;
		}
	}
	public static int findParent(int a) {
		if(parent[a-1] == a) return a;
		return parent[a-1] = findParent(parent[a-1]);
	}
	
	public static boolean union(int a, int b) {
		int aRoot = findParent(a);
		int bRoot = findParent(b);
		
		if(aRoot == bRoot) {
			return false;
		}
		
		parent[bRoot-1] = aRoot;
		return true;
	}
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    N = Integer.parseInt(br.readLine());
	    M = Integer.parseInt(br.readLine());
	    int result = 0;
	    makeSet();
	    computer = new ComputerLine[M];
	    for(int i=0; i<M; i++) {
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	int from = Integer.parseInt(st.nextToken());
	    	int to = Integer.parseInt(st.nextToken());
	    	int weight = Integer.parseInt(st.nextToken());
	    	computer[i] = new ComputerLine(from,to,weight);
	    }
	    Arrays.sort(computer);
	    
	    for(int i=0; i<M; i++) {
	    	if(union(computer[i].from, computer[i].to)) {
	    		result += computer[i].weight;
	    	}
	    }
	    bw.write(String.valueOf(result));
	    br.close();
	    bw.flush();
	    bw.close();
	    }
	}
