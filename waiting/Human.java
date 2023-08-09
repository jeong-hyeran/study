package waiting;

public class Human {
	String name;
	int age;
	
	public Human() {
	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		String format = "%s님 (%d세)";
		Object[] args = {name, age};
		return String.format(format, args);
	}
	
}
