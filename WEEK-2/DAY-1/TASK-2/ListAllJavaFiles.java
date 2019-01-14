import java.io.File;
public class ListAllJavaFiles{

	public void printDirFiles(File file){
		for(String fileName:file.list())
		{
			File currFile = new File(file.getAbsolutePath()+"\\"+fileName);
			if(currFile.isDirectory()){
				System.out.println("+- "+fileName+"/")
				printDirFiles(currFile);
			}else{
				System.out.println("|	+- "+fileName)
			}
		}
	}

	public static void main(String args[]) {
		final String givenDir = args[0];
		File file = new File(givenDir);
		if (!file.isDirectory()) {
			System.out.println("Error enter correct directory");
			return;
		}
		String list[] = file.list();
		for(String fileName : list) {
			if() {
				System.out.println(fileName);
			}
		}
	}
}