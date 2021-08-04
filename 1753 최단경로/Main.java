package Baekjoon;

import java.io.*;
import java.util.*; 

class Node implements Comparable<Node> {
	int end;
	int weight;
	Node(int end,int weight){
		this.end = end;
		this.weight = weight;
	}
	public int compareTo(Node o) {
		return weight - o.weight;
	}
}

public class Main { 
	/*
	 * 1753 problem
	 */
	
	static int v,e,k;
	static List<Node>[] list;
	static int[] dist;
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		v = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(br.readLine());
		list = new ArrayList[v+1];
		dist = new int[v+1];
		
		Arrays.fill(dist, 10000000);
		for(int i=1; i<=v; i++) {
			list[i] = new ArrayList<>();
		}
		for(int i=0; i<e; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			list[start].add(new Node(end,weight));
		}
		StringBuilder sb = new StringBuilder();
		dij(k);
		for(int i=1; i<=v; i++) {
			if(dist[i] == 10000000) sb.append("INF\n");
			else sb.append(dist[i] + "\n");
		}
		bw.write(sb.toString());
		
		br.close();
		bw.flush();
		bw.close();
	}
	public static void dij(int start) {
		PriorityQueue<Node> q = new PriorityQueue();
		boolean[] check = new boolean[v+1];
		q.add(new Node(start,0));
		dist[start] = 0;
		while(!q.isEmpty()) {
			Node node = q.poll();
			int cur = node.end;
			
			if(check[cur] ==true) continue;
			check[cur] = true;
			System.out.println(dist[cur]);
			for(Node node2 : list[cur]) {
				System.out.println("A "+dist[node2.end]+" b "+(dist[cur]));
				if(dist[node2.end] > dist[cur] + node2.weight) {
					System.out.println("A "+dist[node2.end]+" b "+(dist[cur]));
					dist[node2.end] = dist[cur] + node2.weight;
					q.add(new Node(node2.end,dist[node2.end]));
				}
			}
		}
	}
	
}
