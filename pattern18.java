import java.util.Scanner;
class pattern18 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row=sc.nextInt();
		System.out.println("Enter the coloumns");
		int col=sc.nextInt();
		int num=col+1;
		for (int i=1;i<=row ;i++ )//
		{
	
			for (int j=1;j<=col;j++ )
			{	
				if (i+j>=num)
				{
					System.out.print("*");

				}
				else{
					System.out.print(" ");
				}
			
			}
			for (int k=1;k<i ;k++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
