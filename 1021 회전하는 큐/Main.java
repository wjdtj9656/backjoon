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
	    	//q�� ���־��ֱ�
	    	for(int i=0; i<N; i++) {
	    		q.add(i+1);
	    	}
	    	for(int i=0; i<M; i++) {
	    		while(q.peek() != arr[i]) {
	    			int temp = q.size()/2;
	    			//�������� ���� �߰����� �տ� ���� �� 
	    			if(q.indexOf(arr[i]) <= temp) {
	    				num++;
	    				int temp2 = q.poll();
	    				q.add(temp2);
	    			}
	    			//�������� ���� �߰����� �ڿ� ���� ��
	    			else {
	    				num++;
	    				int temp2 = q.pollLast();
	    				q.addFirst(temp2);
	    			}
	    		}
	    		//while�� Ż�� �����Ƿ�, q.peek == arr[i]��� ��
	    		//�̾Ƴ���
	    		q.poll();
	    	}
	    	bw.write(String.valueOf(num));
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}