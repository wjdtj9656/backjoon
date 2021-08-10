package Baekjoon;

import java.io.*;
import java.util.*;


class classTime{
	int start;
	int end;
	classTime(int start, int end){
		this.start = start;
		this.end = end;
	}
}
public class Main { 
	/*
	 * 11000 problem
	 */
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue();
		classTime arr[] = new classTime[num];
		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i] = new classTime(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		}
			Arrays.sort(arr,new Comparator<>() {

				@Override
				public int compare(classTime o1, classTime o2) {
					// TODO Auto-generated method stub
					
					if(o1.start == o2.start) {
						return o1.end - o2.end;
					}
					else {
						return o1.start - o2.start;
					}
				}
				
			});
			pq.add(arr[0].end);
			for(int i=1; i<num; i++) {
				if(pq.peek() <= arr[i].start) {
					pq.poll();
				}
				pq.offer(arr[i].end);
			}
	System.out.println(pq);
		
		System.out.println(pq.size());
		br.close();
		bw.flush();
		bw.close();
	}
}