import java.util.Scanner;

public class digitalClock {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter current time with space inbetween >");
		String hours = sc.next();
		String minutes = sc.next();
		
		myClock(Integer.parseInt(hours), Integer.parseInt(minutes));
		sc.close();
	}
	
	public static void myClock(int h, int m) throws InterruptedException{
		//int minutes = m;
		int s = 00; //Setting seconds value to zero
		while (true) {
			if(s != 60) { //if seconds value is not equal to 60
				System.out.print("\t\t"+h+":"+m+":"+s+"\r"); //printing the time here
				Thread.sleep(1000);//this thing makes the count wait for 1 second
				s += 01;       //this is the second counter, it counts seconds up-to 60
			}else {            //if the s(seconds) reached 60
				m += 1;       //count the minutes to one
				s=00;         //make second come from start, so make it to zero
				if(m==60) {  //if the minutes(m) equals to 60
					m = 00;  //make minutes come from start
					h += 1;  //increase the hour plus one
					if(h == 24) {
						h = 00;
					}
				}
			}
		}
	}
}
