package problem2;



public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student(030133, "Assylan", "Almaty", Gender.MALE);
		Student s2 = new Student(110232, "Ben", "Astana", Gender.MALE);
		Student s3 = new Student();
		s3.setParameters("Tom", "Almaty");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		System.out.println(Student.cnt);
	}
}
