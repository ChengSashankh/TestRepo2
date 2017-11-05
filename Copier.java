//Sashankh Chengavalli Kumar - A0162363J
//Assignment 0 Exercise 3
//Tutorial group 9
import java.util.*;
import java.io.*;
class Copier{
	public static void main(String[] args)
	{
		byte[] buffer = new byte[32*1024];
		
		try{
		
		FileInputStream fis = new FileInputStream(args[0]);
		BufferedInputStream bis = new BufferedInputStream(fis);
		int numBytes = bis.read(buffer);
		FileOutputStream fos = new FileOutputStream(args[1]);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		while(numBytes>0)
		{
			bos.write(buffer, 0, numBytes);
			numBytes=bis.read(buffer);
		}
		bis.close();
		bos.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
}


