import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class DirectoryTree extends SimpleFileVisitor<Path> {
	private int depth = 0;

	private void printDepthDelim(String delim) {
		for (int i = 0; i < depth; i++)
			System.out.print(delim);
	}

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		printDepthDelim("|	");
		System.out.println("+-	" + dir.getFileName() + "/");
		depth++;
		return super.preVisitDirectory(dir, attrs);
	}

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {

		printDepthDelim("|	");
		System.out.println();
		depth--;
		return super.postVisitDirectory(dir, exc);
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		printDepthDelim("|	");
		System.out.println("+-	" + file.getFileName());
		return super.visitFile(file, attrs);

	}

	public static void main(String[] args) throws IOException {
		if (args.length == 0) {
			System.err.println("Error enter directory path as arg");
			return;
		}
		DirectoryTree myPathVisitor = new DirectoryTree();
		File tempFile = new File(args[0]);
		if (!tempFile.isDirectory()) {
			System.err.println("Error enter correct directory");
			return;
		}
		Path myDir = tempFile.toPath();
		Files.walkFileTree(myDir, myPathVisitor);
	}
}
