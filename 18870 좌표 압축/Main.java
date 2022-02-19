import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    
	    int N = Integer.parseInt(br.readLine());
	    
	    int arr[] = new int[N];
	    int arr2[] = new int[N];
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    Map<Integer,Integer> m = new HashMap<>();
	    for(int i=0; i<arr.length; i++) {
	    	int temp = Integer.parseInt(st.nextToken());
	    	arr[i] = temp;
	    	arr2[i] = temp;
	    }
	    Arrays.sort(arr);
	    int temp = 0;
	    for(int i=0; i<arr.length; i++) {
	    	if(m.containsKey(arr[i])) continue;
	    	m.put(arr[i], temp++);
	    }
	    for(int i=0; i<arr2.length; i++ ) {
	    	bw.append(String.valueOf(m.get(arr2[i]))+" ");
	    }
	    
	    br.close();
	    bw.flush();
	    bw.close();
	    }
	}
