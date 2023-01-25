package practice3;
import java.util.Scanner ;
import java.util.Vector; 


public class test2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student s1 = new Student("Assylan", "Kalkaman - 2s", "IS", 2021, 5000);
		Student s2 = new Student("Almas", "VOKZAL ", "IS", 2021, 5000);
//		System.out.println(s1.toString());
//		Staff sf1 = new Staff();
//		
		Vector<Person> v = new Vector<Person>();
		v.add(s1);
//		v.add(sf1);
		v.add(s2) ; 
		
//		for(Person p : v)
//			System.out.println(p);
			System.out.println(v) ; 
	}
}
