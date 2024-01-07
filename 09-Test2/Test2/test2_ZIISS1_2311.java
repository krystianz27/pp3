/**
 * 1. Save this program along with your programs (C1.java,C2.java,...) in the same folder
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
import java.util.HashMap;

public class test2_ZIISS1_2311 {
	static int total=0;
	static String r = ""; 
	
	public static void main(String[] args) {
		HashMap<String, Integer> results = new HashMap<String, Integer>();

		// C1
		try {
			int[] n1 = {9,8,7,6,5,4,3,2};
			int[] n2 = {1,2,3,4,5};
			assert C1.m1(n1,n2) == 4;
			assert C1.m2(n1) == 8;
			results.put("C1", 1);
		} catch (Throwable e) {
			results.put("C1", 0);
		}

		// C2
		try {
			int[] n1 = {2,2,2,2,-2,-2,-2,-1};
			int[] n2 = {2,2,2,2,-2,-2,-2,-3};
			assert C2.m(n1) == true;
			assert C2.m(n2) == false;
			results.put("C2", 1);
		} catch (Throwable e) {
			results.put("C2", 0);
		}

		// C3
		try {
			C3 f = new C3("program.java");
			assert f.m1().equals("program");
			assert f.m2().equals(".java");
			results.put("C3", 1);
		} catch (Throwable e) {
			results.put("C3", 0);
		}
		
		// C4
		try {
			int[] g = {5,4,3,2,1};
			C4 c = new C4(g);
			assert c.m() == 9;
			results.put("C4", 1);
		} catch (Throwable e) {
			results.put("C4", 0);
		}

		// C5
		try {
			String[] w1 = {"a","aa","aaa","aaaa"};
			String[] w2 = {"aaaa","aa","aaa","aaaa"};
			assert new C5(w1).m() == false;
			assert new C5(w2).m() == true;
			results.put("C5", 1);
		} catch (Throwable e) {
			results.put("C5", 0);
		}

		// C6
		try {
			Person p1 = new Person("A",25);
			Person p2 = new Person("B",25);
			Person p3 = new Person("C",25);
			Person p4 = new Person("D",25);
			Person p5 = new Person("E",17);
			Person p6 = new Person("F",17);
			C6 f = new C6();
			f.m1(p1);f.m1(p2);f.m1(p3);f.m1(p4);f.m1(p5);f.m1(p6);
			assert f.m2() == 4;
			results.put("C6", 1);
		} catch (Throwable e) {
			results.put("C6", 0);
		}

		// C7
		try {
			C7 c = new C7(7,260);
			assert c.spec()[0] == 7; 
			assert c.spec()[1] == 260;
			results.put("C7", 1);
		} catch (Throwable e) {
			results.put("C7", 0);
		}




		// Display test results
		//results.forEach((k,v)->System.out.print(k+":"+v+" "));
		results.forEach((k,v)->r += k+":"+v+" ");
		r = r.trim();
		System.out.println(r);
		// Save test results to file
		try {
			FileWriter myWriter = new FileWriter("results.txt");
			myWriter.write(r);
			myWriter.close();
		} catch (IOException e){}
		
	}
}



// Class templates
class C1 {
	public static int m1(int[] a1, int[] a2) {return -1;}
	public static int m2(int[] a) {return -1;}
}

class C2 {
	public static boolean m(int[] n){return true;}
}

class C3 {
	C3(String f){}
	public String m1(){return "";}
	public String m2(){return "";}
}

class C4 {
	C4(int[] g){}
	public int m(){return 0;}	
}

class C5 {
	C5(String[] w){}
	public boolean m(){return false;}
}

class C6 {
	public void m1(Person p){}
	public int m2(){return 0;}
}

class Person {
    private String name;
    private int age;
    Person(String n, int a){name=n; age=a;}
    public String getName(){return name;}
    public int getAge(){return age;}
}

class C7 extends Vehicle {
	private int speed;
	C7(int seats, int speed){super(seats);this.speed=speed;}
	public int[] spec(){int[] a={0,0}; return a; }
}

class Vehicle {
	private int seats;
	Vehicle(int seats){this.seats = seats;}
	public int getSeats(){return seats;}
}
