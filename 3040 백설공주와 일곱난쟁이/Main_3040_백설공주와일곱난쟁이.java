import java.util.*;
import java.io.*;

public class Main_3040_백설공주와일곱난쟁이 {
	static int arr[],result[];
	public static void combination(int cnt, int start) {
		if(cnt == 7) {
			int sum = 0;
			for(int i : result) {
				sum += i;
			}
			if(sum == 100) {
				for(int i : result) {
					System.out.println(i);
				}
			}
			return;
		}
		
		for(int i=start; i<9; i++) {
			result[cnt] = arr[i];
			combination(cnt+1,i+1);
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		arr = new int[9];
		result = new int[7];
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		combination(0,0);
		
		br.close();
//		bw.flush();
//		bw.close();
	}

}
