import java.util.Scanner;

  class Basic{
	public static void main(String args[])
	{
								// Using Scanner to capture input
	Scanner input = new Scanner (System.in);
	int ch,num,test=0,i,j=0;
	int n,m,s=0,rem,rev;
	int a,fac = 1,c;
	System.out.println("Menu driven program to find:");	// Menu driven program for various operations on a number
	while(true)
	 {
		System.out.println("1: To find Prime number");
		System.out.println("2: To find if the number is even or odd");
		System.out.println("3: To find whether given number is palindrome");
		System.out.println("4: To find out factorial of a number");
		System.out.println("Enter your choice:");
		ch = input.nextInt();				// Taking input from user
		 switch(ch)
		  {
			case 1:
			System.out.println("Enter any number:");
			num = input.nextInt();
			test = num/2;
			if(num==0 | num==1)
			 {
				System.out.println("Entered number is not prime number "+ num);
			 }
			 else{
				for(i=2; i<=test; i++)
				{
				   if(num%i == 0)
				     {
					System.out.println("Entered number is composite " + num);
					j = 1;
					break;
				     }
				}
			        if(j==0){
					  System.out.println("Entered number is prime " + num);
					}
                             }
			   break;

			   case 2:
			   System.out.println("Enter any number:");
			   n = input.nextInt();
			   if(n%2 == 0)
				{
					System.out.println("The entered number"+ n + "is even");
				}
			   else{
					
					System.out.println("The entered number"+ n + "is odd");
				}
			   break;

			   case 3:
			   System.out.println("Enter any number:");
			   m = input.nextInt();	
			   rev = m;
			   while(m>0)
				{
					rem = m%10;
					s = (s*10)+rem;
					m = m/10;
				}
		           if(rev==s)
				{
					System.out.println("It is a palindrome");
				}

			   else{
					System.out.println("It is not a palindrome");
			       }
			   break;

			   case 4:
			   System.out.println("Enter any number:");
			   a = input.nextInt();
			   for(c=1; c<=a; c++)
				{
					fac = fac*c;
				}
				System.out.println("Factorial of number is "+ fac );	
	                   break;

			   default: System.out.println("Please enter valid choice:");
		   }
	   }
     }
}