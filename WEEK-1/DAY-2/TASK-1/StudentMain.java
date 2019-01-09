package Task1;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	protected final static List<Student> initializeStudents(){
		List<Student> students = new ArrayList<>();
		Student s1 = new Student("Emily",23);
		Student s2 = new Student("Brock",23);
		students.add(s1);
		students.add(s2);
		return students;
	} 
	public static void main(String[] args){
		StudentManagement sm = new StudentManagement(initializeStudents());
		List<Student> students = sm.getStudents();
		for(Student student:students){
			System.out.println("Name: "+student.getName()+" Age: "+student.getAge());
		}
	}
}
