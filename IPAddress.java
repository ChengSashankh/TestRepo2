// Sashankh Chengavalli Kumar - A0162363J
// Assignment 0 Exercise 1
// Tutorial Group 9
import java.util.*;
import java.lang.Math;

	class IPAddress{
		public static void main(String args[])
		{
			int[] IP = new int[32];
			int i = 0;
			double value=0;
			Scanner sc = new Scanner(System.in);
//			System.out.println(args[0]);

			for(i=0;i<32;i++)
			{
				if(args[0].charAt(i)=='0')
				{
					IP[i]=0;
				}
				else
				{
					IP[i]=1;
				}
			}

			for(i=0;i<32;i++)
			{
				if(i%8==0&&i!=0)
				{
					if(i==8)
						System.out.print((int)value);
					else
						System.out.print("."+ (int)value);
					value = 0;
				}

				value = value + IP[i]* Math.pow(2,7- i%8);
			}
			System.out.println("." + (int) value);


			}
		}
