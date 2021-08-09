package Baekjoon;

import java.io.*;
import java.util.*;

class Jew{
	int weight;
	int value;
	
	Jew(int weight, int value){
		this.weight = weight;
		this.value = value;
	}
}
public class Main { 
	/*
	 * 1202 problem
	 */
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Jew[] jew = new Jew[N];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int weight = Integer.parseInt(st.nextToken());
			int value = Integer.parseInt(st.nextToken());
			jew[i] = new Jew(weight,value);
		}
		
		Arrays.sort(jew,new Comparator<Jew>() {
			
			public int compare(Jew o1, Jew o2) {
				if(o1.weight == o2.weight) {
					return o2.value - o1.value;
				}
				return o1.weight - o2.weight;
			}
		});
		int bags[] = new int[K];
		for(int i=0; i<K; i++) {
			bags[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(bags);
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		
		long ans = 0;
		for(int i=0,j=0; i<K; i++) {
			while(j < N && jew[j].weight <= bags[i]) {
				pq.offer(jew[j++].value);
			}
			if(!pq.isEmpty()) {
				ans += pq.poll();
			}
		}
		bw.write(ans +"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}
}