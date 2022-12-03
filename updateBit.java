import java.util.*;
class updateBit
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any operator digit...");
		int oper = in.nextInt();

		int n =5;
		int pos=2;
		int bitMask=1<<pos;

		if(oper==1)
		{
			int number = bitMask | n;
			System.out.println(number);
		}else{
			int notBitMask = ~(bitMask);
			int num = notBitMask & n;
			System.out.println(num);
		}
	}
}