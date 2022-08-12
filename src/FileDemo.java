import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a file path : ");
		String path = sc.nextLine().trim();
		File file = new File(path);
		System.out.println("getPath() = " + file.getPath());
		System.out.println("getAbsolutePath() = " + file.getAbsolutePath());
		System.out.println("getCanonicalpath() = " + file.getCanonicalPath());
	}
}
