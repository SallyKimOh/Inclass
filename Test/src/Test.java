import java.util.Random;

/**
 * 
 */

/**
 * @author ssang_000
 *
 */
public class Test {


	void incrementValue(int[] inMethod) {
		inMethod[0] ++;
		System.out.println("in Method: "+inMethod[0]);
	}

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arOriginal = {10,20,30};
		System.out.println("Original before: "+arOriginal[0]);
//		incrementValue(original);
		System.out.println("Original after: "+arOriginal[0]);
		
		 
		int abc[] = new int[3];
		
		String a1 = "abc";
		String a2 = "abc";
		String a3 = new String("abc");
		
		if (a1 == a2) {
			System.out.println("A1");
		} else {
			System.out.println("A2");
		}
		if (a2 == a3) {
			System.out.println("A3");
		} else {
			System.out.println("A4");
		}
		
		
			Time time1 = new Time();
			int test1 = time1.testHours;
			
			Time time4 = new Time(1);

			
//			int test2 = time1.hours;

//			time1.inputHours ();
//			time1.inputMinutes ();
//			time1.inputSeconds();
//			time1.display();
//			System.out.println("The total time in seconds is "+time1.calcTotalSeconds());
			
//			Time time2 = new Time(10, 0, 0);
//			time2.inputHours();
//			time2.display();
//			
//			Time ourtime = new Time(time2);
//			ourtime.display();
			
			
//			System.out.println();
	Math.min(1, 2);
	
//	int num = 24;
//	if (num = 23)
//		System.out.println("num is 23");
//	else System.out.println("num is not 23");
//	
//	if (num == 2);
//	System.out.println("AFDS");
//	
	
	Random rnd = new Random();
//	char letterValue=(char)(rnd.nextInt(5)+'A');
	char letterValue=(char)(rnd.nextInt(2)+'A');
	
	System.out.println(letterValue);

	}

	
	  public void numbering(int init, int limit) {
	      int i = init;
	      while (i < limit) {
	         System.out.println(i);
	         i++;
	      }
	   }   
	
}
