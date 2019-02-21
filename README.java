import java.io.*;
import java.util.*;
class Numreverse
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int sum=0,n;
	while(a!=0)
	{
		n=a%10;
		sum=sum*10+n;
		a=a/10;
	}
   System.out.println(sum);
   }
}
