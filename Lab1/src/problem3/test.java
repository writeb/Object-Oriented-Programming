package problem3;

public class test {
	public static void main(String[] args) {
		Temperature temp = new Temperature();
		temp.setScale('F');
		temp.setValue(86);
		System.out.println(temp.getDegreeC());
		
	}
}
