import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int N = Integer.parseInt(br.readLine());
	    int arr[] = new int[N];
	    int origin[] = new int[N];
	    int num = 30;
	    for(int i=0; i<N; i++) {
	    	arr[i] = Integer.parseInt(br.readLine());
	    	origin[i] = arr[i];
	    }
	    int index = 0;
	    //flag는 현재 진행중인 챕터의 시간이 현재 남은 시간보다 낮을 때 사용하기 위함.
	    boolean flag = false;
	    while(true) {
	    	if(index == N) break;
	    	if(arr[index] < num) {
	    		num -= arr[index];
	    		arr[index] = 0;
	    		index++;
	    		flag = true;
	    		continue;
	    	}
	    	else {
	    		arr[index] -= num;
	    		index++;
	    	}
	    	//시간을 다시 원래대로 복구해줌.
	    	if(flag) {
	    		num = 30;
	    		flag = false;
	    	}
	    }
	    int result = 0;
	    for(int i=0; i<N; i++) {
	    	if(arr[i] <= origin[i]/2) result++;
	    }
	    System.out.println(result);
	    br.close();
	    }
	}
