import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
		static int N,arr[];
		public static boolean np() {
			int i = N-1;
			while(i>0 && arr[i-1] >= arr[i]) i--;
			
			if(i==0) {
				System.out.println(-1);
				return false;
			}
			int j = N-1;
			while(arr[i-1] >= arr[j]) j--;
			
			int temp = arr[i-1];
			arr[i-1] = arr[j];
			arr[j] = temp;
			
			int k = N-1;
			while(i<k) {
				temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				i++;
				k--;
			}
			
			for(int v : arr) {
				System.out.print(v+" ");
			}
			return true;
		}
	    public static void main(String[] args) throws Exception {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        N = Integer.parseInt(br.readLine());
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        arr = new int[N];
	        for(int i=0; i<N; i++) {
	        	arr[i] = Integer.parseInt(st.nextToken());
	        }
	        np();
	        br.close();
	        bw.flush();
	        bw.close();
	    }
	}
