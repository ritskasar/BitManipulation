import java.util.*;
class getBit
{
	public static void main(String[]args)
	{
		int n=5;  //0101
		int pos=2;
		int bitMask = 1<<pos;

		if((bitMask & n)==0)
		{
			System.out.println("Bit was zero...");
		}else{
			System.out.println("Bit was one...");
		}
	}
}