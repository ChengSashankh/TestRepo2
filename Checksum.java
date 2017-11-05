// Sashankh Chengavalli Kumar - A0162363J
// Assignment 0 Exercise 2
// Tutorial Group 9
import java.util.*;
import java.nio.file.*;
import java.util.zip.CRC32;
class Checksum{

	public static void main(String[] args)
	{
		byte[] bytes;
		try{
			bytes = Files.readAllBytes(Paths.get(args[0]));
			CRC32 crc = new CRC32();
			crc.update(bytes);
			System.out.println(crc.getValue());
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

