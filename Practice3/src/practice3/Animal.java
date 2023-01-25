package practice3;

public class Animal {
	String name;
	Animal(){
		name = "unknown";
	}
	Animal(String name){
		this.name = name;
	}
	String voice() {
		return "";
	}
	String findMeat() {
		return "";
	}
	String move(String name) {
		return this.name + " is running";
	}
	String move() {
		return "";
	}
	public String toString() {
		return this.name;
	}
}
