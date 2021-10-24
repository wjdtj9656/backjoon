import java.util.*;
import java.util.stream.IntStream;
import java.awt.Point;
import java.io.*;
	
	class Main {
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	char map[][] = new char[8][8];
	    	int result = 0;
	    	
	    	
	    	for(int i=0; i<8; i++) {
	    		String s = br.readLine();
	    		for(int j=0; j<8; j++) {
	    			map[i][j] = s.charAt(j);
	    			//Â¦¼öÁÙ¿¡ Â¦¼ö¹øÂ° Ä­ °Ë»ç(0µµ Â¦¼ö)
	    			if(i%2==0) {
	    				if(j%2==0) {
	    					if(map[i][j] == 'F') result++;
	    				}
	    			}
	    			//È¦¼öÁÙ¿¡ È¦¼ö¹øÂ° Ä­ °Ë»ç
	    			else if(i%2==1) {
	    				if(j%2==1) {
	    					if(map[i][j] == 'F') result++;
	    				}
	    			}
	    		}
	    	}
	    	bw.write(String.valueOf(result));
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}