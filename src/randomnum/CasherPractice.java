package randomnum;

import java.io.IOException;
import java.util.Random;

public class CasherPractice {
	public static void main(String[] args){
		
		Random rd = new Random();
		while(true){
			int digits = Math.abs(rd.nextInt()%10);
			int context = Math.abs(rd.nextInt()%3);
			int num=0;
			String[] messages={"値段","受け取った金額","お釣り"};
				System.out.println(messages[context]);
			switch(digits){
			case 0:
				 num = Math.abs(rd.nextInt()%100);
				 break;
			case 1:
				num = Math.abs(rd.nextInt()%100);
				 break;
			case 2:
				num = Math.abs(rd.nextInt()%100);
				 break;
			case 3:
				num = Math.abs(rd.nextInt()%1000);
				 break;
			case 4:
				num = Math.abs(rd.nextInt()%1000);
				 break;
			case 5:
				num = Math.abs(rd.nextInt()%1000);
				 break;
			case 6:
				num = Math.abs(rd.nextInt()%10000);
				 break;
			case 7:
				num = Math.abs(rd.nextInt()%10000);
				 break;
			case 8:
				num = Math.abs(rd.nextInt()%10000);
				 break;
			case 9:
				num = Math.abs(rd.nextInt()%10000);
				 break;
				 
			}
			System.out.println(num);
			System.out.println();
			try {
				System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
