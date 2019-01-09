package Task1;
import java.util.*;
import Task1.Student;
public final class StudentManagement{
	protected final List<Student> students;

	public StudentManagement(final List<Student> students){
		this.students=students;
	}

	public List<Student> getStudents(){
		return students;
	}
}