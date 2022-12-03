import java.util.*;
class clearBit
{
	public static void main(String[]args)
	{
		int n=5;
		int pos=2;
		int bitMask = 1<<pos;
		int notBitMask = ~(bitMask);
		int numbers = notBitMask & n;
		System.out.println(numbers);
	}
}