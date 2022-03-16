import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int dpMax[] = new int[3];
		int dpMin[] = new int[3];
		int dp[] = new int[3];
		int minResult = (int)10e9;
		int maxResult = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<3; i++) {
			dpMin[i] = dpMax[i] = Integer.parseInt(st.nextToken());
			
		}
		for(int i=0; i<N-1; i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			int num3 = Integer.parseInt(st.nextToken());
			int temp[] = new int[3];
			temp[0] = Math.max(dpMax[0]+num1, dpMax[1]+num1);
			temp[1] = Math.max(dpMax[0]+num2, Math.max(dpMax[1]+num2, dpMax[2]+num2));
			temp[2] = Math.max(dpMax[1]+num3, dpMax[2]+num3);
			for(int j=0; j<3; j++) {
				dpMax[j] = temp[j];
			}
			temp[0] = Math.min(dpMin[0]+num1, dpMin[1]+num1);
			temp[1] = Math.min(dpMin[0]+num2, Math.min(dpMin[1]+num2, dpMin[2]+num2));
			temp[2] = Math.min(dpMin[1]+num3, dpMin[2]+num3);
			for(int j=0; j<3; j++) {
				dpMin[j] = temp[j];
			}
		}
		
		for(int i=0; i<3; i++) {
			maxResult = Math.max(maxResult, dpMax[i]);
			minResult = Math.min(minResult, dpMin[i]);
		}
		bw.write(String.valueOf(maxResult+" "+minResult));
		bw.flush();
		br.close();
		bw.close();
	}

}
