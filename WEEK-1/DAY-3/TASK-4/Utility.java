
public class Utility {
	public static void main(String[] args) {
		ExampleOfAnnotation e = new ExampleOfAnnotation();
		Class<? extends ExampleOfAnnotation> c = e.getClass();
		Details d = (Details) c.getAnnotation(Details.class);
		System.out.println("Author : " + d.Author());
		System.out.println("Author ID : " + d.AuthorId());
		System.out.println("Date of Creation : " + d.DateOfCreation());
		System.out.println("Version " + d.Version());
	}
}
