package assignments;
import java.util.Scanner;
public class exercise7 {
	static boolean checkNumber(int number)
	{
		boolean flag = false;
		int currentNum=number%10;
		number=number/10;
		while(number>0)
		{
		if(currentNum>=number%10)
		{
			flag=true;
			break;
		}
		else
		{
			flag=false;
			break;
		}
		}
		return flag;
	}

public static void main(String[] args) {
	
	int number;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the number :");
	number=obj.nextInt();
	System.out.println(checkNumber(number));
	

}
}
