import java.util.*;
import java.io.*;
class Node implements Comparable<Node>{
	private int index;
	private int second;
	private int x;
	private int y;
	
	public Node(int index,int second, int x, int y) {
		this.index = index;
		this.second = second;
		this.x = x;
		this.y = y;
	}
	public int getIndex() {
		return this.index;
	}
	public int getSecond() {
		return this.second;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	@Override
	public int compareTo(Node o) {
		
		if(this.index < o.index) {
			return -1;
		}
		return 1;
	}
}
public class Main {
	static int n,k;
	static int[][] graph = new int[200][200];
	static ArrayList<Node> node = new ArrayList<Node>();
	
	static int dx[]= {-1,1,0,0};
	static int dy[]= {0,0,-1,1};
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken());
    	int k = Integer.parseInt(st.nextToken());
    	
    	for(int i=0; i<n; i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j=0; j<n; j++) {
    			graph[i][j] = Integer.parseInt(st.nextToken());
    			if(graph[i][j] != 0) {
    				node.add(new Node(graph[i][j],0,i,j));
    			}
    		}
    	}
    	
    	Collections.sort(node);
    	Queue<Node> q = new LinkedList<>();
    	for(int i=0; i<node.size(); i++) {
    		q.offer(node.get(i));
    	}
    	st = new StringTokenizer(br.readLine());
    	int targetS = Integer.parseInt(st.nextToken());
    	int targetX = Integer.parseInt(st.nextToken());
    	int targetY = Integer.parseInt(st.nextToken());
    	
    	while(!q.isEmpty()) {
    		Node node = q.poll();
    		if(node.getSecond() == targetS) break;
    		for(int i=0; i<4; i++) {
    			int ax = node.getX() + dx[i];
    			int ay = node.getY() + dy[i];
    			
    			if(0<=ax && ax<n && 0<=ay && ay<n) {
    				if(graph[ax][ay] == 0) {
    					graph[ax][ay] = node.getIndex();
    					q.offer(new Node(node.getIndex(),node.getSecond()+1,ax,ay));
    				}
    			}
    		}
    	}
    	bw.write(String.valueOf(graph[targetX-1][targetY-1]));
    	br.close();
    	bw.flush();
    	bw.close();
    }
}