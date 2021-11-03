import java.util.*;
import java.util.stream.IntStream;
import java.awt.Point;
import java.io.*;
	
	class Main {
		static ArrayList list[] = new ArrayList[4];
		public static void run(int gearNum,int direction) {
			//¿ŞÂÊ Åé´Ï¹ÙÄû¿Í ºñ±³
			left(gearNum-1, -direction);
			//¿À¸¥ÂÊ Åé´Ï¹ÙÄû¿Í ºñ±³
			right(gearNum+1, -direction);
			
			rotate(gearNum, direction);
		}
		public static void left(int gearNum, int direction) {
			if(gearNum < 0) return;
			//¿ŞÂÊ Åé´Ï ¹ÙÄû¿Í ÇöÀç ¹ÙÄû°¡ °°¾Æ¼­ ¸ØÃßÁö ¾Ê´Â´Ù¸é ±× ¿ŞÂÊ Åé´Ï¹ÙÄûµµ Àç±Í·Î È£Ãâ
			if(list[gearNum].get(2) != list[gearNum+1].get(6)) {
				left(gearNum-1, -direction);
				rotate(gearNum,direction);
			}
		}
		public static void right(int gearNum, int direction) {
			if(gearNum > 3) return;
			if(list[gearNum].get(6) != list[gearNum-1].get(2)) {
				right(gearNum+1, -direction);
				rotate(gearNum,direction);
			}
		}
		public static void rotate(int gearNum, int direction) {
			//¹İ½Ã°è È¸Àü
			if(direction == -1) {
				char temp = (char) list[gearNum].get(0);
				list[gearNum].remove(0);
				list[gearNum].add(temp);
			}
			//½Ã°è È¸Àü
			else {
				char temp = (char) list[gearNum].get(7);
				list[gearNum].remove(7);
				list[gearNum].add(0, temp);
			}
		}
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    	for(int i=0; i<4; i++) {
	    		list[i] = new ArrayList<>();
	    		String temp = br.readLine();
	    		for(int j=0; j<8; j++) {
	    			list[i].add(temp.charAt(j));
	    		}
	    	}
	    	int num = Integer.parseInt(br.readLine());
	    	for(int i=0; i<num; i++) {
	    		StringTokenizer st = new StringTokenizer(br.readLine());
	    		int gearNum = Integer.parseInt(st.nextToken());
	    		int direction = Integer.parseInt(st.nextToken());
	    		run(gearNum-1,direction);
	    	}
	    	int result = 0;
	    	for(int i=0; i<4; i++) {
	    		result += ((char)list[i].get(0)-'0') * Math.pow(2, i);
	    	}
	    	bw.write(String.valueOf(result));
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}