import java.util.*;
class setBit
{
	public static void main(String[]args)
	{
		int n = 5;   //0110
		int pos=1;
		int bitMask = 1<<pos;
		int number = bitMask | n;
		System.out.println(number);
	}
}