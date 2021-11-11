import java.util.*;
import java.io.*;
	
	class Main {
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	int N = Integer.parseInt(st.nextToken());
	    	int M = Integer.parseInt(st.nextToken());
	    	int arr[] = new int[M];
	    	int num = 0;
	    	LinkedList<Integer> q = new LinkedList<>();
	    	
	    	st = new StringTokenizer(br.readLine());
	    	for(int i=0; i<M; i++) {
	    		arr[i] =  Integer.parseInt(st.nextToken());
	    	}
	    	//q에 값넣어주기
	    	for(int i=0; i<N; i++) {
	    		q.add(i+1);
	    	}
	    	for(int i=0; i<M; i++) {
	    		while(q.peek() != arr[i]) {
	    			int temp = q.size()/2;
	    			//뽑으려는 값이 중간보다 앞에 있을 때 
	    			if(q.indexOf(arr[i]) <= temp) {
	    				num++;
	    				int temp2 = q.poll();
	    				q.add(temp2);
	    			}
	    			//뽑으려는 값이 중간보다 뒤에 있을 때
	    			else {
	    				num++;
	    				int temp2 = q.pollLast();
	    				q.addFirst(temp2);
	    			}
	    		}
	    		//while문 탈출 했으므로, q.peek == arr[i]라는 뜻
	    		//뽑아내기
	    		q.poll();
	    	}
	    	bw.write(String.valueOf(num));
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}