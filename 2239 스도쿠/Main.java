import java.io.*;
import java.util.*;

public class Main {
	static int map[][];
	static StringBuilder sb = new StringBuilder();
	public static void fillSudoku(int row, int col) {
		if(col == 9) {
			fillSudoku(row+1,0);
			return;
		}
		else if(row == 9) {
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					sb.append(map[i][j]);
				}
				sb.append("\n");
			}
			System.out.println(sb);
			System.exit(0);
		}
		if(map[row][col] == 0) {
			for(int i=1; i<=9; i++) {
				if(zeroCheck(row,col,i)) {
					map[row][col] = i;
					fillSudoku(row,col+1);
				}
			}
			//0에 들어갈값 못찾았음
			map[row][col] = 0;
			return;
		}
		fillSudoku(row,col+1);
	}
	public static boolean zeroCheck(int row, int col, int val) {
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
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		map = new int[9][9];
		for(int i=0; i<9; i++) {
			String temp = br.readLine();
			for(int j=0; j<9; j++) {
				map[i][j] = temp.charAt(j) -'0';
			}
		}
		fillSudoku(0,0);

		bw.flush();
		bw.close();
		br.close();
	}
}
