import java.util.*;
import java.io.*;

class Node{
	int x;
	int y;
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
class Line{
	Node A,B;
	public Line(Node a, Node b) {
		A = a;
		B = b;
	}
}
class People{
	int x,y,v;
	public People(int x, int y, int v) {
		this.x = x;
		this.y = y;
		this.v = v;
	}
}
public class Main {
	static int N,M;
	static People people[];
	static int start[];
	static ArrayList<Integer> end;
	static ArrayList<Node> nodes;
	static Line[] lines;
	static double map[][];
	public static void makeGraph() {
		for(int i=0; i<N; i++) {
			start[i] = nodes.size();
			nodes.add(new Node(people[i].x, people[i].y));
		}
		int size = nodes.size();
		int endSize = 0;
		Node A,B;
		for(int i=0; i<size; i++) {
			A = nodes.get(i);
			B = new Node(A.x, 0);
			if(canGo(A,B)) {
				nodes.add(B);
				end.add(size + endSize++);
			}
		}
		size = nodes.size();
		map = new double[size][size];
		for(int i=0; i<size; i++) {
			A = nodes.get(i);
			for(int j=0; j<size; j++) {
				if(i==j) continue;
				B = nodes.get(j);
				if(map[i][j] == 0) {
					if(canGo(A,B)) {
						map[i][j] = getDis(A,B);
						map[j][i] = getDis(A,B);
					}
				}
			}
		}
	}
	public static boolean canGo(Node A, Node B) {
		for(Line l : lines) {
			if((l.A.x == A.x && l.A.y == A.y) || (l.B.x == B.x && l.B.y == B.y) || (l.A.x == B.x && l.A.y == B.y) || (l.B.x == A.x && l.B.y == A.y)) continue;
			if(isIntersect(A,B,l.A,l.B)) return false;
		}
		return true;
	}
	public static boolean isIntersect(Node A, Node B, Node C, Node D) {
		int AB = ccw(A,B,C) * ccw(A,B,D);
		int CD = ccw(C,D,A) * ccw(C,D,B);
		if(AB <= 0 && CD <= 0) return true;
		else return false;
	}
	public static int ccw(Node A, Node B, Node C) {
		int op1 = (A.x * B.y) + (B.x * C.y) + (C.x * A.y);
		int op2 = (A.y * B.x) + (B.y * C.x) + (C.y * A.x);
		op1 -= op2;
		if(op1 > 0) return 1;
		else if(op1 == 0) return 0;
		else return -1;
 	}
	public static double getDis(Node A, Node B) {
		return Math.sqrt(Math.pow(A.x - B.x, 2) + Math.pow(A.y - B.y, 2));
	}
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		people = new People[N];
		start = new int[N];
		end = new ArrayList<>();
		nodes = new ArrayList<>();
		lines = new Line[M];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(),"()-, ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			people[i] = new People(x, y, v);
		}
		Node A,B;
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine(),"()-, ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			A = new Node(x1,y1);
			B = new Node(x2,y2);
			nodes.add(A);
			nodes.add(B);
			lines[i] = new Line(A,B);
		}
		makeGraph();
		int size = nodes.size();
		double result[][] = new double[size][size];
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(map[i][j] == 0) result[i][j] = (double)10e9;
				else result[i][j] = map[i][j];
			}
		}
		
		for(int k=0; k<size; k++) {
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					result[i][j] = Math.min(result[i][k] + result[k][j], result[i][j]);
				}
			}
		}
		double maxTime = 0;
		double time = 0;
		for(int i=0; i<N; i++) {
			double distance = (double)10e9;
			for(int j=end.size(); j>0; j--) {
					distance = Math.min(distance, result[start[i]][nodes.size()-j]);
					time = distance / people[i].v;
			}
			maxTime = Math.max(time, maxTime);
		}
		System.out.println(Math.round(maxTime*10)/10.0);
		br.close();
	}
}
