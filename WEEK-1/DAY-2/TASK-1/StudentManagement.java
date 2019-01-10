package Task1;
import java.util.*;
import Task1.Student;
public final class StudentManagement{
	private final List<Student> students;

	public StudentManagement(final List<Student> students){\
		/*Even if the list is final its modifiable, so we use Collection.unmodifiable to acheive immutablity*/
		this.students=Collections.unmodifiableList(students);
	}

	public List<Student> getStudents(){
		return students;
	}
}