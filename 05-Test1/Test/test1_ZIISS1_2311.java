/**
 * 1. Save this program along with your programs (C1.java .. C6.java) in the same folder
 * 2. Open a terminal window
 * 3. Compile this program
 *    javac ThisProgramName.java
 * 4. Compile your programs:
 *    javac C?.java
 * 5. Run this program:
 *    java -ea ThisProgramName
 * 6. Test1 results will be saved to a file results.txt
 *  
 */


import java.io.FileWriter;
import java.io.IOException;
//import java.util.Arrays;
import java.util.HashMap;

public class test1_ZIISS1_2311 {
	static String r = ""; 
	
	public static void main(String[] args) {
		HashMap<String, Integer> results = new HashMap<String, Integer>();

		// C1
		try {
			int[] arr1 = {111,222,333,444,555,666};
			int[] arr2 = {444,555,666,777,888,700,600};
			assert C1.different(arr1,arr2) == 3;
			assert C1.secondMax(arr2) == 777;
			results.put("C1", 1);
		} catch (Throwable e) {
			results.put("C1", 0);
		}

		// C2
		try {
			C2 o = new C2(3,7);
			assert o.minutes() == 187;
			assert o.toString().equals("03:07"); 
			results.put("C2", 1);
		} catch (Throwable e) {
			results.put("C2", 0);
		}

		// C3
		try {
			C3 c = new C3();
			assert c.value() == 0;
			c.increase();
			c.decrease();
			c.increase(7);
			c.increase(-3);
			c.decrease(1);
			assert c.value() == 6;
			c.cancel();
			assert c.value() == 0;
			results.put("C3", 1);
		} catch (Throwable e) {
			results.put("C3", 0);
		}

		// C4
		try {
			C4 c = new C4(23,55);
			assert c.getHour() == 23;
			assert c.getMinute() == 55;
			c.add();
			c.add();
			assert c.getHour() == 23;
			assert c.getMinute() == 57;
			c.add();
			c.add();
			c.add();
			c.add();
			c.add();
			c.add();
			assert c.getHour() == 0;
			assert c.getMinute() == 3;
			results.put("C4", 1);
		} catch (Throwable e) {
			results.put("C4", 0);
		}

		// C5
		try {
			assert C5.m("displays").equals("d+i-s+p-l+a-y+s");
			assert C5.m("ok").equals("o+k");
			assert C5.m("f").equals("f");
			results.put("C5", 1);
		} catch (Throwable e) {
			results.put("C5", 0);
		}

		// C6
		try {
			C6 p = new C6();
			p.setName("disPLAY");
			assert p.getName().equals("Display");
			p.setPrice(7f);
			assert p.getPrice() == 7f;
			p.setPrice(8f);
			assert p.getPrice() == 8f;
			p.setPrice(-3f);
			assert p.getPrice() == 8f;
			results.put("C6", 1);
		} catch (Throwable e) {
			results.put("C6", 0);
		}



		// Display test results
		System.out.println(results);
		try {
			FileWriter myWriter = new FileWriter("results.txt");
			myWriter.write(results.toString());
			myWriter.close();
		} catch (IOException e){}
		
	}
}



// Class templates

class C1 {
	public static int different(int[] array1, int[] array2){return 0;}
	public static int secondMax(int[] array){return 0;}
}

class C2 {
	public C2(int hours, int minutes){}
	public int minutes(){return 0;}
	public String toString(){return "";}
}

class C3 {
	public void increase(){}
	public void decrease(){}
	public void increase(int n){}
	public void decrease(int n){}
	public int value(){return 0;}
	public void cancel(){}
}

class C4 {
	public C4(int hour, int minute){}
	public void setHour(int hour){}
	public void setMinute(int minute){}
	public int getHour(){return 0;}
	public int getMinute(){return 0;}
	public void add(){}
}

class C5 {
	public static String m(String t){return "";}
}

class C6 {
	public void setName(String name){}
	public void setPrice(float price){}
	public void setImported(boolean imported){}
	public String getName(){return "";}
	public float getPrice(){return 0f;}
	// public boolean getImported(){return false;}
}
