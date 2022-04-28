import java.io.*;
import java.util.*;
import java.util.regex.Pattern;


public class Main {
	static int map[][];
	public static boolean processZero(int row, int col, int val) {
		//가로 
		for(int i=0; i<9; i++) {
			if(map[row][i] == val) return false;
		}
		
		//세로 
		for(int i=0; i<9; i++) {
			if(map[i][col] == val) return false;
		}
		
		
		//3*3 
		int setRow = row/3*3;
		int setCol = col/3*3;
		
		for(int i=setRow; i<setRow+3; i++) {
			for(int j=setCol; j<setCol+3; j++) {
				if(map[i][j] == val) return false;
			}
		}
		return true;
	}
	public static void fillSudoku(int row, int col) {
		if(col == 9) {
			fillSudoku(row+1, 0);
			return;
		}
		if(row == 9) {
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					sb.append(map[i][j]+" ");
				}
				sb.append("\n");
			}
			System.out.println(sb);
			System.exit(0);
		}
		if(map[row][col] == 0) {
			for(int i=1; i<=9; i++) {
				if(processZero(row,col,i)) {
					map[row][col] = i;
					fillSudoku(row,col+1);
				}
			}
			map[row][col] = 0;
			return;
		}
		fillSudoku(row,col+1);
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		map = new int[9][9];
		for(int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<9; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		fillSudoku(0,0);
		bw.flush();
		bw.close();
		br.close();
	}
}
