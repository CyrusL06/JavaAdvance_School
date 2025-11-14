import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import java.nio.file.Files;

import java.nio.file.Path;

import java.nio.file.Paths;

//SOLVES EVERYTHING
import static java.nio.file.StandardOpenOption.*;

import java.io.IOException;


public class RandomAccessTest_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path file = Paths.get("Numbers.txt");
		String s = "XYZ";
		
		byte [] data = s.getBytes();
		ByteBuffer out = ByteBuffer.wrap(data);
		FileChannel fc = null;
		
		try {
			fc = (FileChannel)Files.newByteChannel(file, READ, WRITE);
			
			fc.position(0);
			while(out.hasRemaining())
				fc.write(out);
			//Reloads the byte so you can use it agaian
			out.rewind();
			
			fc.position(22);
			while(out.hasRemaining())
				fc.write(out);
			out.rewind();

			
			fc.position(12);
			while(out.hasRemaining())
				fc.write(out);
			
			fc.close();
			
			System.out.print("DOne");
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
