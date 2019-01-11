import java.io.File;
public class ListAllJavaFiles{
	public static void main(String args[]) {
		final String givenDir = args[0];
		File file = new File(givenDir);
		if (!file.isDirectory()) {
			System.out.println("Error enter correct directory");
			return;
		}
		String list[] = file.list();
		for(String fileName : list) {
			if(fileName.endsWith(".java")) {
				System.out.println(fileName);
			}
		}
	}
}