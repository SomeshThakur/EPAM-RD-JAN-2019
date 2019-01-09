package Task1;
public class Student{
	protected String name;
	protected int age;

	public Student(final String name,final int age){
		this.name = name;
		this.age = age;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}
}