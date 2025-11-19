import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;


public class PathDemo_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path filePath = Paths.get("../src");
		try {
			BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);
			System.out.println("Creation time: " + attr.creationTime() + "\n");
			System.out.println("Creation time: " + attr.lastModifiedTime() + "\n");
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
