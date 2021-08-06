package Baekjoon;

import java.io.*;
import java.util.*;
public class Main { 
	/*
	 * 13305 problem
	 */
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int numCity = Integer.parseInt(br.readLine());
		long distance[] = new long[numCity];
		long price[] = new long[numCity+1];
		int minPrice = 1000000000;
		long result = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<numCity-1; i++) {
			distance[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<numCity; i++) {
			price[i] = Integer.parseInt(st.nextToken());
			
			
		}
		for(int i=0; i<numCity; i++) {
			if(i == numCity-1) break;
			if(minPrice > price[i]) {
				minPrice = (int) price[i];
			}
			if(minPrice == price[i]) {
				result += distance[i] * minPrice;
			}
			else {
				if(price[i] == minPrice) {
					for(int j=i; j<numCity-1; j++) {
						result += distance[j] * minPrice;
					}
					break;
				}
				result += distance[i] * minPrice;
			}
		}
		bw.write(String.valueOf(result));
		br.close();
		bw.flush();
		bw.close();
	}
}